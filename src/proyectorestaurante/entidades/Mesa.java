
package proyectorestaurante.entidades;


public class Mesa {
    private int idMesa;
    private int idReserva;
    private int idMesero;
    private int idPedido;
    private int capacidad;
    private boolean estado;

    public Mesa() {
    }

    public Mesa(int idMesa, int idReserva, int idMesero, int idPedido, int capacidad, boolean estado) {
        this.idMesa = idMesa;
        this.idReserva = idReserva;
        this.idMesero = idMesero;
        this.idPedido = idPedido;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Mesa(int idReserva, int idMesero, int idPedido, int capacidad, boolean estado) {
        this.idReserva = idReserva;
        this.idMesero = idMesero;
        this.idPedido = idPedido;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesa{" + "idMesa=" + idMesa + ", idReserva=" + idReserva + ", idMesero=" + idMesero + ", idPedido=" + idPedido + ", capacidad=" + capacidad + ", estado=" + estado + '}';
    }
    
    
}
