
package proyectorestaurante.entidades;


public class Producto {
    private int idProducto;
    private int idPedido;
    private String nombreProducto;
    private int precio;
    private int stock;
    private int codigo;
    private boolean estado;

    public Producto() {
    }

    public Producto(int idProducto, int idPedido, String nombreProducto, int precio, int stock, int codigo, boolean estado) {
        this.idProducto = idProducto;
        this.idPedido = idPedido;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.codigo = codigo;
        this.estado = estado;
    }

    public Producto(int idPedido, String nombreProducto, int precio, int stock, int codigo, boolean estado) {
        this.idPedido = idPedido;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.codigo = codigo;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", idPedido=" + idPedido + ", nombreProducto=" + nombreProducto + ", precio=" + precio + ", stock=" + stock + ", codigo=" + codigo + ", estado=" + estado + '}';
    }
    



}
