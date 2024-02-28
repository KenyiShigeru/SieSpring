package sie.verde.modelo;

import lombok.Data;

@Data
public class Alumno
{
    private int idAlumno;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String fechaNac;
    private String telefono;
    private String email;
    private String domicilio;
    private char estado;

}
