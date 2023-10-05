package proyectorestaurante;

import java.sql.Connection;
import proyectorestaurante.AccesoAdatos.Conexion;
import proyectorestaurante.AccesoAdatos.MeseroData;
import proyectorestaurante.AccesoAdatos.ProductoData;
import proyectorestaurante.entidades.Mesero;
import proyectorestaurante.entidades.Producto;

public class ProyectoRestaurante {

    public static void main(String[] args) {
        Connection conexion = Conexion.getConexion();
//        Producto produ = new Producto(8,"Ñoquis",2,20,1,true);
////        /*Producto prod2 = new Producto("Ravioles",130,10,2,true);*/
//        ProductoData proddata = new ProductoData();

        /*proddata.guardarProducto(prod);*/
 /*proddata.eliminarProducto(2);*/
//        proddata.modificarProducto(prod);
//         Producto productoEncontrado = proddata.buscarProductoporCodigo(1);
//Metodo listar productos
        /* for(Producto prod : proddata.listarProductos()){
            System.out.println(prod.getNombreProducto());
            System.out.println(prod.getPrecio());
            System.out.println(prod.getStock());
            
        
    }*/
        //MeseroData
        Mesero mesero1 = new Mesero(2, "Juan Jose", "Lopez", 33666333, true);
        MeseroData md = new MeseroData();

        //  md.guardarMesero(mesero1);
        //md.modificarMesero(mesero1);
//        Mesero meseroEncontado = md.buscarMeseroporDni(33666333);
//        System.out.println("idMesero: " + mesero1.getIdMesero());
//        System.out.println("apellido: " + mesero1.getApellido());
//        System.out.println("nombre: " + mesero1.getNombre());
//        System.out.println("dni: " + mesero1.getDni());
        
        
        for(Mesero ms : md.listarMeseros()){
            System.out.println(ms.getNombre());
            System.out.println(ms.getApellido());
            System.out.println(ms.getDni());
            
         
        }
    }
}
