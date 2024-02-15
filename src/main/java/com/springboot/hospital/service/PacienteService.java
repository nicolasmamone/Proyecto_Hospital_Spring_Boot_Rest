package com.springboot.hospital.service;

import com.springboot.hospital.dto.CitaDTO;
import com.springboot.hospital.dto.PacienteDTO;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface PacienteService {

    List<PacienteDTO> getAllPacientes();

    Optional<PacienteDTO> getPacienteById(Long pacienteId);

    PacienteDTO createPaciente(PacienteDTO pacienteDTO);

    PacienteDTO updatePaciente(Long pacienteId, PacienteDTO pacienteDTO);

    void deletePaciente(Long pacienteId);

    Collection<CitaDTO> getCitasByPacienteId(Long pacienteId);
}
