package com.salesianostriana.dam.ejercicio_dto.ejercicio1;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alumno {


    private Long id;

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;
    private Direccion direccion;
    private Curso curso;



}
