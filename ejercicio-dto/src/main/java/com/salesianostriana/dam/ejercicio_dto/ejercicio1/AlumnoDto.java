package com.salesianostriana.dam.ejercicio_dto.ejercicio1;

public record AlumnoDto (

    String nombre,
    String apellidos,
    String email,
    String curso,
    String direccion
){
    public static AlumnoDto of(Alumno a) {
        String apellidosCompletos = (a.getApellido1() != null ? a.getApellido1() : "")
                + " " + (a.getApellido2() != null ? a.getApellido2() : "");

        String nombreCurso = a.getCurso() != null ? a.getCurso().getNombre() : null;
        String direccionTexto = a.getDireccion() != null ? a.getDireccion().getTipoVia()
                + " " + a.getDireccion().getLinea1() + ", " + a.getDireccion().getPoblacion() : null;

        return new AlumnoDto(
                a.getNombre(),
                apellidosCompletos,
                a.getEmail(),
                nombreCurso,
                direccionTexto);

    }
}







