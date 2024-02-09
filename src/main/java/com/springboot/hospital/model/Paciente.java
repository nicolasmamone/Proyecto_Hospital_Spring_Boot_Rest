package com.springboot.hospital.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Temporal(TemporalType.DATE)
    //para que cuando guardemos esta fecha solamente se guarde en formato DATE
    private Date fechaNacimiento;

    private boolean enfermedad;

    @OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY) // paciente --> hace referencia al campo en la otra clase relacionada
    private Collection<Cita> citas;

}
