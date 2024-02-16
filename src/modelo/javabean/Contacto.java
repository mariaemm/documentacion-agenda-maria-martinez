package modelo.javabean;

import java.util.Objects;
/*
 * AQUI ESTAN TODAS LAS CLASES DE CONTACTO, CON LOS CONSTRUCTORES(CON T0DO Y SIN NADA),
 * GETTERS AND SETTERS, TO STRING Y EL HASCODE SOLO DE  nombre
 * */
public class Contacto {

    // STRINGS
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String empresa;

    // - 1 CONSTRUCTORS USING FIELDS --- ALL

    public Contacto(String nombre, String apellido, String telefono, String email, String empresa) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.empresa = empresa;
    }

    // - 2 CONSTRUCTORS USING FIELDS --- VACIO

    public Contacto() {
        super();
    }

    // - 3 GETTER AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    // - 4  TO STRING
    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", email=" + email
                + ", empresa=" + empresa + "]";
    }

    // - 5 HASHCODE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

}
