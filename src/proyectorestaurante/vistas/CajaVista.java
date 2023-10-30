/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorestaurante.vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
public class CajaVista extends javax.swing.JInternalFrame {
    private DefaultTableModel modeloPediente = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    private DefaultTableModel modeloPago = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    private DefaultTableModel modeloCobrar = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    /**
     * Creates new form CajaVista
     */
   private MesaData mesa = new MesaData();
    private PedidoData pedidoData= new PedidoData();
    private ProductoData productoData=new ProductoData();
    private Mesa mesa1 = new Mesa();
    private Pedido pedido=new Pedido();
    private ArrayList<Mesa> listaMesas;
    private ArrayList<Pedido> listaPedidos=new ArrayList();
    private ArrayList<Pedido> listaPagos=new ArrayList();
    private ArrayList<Pedido> listaGuardar=new ArrayList();
    public CajaVista() {
        initComponents();
        jCfecha.setDate(Date.valueOf(LocalDate.now()));
        horaFin.setText(""+LocalTime.now().getHour());
        minutoFin.setText(""+LocalTime.now().getMinute());
        horaIni.setText(""+(LocalTime.now().getHour()-1));
        minutoIni.setText(""+LocalTime.now().getMinute());
        armarCabecera1();
        armarCabecera2();
        armarCabecera3();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        pagos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        acobrar = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        pendiente = new javax.swing.JTable();
        combo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Cobrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        horaIni = new javax.swing.JTextField();
        minutoIni = new javax.swing.JTextField();
        Hora1 = new javax.swing.JLabel();
        horaFin = new javax.swing.JTextField();
        minutoFin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCfecha = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TotalFinal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Caja");

        pagos.setBackground(new java.awt.Color(255, 153, 102));
        pagos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        pagos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(pagos);

        acobrar.setBackground(new java.awt.Color(255, 153, 102));
        acobrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        acobrar.setModel(new javax.swing.table.DefaultTableModel(
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
        acobrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acobrarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(acobrar);

        pendiente.setBackground(new java.awt.Color(255, 153, 102));
        pendiente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        pendiente.setModel(new javax.swing.table.DefaultTableModel(
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
        pendiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(pendiente);

        combo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mesa");

        Cobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectorestaurante/recursos/dolar.png"))); // NOI18N
        Cobrar.setText("Cobrar");
        Cobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total:$");

        Total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Total.setForeground(new java.awt.Color(255, 255, 255));
        Total.setText("0.00");

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pedidos Pagos");

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Platos Pedidos");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pedidos a cobrar");

        Hora.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        Hora.setForeground(new java.awt.Color(255, 255, 255));
        Hora.setText("Hora:");

        horaIni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        horaIni.setText("00");

        minutoIni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minutoIni.setText("00");

        Hora1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        Hora1.setForeground(new java.awt.Color(255, 255, 255));
        Hora1.setText("Hora:");

        horaFin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        horaFin.setText("00");
        horaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaFinActionPerformed(evt);
            }
        });

        minutoFin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minutoFin.setText("00");

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectorestaurante/recursos/lupa_1.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total pagos: $");

        TotalFinal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TotalFinal.setForeground(new java.awt.Color(255, 255, 255));
        TotalFinal.setText("0.00");

        jLabel8.setText("Y");

        jLabel10.setText(":");

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectorestaurante/recursos/money.png"))); // NOI18N
        jLabel11.setText("Caja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TotalFinal)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Total)
                                .addGap(44, 44, 44)
                                .addComponent(Cobrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel6)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Hora)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(horaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(minutoIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Hora1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(horaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(minutoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jButton1)))))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TotalFinal))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(horaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hora1)
                                    .addComponent(jLabel8)
                                    .addComponent(minutoIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(minutoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hora))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Total)
                            .addComponent(Cobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void pendienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendienteMouseClicked
        // TODO add your handling code here:
        int fila = pendiente.getSelectedRow();
        if (fila >= 0) {
            try {
                String estado = (String) modeloPediente.getValueAt(fila, 6);
                if (estado.equals("Entregado")) {
                    int id = (int) modeloPediente.getValueAt(fila, 0);
                    pedido = pedidoData.buscarPedidoCodigo(id);
                } else {
                    JOptionPane.showMessageDialog(this, "Seleccione un pedido entregado.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al seleccionar el pedido: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un producto.");
        }
        intercambio();
        armarTablaPendiente();
        armarTablaCobrar();
        total();
    }//GEN-LAST:event_pendienteMouseClicked

    private void acobrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acobrarMouseClicked
        // TODO add your handling code here:
        int fila = acobrar.getSelectedRow();
        if (fila >= 0) {
            try {
                int id = (int) modeloCobrar.getValueAt(fila, 0);
                pedido = pedidoData.buscarPedidoCodigo(id);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al seleccionar el pedido a cobrar: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un producto.");
        }
        intercambioC();
        armarTablaPendiente();
        armarTablaCobrar();
        total();
    }//GEN-LAST:event_acobrarMouseClicked

    private void CobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobrarActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea cobrar pedido?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            try {
                LocalDate fechaPedido=jCfecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalTime Ini=LocalTime.of(Integer.parseInt(horaIni.getText()), Integer.parseInt(minutoIni.getText()));
                LocalTime Fin=LocalTime.of(Integer.parseInt(horaFin.getText()), Integer.parseInt(minutoFin.getText()));
             
                for (Pedido x : listaGuardar) {
                    pedidoData.modificarPedido(x);
                }
                armaListas(Ini, Fin, fechaPedido);
                armarTablaPagos();
                armarTablaPendiente();
                armarTablaCobrar();
                total();
                estadoMesa();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al realizar el cobro: " + e.getMessage());
            }
       }
    }//GEN-LAST:event_CobrarActionPerformed

    private void horaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaFinActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        mesa1=(Mesa) combo.getSelectedItem();
        LocalDate fechaPedido=jCfecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalTime Ini=LocalTime.of(Integer.parseInt(horaIni.getText()), Integer.parseInt(minutoIni.getText()));
        LocalTime Fin=LocalTime.of(Integer.parseInt(horaFin.getText()), Integer.parseInt(minutoFin.getText()));
        listaPedidos=(ArrayList<Pedido>) pedidoData.BuscarPedidosEntreHora(mesa1.getIdMesa(),Ini,Fin,fechaPedido);
        if (mesa1 != null) {
            armaListas(Ini, Fin, fechaPedido);
            armarTablaPagos();
            armarTablaPendiente();
            total();
         }else{
              JOptionPane.showMessageDialog(this, "Seleccione una mesa válida.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los pedidos: " + e.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cobrar;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel Hora1;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TotalFinal;
    private javax.swing.JTable acobrar;
    private javax.swing.JComboBox<Mesa> combo;
    private javax.swing.JTextField horaFin;
    private javax.swing.JTextField horaIni;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jCfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField minutoFin;
    private javax.swing.JTextField minutoIni;
    private javax.swing.JTable pagos;
    private javax.swing.JTable pendiente;
    // End of variables declaration//GEN-END:variables
    private void cargarCombo(){
        listaMesas=(ArrayList<Mesa>) mesa.listarMesas();
        for(Mesa m:listaMesas){
            combo.addItem(m);
        }
    }
    private void armarCabecera1() {
        ArrayList<Object> columnas = new ArrayList<>();
        modeloPediente.addColumn("Id Pedido");
        modeloPediente.addColumn("Hora");
        modeloPediente.addColumn("Producto");
        modeloPediente.addColumn("Cantidad");
        modeloPediente.addColumn("Precio unidad");
        modeloPediente.addColumn("Total");
        modeloPediente.addColumn("Estado");
        pendiente.setModel(modeloPediente);
    }
    private void borrarFilas1(){
        int filas = pendiente.getRowCount() -1;
        for (int f = filas; f >= 0; f--) {
            modeloPediente.removeRow(f);
        }
    }
    private void armarCabecera2() {
        ArrayList<Object> columnas = new ArrayList<>();
        modeloPago.addColumn("Id Pedido");
        modeloPago.addColumn("Hora");
        modeloPago.addColumn("Producto");
        modeloPago.addColumn("Cantidad");
        modeloPago.addColumn("Precio unidad");
        modeloPago.addColumn("Total");
        pagos.setModel(modeloPago);
    }
    private void borrarFilas2(){
        int filas = pagos.getRowCount() -1;
        for (int f = filas; f >= 0; f--) {
            modeloPago.removeRow(f);
        }
    }
    private void armarCabecera3() {
        ArrayList<Object> columnas = new ArrayList<>();
        modeloCobrar.addColumn("Id Pedido");
        modeloCobrar.addColumn("Hora");
        modeloCobrar.addColumn("Producto");
        modeloCobrar.addColumn("Cantidad");
        modeloCobrar.addColumn("Precio unidad");
        modeloCobrar.addColumn("Total");
        acobrar.setModel(modeloCobrar);
    }
    private void borrarFilas3(){
        int filas = acobrar.getRowCount() -1;
        for (int f = filas; f >= 0; f--) {
            modeloCobrar.removeRow(f);
        }
    }
    private void armaListas(LocalTime ini,LocalTime fin,LocalDate fecha){
        listaGuardar=(ArrayList<Pedido>) pedidoData.BuscarPedidosEntreHora(mesa1.getIdMesa(), ini, fin, fecha);
        listaPagos=new ArrayList();
        listaPedidos=new ArrayList();
        for(Pedido pe:listaGuardar){
            if(pe.isEstadoPago()){
                listaPagos.add(pe);
            }
            else{
                listaPedidos.add(pe);
            }
        }
        listaGuardar=new ArrayList();
    }
    private void armarTablaPagos(){
        borrarFilas2();
        for(Pedido pedido:listaPagos){
            Producto producto=productoData.buscarProductoporId(pedido.getIdProducto());
            String nombre=producto.getNombreProducto();
            int precio=producto.getPrecio();
            modeloPago.addRow(new Object[]{pedido.getIdPedido(), pedido.getHoraPedido(), nombre, pedido.getCantidadProducto(), precio, pedido.getCantidadProducto()*precio});
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
    private void armarTablaPendiente(){
        borrarFilas1();
        for(Pedido pedido:listaPedidos){
            Producto producto=productoData.buscarProductoporId(pedido.getIdProducto());
            String nombre=producto.getNombreProducto();
            int precio=producto.getPrecio();
            modeloPediente.addRow(new Object[]{pedido.getIdPedido(), pedido.getHoraPedido(), nombre, pedido.getCantidadProducto(), precio, pedido.getCantidadProducto()*precio, Estado(pedido)});
        }
    }
    private void armarTablaCobrar(){
        borrarFilas3();
        for(Pedido pedido:listaGuardar){
            Producto producto=productoData.buscarProductoporId(pedido.getIdProducto());
            String nombre=producto.getNombreProducto();
            int precio=producto.getPrecio();
            modeloCobrar.addRow(new Object[]{pedido.getIdPedido(), pedido.getHoraPedido(), nombre, pedido.getCantidadProducto(), precio, pedido.getCantidadProducto()*precio});
        }
    }
    private void intercambio(){
        pedido.setEstadoPago(true);
        for(Pedido p:listaPedidos){
            if(p.getIdPedido()==pedido.getIdPedido()){
                listaGuardar.add(pedido);
            }
        }
        int tamaño=listaPedidos.size();
        for(int i=0; i<tamaño; i++){
            if(listaPedidos.get(i).getIdPedido()==pedido.getIdPedido()){
                listaPedidos.remove(i);
                break;
            }
        }
    }
    private void intercambioC(){
        pedido.setEstadoPago(false);
        for(Pedido p:listaGuardar){
            if(p.getIdPedido()==pedido.getIdPedido()){
                listaPedidos.add(pedido);
            }
        }
        int tamaño=listaGuardar.size();
        for(int i=0; i<tamaño; i++){
            if(listaGuardar.get(i).getIdPedido()==pedido.getIdPedido()){
                listaGuardar.remove(i);
                break;
            }
        }
    }
    private void total(){
        int suma=0;
        int suma2=0;
        for(Pedido p:listaGuardar){
            Producto producto=productoData.buscarProductoporId(p.getIdProducto());
            suma=producto.getPrecio()*p.getCantidadProducto()+suma;
        }
        for(Pedido p:listaPagos){
            Producto producto=productoData.buscarProductoporId(p.getIdProducto());
            suma2=producto.getPrecio()*p.getCantidadProducto()+suma2;
        }
        Total.setText(suma+"");
        TotalFinal.setText(suma2+"");
    }
    private void estadoMesa(){
        if(listaPedidos.size()==0){
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea liberar la mesa?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                mesa1.setEstado(false);
                mesa.modificarMesa(mesa1);
                combo.removeAllItems();
                cargarCombo();
            }
        }
    }
}
