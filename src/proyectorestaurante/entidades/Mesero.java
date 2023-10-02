
package proyectorestaurante.entidades;


public class Mesero {
    private int idMesero;
    private int idMesa;
    private int idPedido;
    private String nombre;
    private String apellido;
    private int dni;
    private boolean estado;

    public Mesero() {
    }

    public Mesero(int idMesero, int idMesa, int idPedido, String nombre, String apellido, int dni, boolean estado) {
        this.idMesero = idMesero;
        this.idMesa = idMesa;
        this.idPedido = idPedido;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estado = estado;
    }

    public Mesero(int idMesa, int idPedido, String nombre, String apellido, int dni, boolean estado) {
        this.idMesa = idMesa;
        this.idPedido = idPedido;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estado = estado;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesero{" + "idMesero=" + idMesero + ", idMesa=" + idMesa + ", idPedido=" + idPedido + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", estado=" + estado + '}';
    }
    

    
   
    

}
