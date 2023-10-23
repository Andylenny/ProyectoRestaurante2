/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorestaurante.vistas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import proyectorestaurante.AccesoAdatos.MesaData;
import proyectorestaurante.AccesoAdatos.PedidoData;
import proyectorestaurante.AccesoAdatos.ProductoData;
import proyectorestaurante.entidades.Mesa;
import proyectorestaurante.entidades.Pedido;
import proyectorestaurante.entidades.Producto;

/**
 *
 * @author pc
 */
public class PedidoMesaVista extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    /**
     * Creates new form PedidoMesaVista
     */
    private MesaData mesa = new MesaData();
    private PedidoData pedidoData= new PedidoData();
    private ProductoData productoData=new ProductoData();
    private Mesa mesa1 = new Mesa();
    private ArrayList<Mesa> listaMesas;
    private ArrayList<Pedido> listaPedidos;
    public PedidoMesaVista() {
        initComponents();
        armarCabecera();
        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Hora = new javax.swing.JLabel();
        horaIni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        minutoIni = new javax.swing.JTextField();
        Hora1 = new javax.swing.JLabel();
        horaFin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        minutoFin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCfecha = new com.toedter.calendar.JDateChooser();
        combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        Hora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Hora.setText("Hora:");

        horaIni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        horaIni.setText("00");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText(":");

        minutoIni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minutoIni.setText("00");

        Hora1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Hora1.setText("Hora:");

        horaFin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        horaFin.setText("00");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText(":");

        minutoFin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minutoFin.setText("00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Fecha:");

        combo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mesa:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Hora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(horaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minutoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(Hora1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(horaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minutoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(horaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minutoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Hora1)
                        .addComponent(jButton1))
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(horaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minutoIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Hora)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_comboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mesa1=(Mesa) combo.getSelectedItem();
        LocalDate fechaPedido=jCfecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalTime Ini=LocalTime.of(Integer.parseInt(horaIni.getText()), Integer.parseInt(minutoIni.getText()));
        LocalTime Fin=LocalTime.of(Integer.parseInt(horaFin.getText()), Integer.parseInt(minutoFin.getText()));
        listaPedidos=(ArrayList<Pedido>) pedidoData.BuscarPedidosEntreHora(mesa1.getIdMesa(),Ini,Fin,fechaPedido);
        armarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel Hora1;
    private javax.swing.JComboBox<Object> combo;
    private javax.swing.JTextField horaFin;
    private javax.swing.JTextField horaIni;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jCfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField minutoFin;
    private javax.swing.JTextField minutoIni;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    private void cargarCombo(){
        listaMesas=(ArrayList<Mesa>) mesa.listarMesas();
        for(Mesa m:listaMesas){
            combo.addItem(m);
        }
    }
    private void armarCabecera() {
        ArrayList<Object> columnas = new ArrayList<>();
        modelo.addColumn("Id Pedido");
        modelo.addColumn("Hora");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio unidad");
        modelo.addColumn("Total");
        modelo.addColumn("Estado"); 
        tabla.setModel(modelo);
    }
    private void borrarFilas(){
        int filas = tabla.getRowCount() -1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    private String Estado(Pedido pedido){
        String estado;
        if(pedido.isEstado()==true){
            if(pedido.isEstadoPago()==true){
                estado="Pago";
            }
            else{
            estado="Entregado";
            }
        }
        else{
            estado="Pendiente";
        }
        return estado;
    }
    private void armarTabla(){
        borrarFilas();
        for(Pedido pedido:listaPedidos){
            Producto producto=productoData.buscarProductoporId(pedido.getIdProducto());
            String nombre=producto.getNombreProducto();
            int precio=producto.getPrecio();
            modelo.addRow(new Object[]{pedido.getIdPedido(), pedido.getHoraPedido(), nombre, pedido.getCantidadProducto(), precio, pedido.getCantidadProducto()*precio, Estado(pedido)});
        }
    }
}
