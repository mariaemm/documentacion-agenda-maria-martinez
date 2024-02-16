package modelo.dao;

import modelo.javabean.Contacto;

import java.util.ArrayList;

public interface AgendaDeContactosDao {

    // IMPORTAMOS CONTACTO
    Boolean AltaContacto (Contacto contacto);
    Boolean EliminarContacto (Contacto contacto);
    Contacto buscarUno(String nombre);
    Contacto buscarTelefono(String telefono);
    Contacto buscarEmail(String email);
    ArrayList<Contacto> buscarContactosPorTresPrimeros (String nombre);
    Boolean cambiarDatos (Contacto contacto);
    ArrayList<Contacto> ContactosPorEmpresa (String empresa);

}
