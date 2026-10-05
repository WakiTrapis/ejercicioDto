package com.salesianostriana.dam.ejercicio_dto.ejercicio2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Categoria {

    private Long id;
    private String nombreCategoria;

}
