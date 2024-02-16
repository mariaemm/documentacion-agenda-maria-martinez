package modelo.dao;

import modelo.javabean.Contacto;

import.java.util.ArrayList;

/*
 * METODOS EN EL QUE DAMOS DE ALTA A UN CONTACTO EN LA AGENDA, ELIMINAMOS, BUSCAMOS  O CAMBIAMOS EL CONTACTO
 */


public interface AgendaDeContactosDao {

    // IMPORTAMOS CONTACTO
    boolean AltaContacto (Contacto contacto);
    boolean EliminarContacto (Contacto contacto);
    Contacto buscarUno(String nombre);
    Contacto buscarTelefono(String telefono);
    Contacto buscarEmail(String email);
    ArrayList<Contacto> buscarContactosPorTresPrimeros (String nombre);
    boolean cambiarDatos (Contacto contacto);
    ArrayList<Contacto> ContactosPorEmpresa (String empresa);
    ArrayList<Contacto>BuscarTodos(Contacto contacto);

}
