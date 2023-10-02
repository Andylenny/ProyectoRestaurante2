
package proyectorestaurante;

import java.sql.Connection;
import proyectorestaurante.AccesoAdatos.Conexion;


public class ProyectoRestaurante {

    public static void main(String[] args) {
        Connection conexion=Conexion.getConexion();
        System.out.println("hola");
    }

}
