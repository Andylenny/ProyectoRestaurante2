package proyectorestaurante.AccesoAdatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectorestaurante.entidades.Mesa;
import proyectorestaurante.entidades.Mesero;

public class MesaData {

    private Connection con = null;

    public MesaData() {
        con = Conexion.getConexion();
    }

    public void guardarMesa(Mesa mesa) {
        String sql = "INSERT INTO `mesa`(`idMesa`, `capacidad`, `estado`, `numeroMesa`) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getIdMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            ps.setInt(4, mesa.getNumeroMesa());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mesa.setIdMesa(1);
                JOptionPane.showMessageDialog(null, "Mesa Registrada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa");

        }

    }

    public void eliminarMesa(int id) {
        String sql = "DELETE FROM mesa WHERE idMesa = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Mesa vacia");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa");

        }
    }

    public void eliminarMeseroLogico(int id) {
        String sql = "UPDATE mesa SET estado = 0 WHERE idMesa = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Mesa en reparacion");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder al eliminar mesa");

        }
    }

    public void modificarMesa(Mesa mesa) {
        String sql = "UPDATE mesa SET capacidad=?,estado=?,numeroMesa=? "
                + "WHERE idMesa=?";

        try {

            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getCapacidad());
            ps.setBoolean(2, mesa.isEstado());
            ps.setInt(3, mesa.getNumeroMesa());
            ps.setInt(4, mesa.getIdMesa());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mesa modificada con exito");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al modificar datos del mesero");
        }

    }

    public Mesa buscarMesaporId(int id) {
        String sql = "SELECT capacidad,estado,numeroMesa FROM mesa WHERE idMesa=? AND estado =1";
        Mesa mesa = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setNumeroMesa(rs.getInt("numeroMesa"));
                mesa.setEstado(true);
                JOptionPane.showMessageDialog(null, "Mesa encontrada");

            } else {
                JOptionPane.showMessageDialog(null, "No existe la mesa");
            }
            ps.close();

        } catch (SQLException ex) {
           // JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa");
        }
        return mesa;

    }

    public List<Mesa> listarMesas() {
        String sql = "SELECT idMesa,capacidad,estado,numeroMesa FROM mesa  WHERE estado=1";
        ArrayList<Mesa> mesas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("IdMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setNumeroMesa(rs.getInt("numeroMesa"));
                mesa.setEstado(true);

                mesas.add(mesa);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return mesas;
    }

}
