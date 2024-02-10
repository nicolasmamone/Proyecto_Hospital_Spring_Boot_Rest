package com.springboot.hospital.mapper;

import com.springboot.hospital.dto.CitaDTO;
import com.springboot.hospital.dto.ConsultaDTO;
import com.springboot.hospital.model.Cita;
import com.springboot.hospital.model.Consulta;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Component
public class ConsultaMapper {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public ConsultaDTO toDTO(Consulta consulta){

        ConsultaDTO consultaDTO = new ConsultaDTO();
        consultaDTO.setId(consulta.getId());
        consultaDTO.setFechaConsulta(dateFormat.format(consulta.getFechaConsulta())); //convertimos de Date a String y lo seteamos en consultaDTO
        consultaDTO.setInforme(consulta.getInforme());

        if (consulta.getCita() != null){
            Cita cita = consulta.getCita();
            CitaDTO citaDTO = new CitaDTO();

            citaDTO.setId(cita.getId());
            citaDTO.setFecha(dateFormat.format(cita.getFecha()));
            citaDTO.setCancelado(cita.isCancelado());
            citaDTO.setStatusCita(cita.getStatusCita().toString());
            citaDTO.setPacienteId(cita.getPaciente().getId()); // ??
            citaDTO.setPacienteId(cita.getPaciente().getId());  // ??

            consultaDTO.setCitaDTO(citaDTO);
        }
        return consultaDTO;
    }

    public Consulta toEntity(ConsultaDTO consultaDTO) throws ParseException {
        Consulta consulta = new Consulta();
        consulta.setId(consultaDTO.getId());
        consulta.setFechaConsulta(dateFormat.parse(consultaDTO.getFechaConsulta())); // .parse --> para pasar de String a Date
        consulta.setInforme(consultaDTO.getInforme());

        if(consultaDTO.getCitaDTO() != null){
            CitaDTO citaDTO = consultaDTO.getCitaDTO();
            Cita cita = new Cita();
            cita.setId(citaDTO.getId());
            consulta.setCita(cita);
        }
        return null;
    }
}
