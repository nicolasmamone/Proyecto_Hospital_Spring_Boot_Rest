package com.springboot.hospital.controller;

import com.springboot.hospital.dto.CitaDTO;
import com.springboot.hospital.dto.MedicoDTO;
import com.springboot.hospital.model.Medico;
import com.springboot.hospital.service.MedicoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping()
    public ResponseEntity<List<MedicoDTO>> listarMedicos(){
        List<MedicoDTO> medicos = medicoService.getAllMedicos();
        return new ResponseEntity<>(medicos, HttpStatus.OK);
    }

    @GetMapping("/{medicoId}")
    public ResponseEntity<MedicoDTO> obtenerMedicoPorId(@PathVariable Long medicoId){
        return medicoService.getMedicoById(medicoId)
                .map(medico -> new ResponseEntity<>(medico, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<MedicoDTO> crearMedico(@RequestBody MedicoDTO medicoDTO){
        MedicoDTO createdMedico = medicoService.createMedico(medicoDTO);
        return new ResponseEntity<>(createdMedico, HttpStatus.CREATED);
    }

    @PutMapping("/{medicoId}")
    public ResponseEntity<MedicoDTO> actualizarMedico(@PathVariable Long medicoId, @RequestBody MedicoDTO medicoDTO){
        MedicoDTO updateMedico = medicoService.updateMedico(medicoId,medicoDTO);
        if (updateMedico != null){
            return new ResponseEntity<>(updateMedico, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{medicoId}")
    public ResponseEntity<Void> eliminarMedico(@PathVariable Long medicoId){
        medicoService.deleteMedico(medicoId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{medicoId}/citas")
    public ResponseEntity<Collection<CitaDTO>> listarCitasPorMedicoId(@PathVariable Long medicoId){
        Collection<CitaDTO> citas = medicoService.getCitasByMedicoId(medicoId);
        if (citas != null){
            return new ResponseEntity<>(citas, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/especialidad/{especialidad}")
    public ResponseEntity<List<MedicoDTO>> listarMedicosPorEspecialidad(@PathVariable String especialidad){
        List<MedicoDTO> medicos = medicoService.getMedicosByEspecialidad(especialidad);
        return new ResponseEntity<>(medicos, HttpStatus.OK);
    }


}
