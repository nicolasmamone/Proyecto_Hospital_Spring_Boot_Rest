package com.springboot.hospital.service.impl;

import com.springboot.hospital.dto.CitaDTO;
import com.springboot.hospital.model.Cita;
import com.springboot.hospital.model.StatusCita;
import com.springboot.hospital.repository.CitaRepository;
import com.springboot.hospital.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    CitaRepository citaRepository;


    @Override
    public List<CitaDTO> getAllCitas() {
        return null;
    }

    @Override
    public Optional<CitaDTO> getCitaById(Long id) {
        return Optional.empty();
    }

    @Override
    public CitaDTO createCita(CitaDTO citaDTO, Long pacienteId, Long medicoId) {
        return null;
    }

    @Override
    public CitaDTO updateCita(Long id, CitaDTO citaDTO) {
        return null;
    }

    @Override
    public void deleteCita(Long id) {

    }

    @Override
    public List<CitaDTO> getCitasByPacienteId(Long pacienteId) {
        return null;
    }

    @Override
    public List<CitaDTO> getCitasByMedicoId(Long medicoId) {
        return null;
    }

    @Override
    public List<CitaDTO> getCitasByStatusCita(StatusCita statusCita) {
        return null;
    }
}
