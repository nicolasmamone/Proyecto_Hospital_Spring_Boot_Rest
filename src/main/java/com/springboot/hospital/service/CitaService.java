package com.springboot.hospital.service;

import com.springboot.hospital.dto.CitaDTO;
import com.springboot.hospital.model.Cita;
import com.springboot.hospital.model.StatusCita;

import java.util.List;
import java.util.Optional;

public interface CitaService {

    List<CitaDTO> getAllCitas();

    Optional<CitaDTO> getCitaById(Long id);

    CitaDTO createCita(CitaDTO citaDTO, Long pacienteId, Long medicoId);

    CitaDTO updateCita(Long id, CitaDTO citaDTO);

    void deleteCita(Long id);

    List<CitaDTO> getCitasByPacienteId(Long pacienteId);
    List<CitaDTO> getCitasByMedicoId (Long medicoId);
    List<CitaDTO> getCitasByStatusCita (StatusCita statusCita);


}
