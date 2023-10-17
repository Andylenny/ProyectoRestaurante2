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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectorestaurante.AccesoAdatos.MesaData;
import proyectorestaurante.AccesoAdatos.MeseroData;
import proyectorestaurante.AccesoAdatos.PedidoData;
import proyectorestaurante.AccesoAdatos.ProductoData;
import proyectorestaurante.entidades.Mesa;
import proyectorestaurante.entidades.Mesero;
import proyectorestaurante.entidades.Pedido;
import proyectorestaurante.entidades.Producto;

/**
 *
 * @author pc
 */
public class PedidosVista extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo1 = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    private DefaultTableModel modelo2 = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    private MesaData mesaData = new MesaData();
    private Mesa mesa = new Mesa();
    private MeseroData meseroData=new MeseroData();
    private Mesero mesero= new Mesero();
    private ProductoData productoData= new ProductoData();
    private Producto producto= new Producto();
    private ArrayList<Producto> listaProducto;
    private Pedido pedido;
    private PedidoData pedidoData= new PedidoData();
    private ArrayList<Pedido> listaPedidos;
    /**
     * Creates new form PedidosVista
     */
    public PedidosVista() {
        initComponents();
        armarCabecera1();
        armarCabecera2();
        cargarMesas();
        cargarMeseros();
        armarTablaP();
        pedido = new Pedido();
        listaPedidos=new ArrayList<>();
        hora.setText(""+LocalTime.now().getHour());
        minuto.setText(""+LocalTime.now().getMinute());
        jCfecha.setDate(java.util.Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbMesa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProducto = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tPedido = new javax.swing.JTable();
        Total = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbMesero = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        Hora = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        minuto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCfecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        cbMesa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        tProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tProducto);

        tPedido.setModel(new javax.swing.table.DefaultTableModel(
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
        tPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPedidoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tPedido);

        Total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Total.setText("000.000.000");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Total: ");

        cbMesero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMeseroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mesero:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Mesa:");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Hora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Hora.setText("Hora:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Fecha:");

        hora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hora.setText("00");

        minuto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minuto.setText("00");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText(":");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Productos");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Pedido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(cbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Hora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minuto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Guardar)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(130, 130, 130))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(Guardar))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(minuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Hora)))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMeseroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMeseroActionPerformed

    private void tProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProductoMouseClicked
        // TODO add your handling code here:
        mesa=(Mesa) cbMesa.getSelectedItem();
        mesero=(Mesero) cbMesero.getSelectedItem();
        LocalTime horaPedido=LocalTime.of(Integer.parseInt(hora.getText()), Integer.parseInt(minuto.getText()));
        LocalDate fechaPedido=jCfecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int fila = tProducto.getSelectedRow();
        if(fila >=0){
            int x=(int)modelo1.getValueAt(fila,0);
            producto=productoData.buscarProductoporCodigo(x);
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione producto");
        }
        pedido=new Pedido(0, mesa.getIdMesa(), mesero.getIdMesero(), producto.getIdProducto(), 1 , fechaPedido, horaPedido, false, true);
        GuardarPedido(pedido);
        CargarTotal();
    }//GEN-LAST:event_tProductoMouseClicked

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        for(Pedido x:listaPedidos){
            pedidoData.guardarPedido(x);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void tPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPedidoMouseClicked
        // TODO add your handling code here:
        int fila = tPedido.getSelectedRow();
        if(fila >=0){
            int x=(int)modelo2.getValueAt(fila,0);
            producto=productoData.buscarProductoporCodigo(x);
            eliminarProducto(producto);
            CargarTotal();
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione producto");
        }
    }//GEN-LAST:event_tPedidoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel Total;
    private javax.swing.JComboBox<Mesa> cbMesa;
    private javax.swing.JComboBox<Mesero> cbMesero;
    private javax.swing.JTextField hora;
    private com.toedter.calendar.JDateChooser jCfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField minuto;
    private javax.swing.JTable tPedido;
    private javax.swing.JTable tProducto;
    // End of variables declaration//GEN-END:variables


    private void armarCabecera1(){
        ArrayList<Object> columnas = new ArrayList<>();
        modelo1.addColumn("Codigo");
        modelo1.addColumn("Nombre");
        modelo1.addColumn("Precio");
        tProducto.setModel(modelo1);
    }
    private void armarCabecera2() {
        ArrayList<Object> columnas = new ArrayList<>();
        modelo2.addColumn("Codigo");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Precio");
        modelo2.addColumn("Cantidad");
        tPedido.setModel(modelo2);
    }
    public void cargarMesas(){
        for(Mesa m : mesaData.listarMesas())
               cbMesa.addItem(m);
     }
    public void cargarMeseros(){
        for(Mesero m : meseroData.listarMeseros())
               cbMesero.addItem(m);
    }
    private void armarTablaP(){
        listaProducto=(ArrayList<Producto>) productoData.listarProductos();
        for(Producto x:listaProducto){
            modelo1.addRow(new Object[]{x.getCodigo(),x.getNombreProducto(),x.getPrecio()});
        }
    }
    private void armarTabla(){
        for(Pedido x:listaPedidos){
            Producto pro=productoData.buscarProductoporId(x.getIdProducto());
            modelo2.addRow(new Object[]{pro.getCodigo(),pro.getNombreProducto(),pro.getPrecio()*x.getCantidadProducto(),x.getCantidadProducto()});
        }
    }
    private void borrarFilas() {
        int filas = tPedido.getRowCount() - 1;

        for (int f = filas; f >= 0; f--) {
            modelo2.removeRow(f);
        }
    }
    private void GuardarPedido(Pedido x){
        int z= listaPedidos.size();
        int p=0;
        for(int i=0;i<z;i++){
            if(listaPedidos.get(i).getIdProducto()==x.getIdProducto()){
                Pedido a=listaPedidos.get(i);
                a.setCantidadProducto(a.getCantidadProducto()+1);
                listaPedidos.set(i, a);
                borrarFilas();
                armarTabla();
                p=p+1;
            }
        }
        if(p==0){
            listaPedidos.add(x);
            borrarFilas();
            armarTabla();
        }
    }
    private void CargarTotal(){
        int z=0;
        for(Pedido x:listaPedidos){
            Producto pro=productoData.buscarProductoporId(x.getIdProducto());
            z=z+(pro.getPrecio()*x.getCantidadProducto());
        }
        Total.setText(""+z);
    }
    
    private void eliminarProducto(Producto pedidoE){
        int z=listaPedidos.size();
        for(int i=0;i<z;i++){
            if(listaPedidos.get(i).getIdProducto()==pedidoE.getIdProducto()){
                if(listaPedidos.get(i).getCantidadProducto()>1){
                   Pedido a=listaPedidos.get(i);
                    a.setCantidadProducto(a.getCantidadProducto()-1);
                    listaPedidos.set(i, a);
                    borrarFilas();
                    armarTabla();
                }
                else{
                    listaPedidos.remove(i);
                    borrarFilas();
                    armarTabla();
                }
            }
        }
    }
}