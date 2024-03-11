package com.springboot.hospital.controller;

import com.springboot.hospital.dto.CitaDTO;
import com.springboot.hospital.dto.MedicoDTO;
import com.springboot.hospital.dto.PacienteDTO;
import com.springboot.hospital.model.Cita;
import com.springboot.hospital.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ResponseEntity<List<PacienteDTO>> listarPacientes(){
        List<PacienteDTO> pacientes = pacienteService.getAllPacientes();
        return new ResponseEntity<>(pacientes, HttpStatus.OK);
    }

    @GetMapping("/{pacienteId}")
    public ResponseEntity<PacienteDTO> obtenerPacientePorId(@PathVariable Long pacienteId){
        return pacienteService.getPacienteById(pacienteId)
                .map(paciente -> new ResponseEntity<>(paciente, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<PacienteDTO> crearPaciente(@RequestBody PacienteDTO pacienteDTO){
       PacienteDTO createdPaciente = pacienteService.createPaciente(pacienteDTO);
       return new ResponseEntity<>(createdPaciente, HttpStatus.CREATED);
    }

    @PutMapping("/{pacienteId}")
    public ResponseEntity<PacienteDTO> actualizarPaciente(@PathVariable Long pacienteId, @RequestBody PacienteDTO pacienteDTO){
        PacienteDTO updatePaciente = pacienteService.updatePaciente(pacienteId, pacienteDTO);
        if (updatePaciente != null){
            return new ResponseEntity<>(updatePaciente, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{pacienteId}")
    public ResponseEntity<Void> eliminarPaciente(@PathVariable Long pacienteId){
        pacienteService.deletePaciente(pacienteId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{pacienteId}/citas")
    public ResponseEntity<Collection<CitaDTO>> listarCitasPorPacienteId(@PathVariable Long pacienteId){
        Collection<CitaDTO> citas = pacienteService.getCitasByPacienteId(pacienteId);
        return new ResponseEntity<>(citas, HttpStatus.OK);
    }
}
