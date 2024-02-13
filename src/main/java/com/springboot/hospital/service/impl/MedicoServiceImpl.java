package com.springboot.hospital.service.impl;

import com.springboot.hospital.dto.CitaDTO;
import com.springboot.hospital.dto.MedicoDTO;
import com.springboot.hospital.service.MedicoService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class MedicoServiceImpl implements MedicoService {
    @Override
    public List<MedicoDTO> getAllMedicos() {
        return null;
    }

    @Override
    public Optional<MedicoDTO> getMedicoById(Long id) {
        return Optional.empty();
    }

    @Override
    public MedicoDTO createMedico(MedicoDTO medicoDTO) {
        return null;
    }

    @Override
    public MedicoDTO updateMedico(Long id, MedicoDTO medicoDTO) {
        return null;
    }

    @Override
    public Collection<CitaDTO> getCitasByMedicoId(Long medicoId) {
        return null;
    }

    @Override
    public List<MedicoDTO> getMedicosByEspecialidad() {
        return null;
    }
}
