package com.salesianostriana.dam.ejercicio_dto.ejercicio1;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Curso {

    private Long id;
    private String nombre;
    private String tipo;
    private String tutor;
    private String aula;


}
