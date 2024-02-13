package com.springboot.hospital.service.impl;

import com.springboot.hospital.dto.CitaDTO;
import com.springboot.hospital.dto.PacienteDTO;
import com.springboot.hospital.service.PacienteService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteServiceImpl implements PacienteService {
    @Override
    public List<PacienteDTO> getAllPacientes() {
        return null;
    }

    @Override
    public Optional<PacienteDTO> getPAcienteById(Long pacienteId) {
        return Optional.empty();
    }

    @Override
    public PacienteDTO createPaciente(PacienteDTO pacienteDTO) {
        return null;
    }

    @Override
    public PacienteDTO updatePaciente(Long pacienteId, PacienteDTO pacienteDTO) {
        return null;
    }

    @Override
    public void deletePaciente(Long pacienteId) {

    }

    @Override
    public Collection<CitaDTO> getCitasByPacienteId(Long pacienteId) {
        return null;
    }
}
