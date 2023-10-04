
package proyectorestaurante;

import java.sql.Connection;
import proyectorestaurante.AccesoAdatos.Conexion;
import proyectorestaurante.AccesoAdatos.ProductoData;
import proyectorestaurante.entidades.Producto;


public class ProyectoRestaurante {

    public static void main(String[] args) {
        Connection conexion=Conexion.getConexion();
        Producto prod = new Producto(8,"Ñoquis",2,20,1,true);
//        /*Producto prod2 = new Producto("Ravioles",130,10,2,true);*/
        ProductoData proddata = new ProductoData();
        
        /*proddata.guardarProducto(prod);*/
        /* proddata.guardarProducto(prod);*/
        /*proddata.eliminarProducto(2);*/
//        proddata.modificarProducto(prod);
         Producto productoEncontrado = proddata.buscarProductoporCodigo(1);
        
        
        
    }

}
