package testing;
import modelo.dao.AgendaDeContactosDaoImplArrayList;

public class TestAgendaContactosDao {

/*
*  EN ESTE ARCHIVO , HACEMOS LOS TEST : podemos
*
* */
    public class TestAgendaContactosDao {

        private static AgendaDeContactosDaoImplArrayList adao = new AgendaDeContactosDaoImplArrayList();


        static {
            adao = new AgendaDeContactosDaoImplArrayList();
        }


        public static void main (String[]args) {

            buscarUno();
            buscarContactosPorTresPrimeros();
            buscarTelefono();
            ContactosPorEmpresa();
            cambiarDatos();
            AltaContacto();

        }
        
        public static void buscarUno() {
            System.out.println("BUSCAR 1 : " + adao.buscarUno("lara"));
        }
        public static void buscarContactosPorTresPrimeros() {
            System.out.println("BUSCAR POR 3 PRIMEROS " + adao.buscarContactosPorTresPrimeros("jai"));
        }
        public static void buscarTelefono() {
            System.out.println("BUSCAR TELEFONO : " + adao.buscarTelefono("643920594"));

        }
        public static void ContactosPorEmpresa() {
            System.out.println("CONTACTO-EMPRESA : " + adao.ContactosPorEmpresa("RFDA"));
        }

        public static void  cambiarDatos() {
            Contacto contacto1 = new Contacto("george","Thomon","667500060","georgeth@gmail.com","RRRR");
            System.out.println("CAMBIO A GEORGE : " + adao.cambiarDatos(contacto1));

            System.out.println(contacto1);
        }

        public static void AltaContacto() {
            Contacto contacto1 = new Contacto ("tomas","Tomasin","64967850693","tomas@gmail.com","PPT");


            System.out.println("contacto 1  : " + adao.AltaContacto(contacto1));
            System.out.println("contacto 2  : " + adao.AltaContacto(contacto2));


            System.out.println(contacto1);

        }



    }



}
