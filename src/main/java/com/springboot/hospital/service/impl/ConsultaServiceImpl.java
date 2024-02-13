package com.springboot.hospital.service.impl;

import com.springboot.hospital.dto.ConsultaDTO;
import com.springboot.hospital.model.Cita;
import com.springboot.hospital.service.ConsultaService;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@Service
public class ConsultaServiceImpl implements ConsultaService {
    @Override
    public List<ConsultaDTO> getAllConsultas() {
        return null;
    }

    @Override
    public Optional<ConsultaDTO> getConsultaById(Long consultaId) {
        return Optional.empty();
    }

    @Override
    public ConsultaDTO createConsulta(ConsultaDTO consultaDTO) throws ParseException {
        return null;
    }

    @Override
    public ConsultaDTO updateConsulta(Long consultaId, ConsultaDTO consultaDTO) {
        return null;
    }

    @Override
    public void deleteConsulta(Long consultaId) {

    }

    @Override
    public List<ConsultaDTO> getConsultasByInformeContaining(String searchTerm) {
        return null;
    }

    @Override
    public List<ConsultaDTO> getConsultasByCita(Cita cita) {
        return null;
    }

    @Override
    public List<ConsultaDTO> getConsultasByCita(Long citaId) throws ParseException {
        return null;
    }
}
