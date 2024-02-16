package modelo.dao;

import java.util.ArrayList;
import modelo.javabean.Contacto;
//implementamos
public class AgendaDeContactosDaoImplArrayList implements AgendaDeContactosDao {



    private String nombreDeAgenda;
    private ArrayList<Contacto> contactos;


    public AgendaDeContactosDaoImplArrayList(){

        nombreDeAgenda = "agenda nueva";
        contactos = new ArrayList<>();

        cargardatos(); }

    /*
     * CREAMOS UNA LISTA CON DATOS QUE USAREMOS DESPUES
     * */
    private void cargardatos() {

        contactos.add(new Contacto ("alba","Gomez","649678455","alba@gmail.com","ZZZF"));
        contactos.add(new Contacto ("juan","Lopez","643920594","juan@gmail.com","YLDO"));
        contactos.add(new Contacto ("lara","Valverde","619785243","lara@gmail.com","RFDA"));
        contactos.add(new Contacto ("ana","Fernandez","649012455","alba@gmail.com","JKLM"));
        contactos.add(new Contacto ("george","Gomez","668599060","george@gmail.com","STRA"));
    }


    // ---------------- IMPLEMENTAR METODOS DE AGENDA..ARRAYLIST
    @Override
    public Boolean AltaContacto(Contacto contacto) { // PARA CONTACTOS Y DAR DE ALTA
        if (!contactos.contains(contacto)) {
            contactos.add(contacto);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Boolean EliminarContacto(Contacto contacto) {  // PARA ELIMINAR
        contactos.remove(contacto);
        return true;
    }

    @Override
    public Contacto buscarUno(String nombre) {
        Contacto contacto = new Contacto ();
        contacto.setNombre(nombre);

        int pos= contactos.indexOf(contacto);

        if (pos == -1) {
            return null;
        }else {
            return contactos.get(pos);
        }
    }

    @Override
    public Contacto buscarTelefono(String telefono) { // INFO HALLADA
        int infoHallada = -1;

        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getTelefono()== telefono) {
                infoHallada = i;
                break;
            }
        }
        if (infoHallada == -1)
            return null;
        else
            return contactos.get(infoHallada);
    }

    @Override
    public Contacto buscarEmail(String email) { //BUSCAMOS EMAIL
        int infoHallada = -1;

        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getEmail()== email) { //CAMBIAMOS  POR .GETEMAIL
                infoHallada = i;
                break;
            }
        }
        if (infoHallada == -1)
            return null;
        else
            return contactos.get(infoHallada);
    }

    @Override
    public ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre) { // PARA BUSCAR 3 PRIMEROS

        ArrayList<Contacto> aux = new ArrayList<>(); // CREAMOS UN ARRAY

        for (Contacto es : contactos) {
            if (nombre.substring(0,3).equalsIgnoreCase(es.getNombre().substring(0,3) ) ) // para que sean 3
            { aux.add(es);
            }
        }return aux;
    }


    public Boolean cambiarDatos(Contacto contacto) { //  PARA CAMBIAR EN LA POS LOS DATOS
        int pos = contactos.indexOf(contacto);
        if (pos == -1) {
            return false;
        }else {
            contactos.set(pos, contacto);
        }
        return true;
    }

    @Override
    public ArrayList<Contacto> ContactosPorEmpresa(String empresa) { // para
        ArrayList<Contacto> aux = new ArrayList<>();
        for (Contacto es : contactos) {
            if(es.getEmpresa() == empresa) {
                aux.add(es);
            }

        }
        return aux;
    }



}
