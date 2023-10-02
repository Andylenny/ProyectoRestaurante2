
package proyectorestaurante.AccesoAdatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import proyectorestaurante.entidades.Producto;


public class ProductoData {
    
    private Connection conexion;

    public ProductoData(Connection conexion) {
        this.conexion = conexion;
    }


}
