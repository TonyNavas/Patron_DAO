package org.geronimo;

public class Cliente {
    private String dni;
    private String nombre;
    private Fecha fechaNac;
    private String direccion;
    private String tfno;

    public Cliente(String p_dni, String p_nombre, Fecha p_fecnac, String p_direccion,
                   String p_tfno) {
        dni = p_dni;
        nombre = p_nombre;
        fechaNac = p_fecnac;
        direccion = p_direccion;
        tfno = p_tfno;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTfno() {
        return tfno;
    }

    public void setTfno(String tfno) {
        this.tfno = tfno;
    }
}
