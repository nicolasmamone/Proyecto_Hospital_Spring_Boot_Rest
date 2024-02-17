package com.springboot.hospital.controller;

import com.springboot.hospital.service.CitaService;
import com.springboot.hospital.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @Autowired
    private MedicoService medicoService;
}
