package com.salesianostriana.dam.ejercicio_dto.ejercicio2;

import java.util.List;

public record ProductoDto (

    String nombre,
    double pvp,
    List<String> imagenes,
    Categoria categoria){

    String nombreCategoria= categoria.;
    public Product to(){
        return Product.builder()
                .nombre(nombre)
                .pvp(pvp)
                .imagenes(imagenes)
                .categoria()
                .build();
    }


}
