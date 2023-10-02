
package proyectorestaurante.entidades;

import java.time.LocalDate;


public class Reserva {
    private int idReserva;
    private int idMesa;
    private String nombreCliente;
    private int dni;
    private LocalDate fecha;
    private LocalDate hora;
    private boolean estado;

    public Reserva() {
    }

    public Reserva(int idReserva, int idMesa, String nombreCliente, int dni, LocalDate fecha, LocalDate hora, boolean estado) {
        this.idReserva = idReserva;
        this.idMesa = idMesa;
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public Reserva(int idMesa, String nombreCliente, int dni, LocalDate fecha, LocalDate hora, boolean estado) {
        this.idMesa = idMesa;
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", idMesa=" + idMesa + ", nombreCliente=" + nombreCliente + ", dni=" + dni + ", fecha=" + fecha + ", hora=" + hora + ", estado=" + estado + '}';
    }

    
    
    
    
    
   

}
