/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorestaurante.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectorestaurante.AccesoAdatos.MesaData;
import proyectorestaurante.entidades.Mesa;

/**
 *
 * @author Lourdes
 */
public class MesaVista extends javax.swing.JInternalFrame {

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
    private MesaData mesa = new MesaData();
    private Mesa mesa1 = null;
    private ArrayList<Mesa> listaMesas;

    /**
     * Creates new form Mesa
     */
    public MesaVista() {
        initComponents();
        armarCabecera1();
        armarCabecera2();
        armarTabla();
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
        jTable1 = new javax.swing.JTable();
        grupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtidMesa = new javax.swing.JTextField();
        jtCapacidad = new javax.swing.JTextField();
        jtNumMesa = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminarL = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtLibre = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtOcupada = new javax.swing.JTable();
        jbOcupar = new javax.swing.JButton();
        jbLiberar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtEstado = new javax.swing.JRadioButton();
        jbEliminarT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtBaja = new javax.swing.JRadioButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Administracion de mesas");

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectorestaurante/recursos/mesa.png"))); // NOI18N
        jLabel1.setText("Administacion de Mesas");

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Capacidad:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ocupada:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de mesa:");

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectorestaurante/recursos/lupa_1.png"))); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectorestaurante/recursos/registro.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectorestaurante/recursos/salvar.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectorestaurante/recursos/editar.png"))); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminarL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectorestaurante/recursos/reparar.png"))); // NOI18N
        jbEliminarL.setText("Eliminar Temporalmente ");
        jbEliminarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarLActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Organizacion");

        jtLibre.setBackground(new java.awt.Color(255, 153, 102));
        jtLibre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtLibre.setForeground(new java.awt.Color(0, 0, 0));
        jtLibre.setModel(new javax.swing.table.DefaultTableModel(
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
        jtLibre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtLibreMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtLibre);

        jtOcupada.setBackground(new java.awt.Color(255, 153, 102));
        jtOcupada.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtOcupada.setForeground(new java.awt.Color(0, 0, 0));
        jtOcupada.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtOcupada);

        jbOcupar.setText("Ocupar");
        jbOcupar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOcuparActionPerformed(evt);
            }
        });

        jbLiberar.setText("Liberar");
        jbLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLiberarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Mesas Libres");

        jLabel9.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Mesas Ocupadas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbOcupar)
                    .addComponent(jbLiberar))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(261, 261, 261))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jbOcupar)
                        .addGap(29, 29, 29)
                        .addComponent(jbLiberar))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbEliminarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectorestaurante/recursos/eliminar.png"))); // NOI18N
        jbEliminarT.setText("Eliminacion Total");
        jbEliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarTActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Activa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(41, 41, 41)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtBaja)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtidMesa)
                                .addComponent(jtCapacidad)
                                .addComponent(jtNumMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                            .addComponent(jtEstado))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(78, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbEliminarT)
                                    .addComponent(jbEliminarL, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(124, 124, 124))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtidMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbGuardar)
                            .addComponent(jbModificar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtEstado)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtNumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jtBaja))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbEliminarL)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminarT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(jtidMesa.getText());
            MesaData mesaEncontrada = new MesaData();
            Mesa mesa = mesaEncontrada.buscarMesaporId(id);

            if (mesa != null) {
                // Si se encuentra la mesa, muestra su información en los campos de texto
                jtCapacidad.setText(String.valueOf(mesa.getCapacidad()));
                jtEstado.setSelected(mesa.isEstado());
                jtNumMesa.setText(String.valueOf(mesa.getNumeroMesa()));
                jtBaja.setSelected(mesa.isBaja());
            } else {
                JOptionPane.showMessageDialog(this, "Mesa no encontrada.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido para el ID de la mesa.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar la mesa: " + e.getMessage());
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        String capacidad = jtCapacidad.getText();
        String numeroMesa = jtNumMesa.getText();

        if (capacidad.isEmpty() || numeroMesa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los campos de capacidad y número de mesa no pueden estar vacíos.");
        } else {

            try {
                int cap = Integer.parseInt(jtCapacidad.getText());
                int numMesa = Integer.parseInt(jtNumMesa.getText());

                if (cap < 1 || cap > 10) {
                    JOptionPane.showMessageDialog(this, "La capacidad debe estar entre 1 y 10.");
                } else if (numMesa < 1 || numMesa > 50) {
                    JOptionPane.showMessageDialog(this, "El número de mesa debe estar entre 1 y 50.");
                } else {

                    boolean estado = jtEstado.isSelected();
                    boolean baja = jtBaja.isSelected();
                    Mesa mesa = new Mesa(cap, estado, numMesa, baja);
                    MesaData md = new MesaData();
                    md.guardarMesa(mesa);
                  
                }
                recargar();
                

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese números válidos en los campos de capacidad y número de mesa.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al guardar la mesa: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        activarCampos();
        limpiar();
        jtidMesa.requestFocus();
        jtCapacidad.setEnabled(true);
        jtNumMesa.setEnabled(true);
        jtEstado.setEnabled(true);
        jbGuardar.setEnabled(true);
        jbBuscar.setEnabled(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarLActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(jtidMesa.getText());
            MesaData mesaEncontrada = new MesaData();
            Mesa mesa = mesaEncontrada.buscarMesaporId(id);

            if (mesa != null) {
                mesaEncontrada.eliminarMeseroLogico(id);
                recargar();
            } else {
                JOptionPane.showMessageDialog(this, "Mesa no encontrada.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID de la mesa.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar la mesa: " + e.getMessage());
        }


    }//GEN-LAST:event_jbEliminarLActionPerformed

    private void jbEliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarTActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(jtidMesa.getText());
            MesaData mesaEncontrada = new MesaData();
            Mesa mesa = mesaEncontrada.buscarMesaporId(id);

            if (mesa != null) {
                mesaEncontrada.eliminarMesa(id);
                recargar();
            } else {
                JOptionPane.showMessageDialog(this, "Mesa no encontrada.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID de la mesa.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar la mesa: " + e.getMessage());
        }
    }//GEN-LAST:event_jbEliminarTActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        String idMesa = jtidMesa.getText();
        String capacidad = jtCapacidad.getText();
        String numeroMesa = jtNumMesa.getText();
        if (idMesa.isEmpty() || capacidad.isEmpty() || numeroMesa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los campos de ID, capacidad y número de mesa no pueden estar vacíos.");
        } else {

            try {
                int id = Integer.parseInt(jtidMesa.getText());
                int cap = Integer.parseInt(jtCapacidad.getText());
                int numMesa = Integer.parseInt(jtNumMesa.getText());
                boolean estado = jtEstado.isSelected();
                boolean baja = jtBaja.isSelected();
                MesaData mesaEncontrada = new MesaData();
                Mesa mesa = mesaEncontrada.buscarMesaporId(id);
                if (mesa != null) {
                    mesa.setCapacidad(cap);
                    mesa.setNumeroMesa(numMesa);
                    mesa.setEstado(estado);
                    mesa.setBaja(baja);
                    mesaEncontrada.modificarMesa(mesa);
                    recargar();
                } else {
                    JOptionPane.showMessageDialog(this, "Mesa no encontrada.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un ID válido para la mesa.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al modificar la mesa: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbOcuparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOcuparActionPerformed
        // OCUPAR MESA
        try {
            int fila = jtLibre.getSelectedRow();
            mesa1 = new Mesa();
            if (fila >= 0) {
                mesa1.setIdMesa((int) modelo1.getValueAt(fila, 0));
                mesa1.setCapacidad((int) modelo1.getValueAt(fila, 1));
                mesa1.setNumeroMesa((int) modelo1.getValueAt(fila, 2));
                mesa1.setEstado(true);
                mesa1.setBaja(true);
                mesa.modificarMesa(mesa1);
                recargar();
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una mesa libre");
            }
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.");
        } 
    }//GEN-LAST:event_jbOcuparActionPerformed

    private void jbLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLiberarActionPerformed
        // LIBERAR MESA
       try{
        int fila = jtOcupada.getSelectedRow();
        mesa1 = new Mesa();
        if (fila >= 0) {
            mesa1.setIdMesa((int) modelo2.getValueAt(fila, 0));
            mesa1.setCapacidad((int) modelo2.getValueAt(fila, 1));
            mesa1.setNumeroMesa((int) modelo2.getValueAt(fila, 2));
            mesa1.setEstado(false);
            mesa1.setBaja(true);
            mesa.modificarMesa(mesa1);
            recargar();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una mesa ocupada");
        }
       }catch(NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.");
        } 
    }//GEN-LAST:event_jbLiberarActionPerformed

    private void jtLibreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLibreMouseClicked
        // TODO add your handling code here:
        System.out.println(modelo1.getValueAt((jtLibre.getSelectedRow()), (jtLibre.getSelectedColumn())));
    }//GEN-LAST:event_jtLibreMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminarL;
    private javax.swing.JButton jbEliminarT;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLiberar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbOcupar;
    private javax.swing.JRadioButton jtBaja;
    private javax.swing.JTextField jtCapacidad;
    private javax.swing.JRadioButton jtEstado;
    private javax.swing.JTable jtLibre;
    private javax.swing.JTextField jtNumMesa;
    private javax.swing.JTable jtOcupada;
    private javax.swing.JTextField jtidMesa;
    // End of variables declaration//GEN-END:variables
  private void desactivarCampos() {
        jtidMesa.setEnabled(false);
        jtCapacidad.setEnabled(false);
        jtNumMesa.setEnabled(false);
        jtEstado.setSelected(false);

    }

    private void activarCampos() {
        jtidMesa.setEnabled(true);
        jtCapacidad.setEnabled(true);
        jtNumMesa.setEnabled(true);
        jtEstado.setSelected(true);

    }

    private void limpiar() {

        jtidMesa.setText("");
        jtCapacidad.setText("");
        jtNumMesa.setText("");
        jtEstado.setSelected(false);

    }

    private void armarCabecera1() {
        ArrayList<Object> columnas = new ArrayList<>();
        modelo1.addColumn("IdMesa");
        modelo1.addColumn("Capacidad");
        modelo1.addColumn("Numero Mesa");
        modelo1.addColumn("Estado");
        jtLibre.setModel(modelo1);

        for (Object it : columnas) {
            modelo1.addColumn(it);
        }
        jtLibre.setModel(modelo1);
    }

    private void armarCabecera2() {
        ArrayList<Object> columnas = new ArrayList<>();
        modelo2.addColumn("IdMesa");
        modelo2.addColumn("Capacidad");
        modelo2.addColumn("Numero Mesa");
        modelo2.addColumn("Estado");
        jtOcupada.setModel(modelo2);

        for (Object it : columnas) {
            modelo2.addColumn(it);
        }
        jtOcupada.setModel(modelo2);
    }

    private void borrarFilas1() {
        int filas = jtLibre.getRowCount() - 1;

        for (int f = filas; f >= 0; f--) {
            modelo1.removeRow(f);
        }
    }

    private void borrarFilas2() {
        int filas = jtOcupada.getRowCount() - 1;

        for (int f = filas; f >= 0; f--) {
            modelo2.removeRow(f);
        }
    }

    private void armarTabla() {
        listaMesas = (ArrayList<Mesa>) mesa.listarMesasVacias();
        for (Mesa x : listaMesas) {
            modelo1.addRow(new Object[]{x.getIdMesa(), x.getCapacidad(), x.getNumeroMesa(), "Libre"});
        }
        listaMesas = (ArrayList<Mesa>) mesa.listarMesas();
        for (Mesa x : listaMesas) {
            modelo2.addRow(new Object[]{x.getIdMesa(), x.getCapacidad(), x.getNumeroMesa(), "Ocupada"});
        }
    }

    private void recargar() {
        borrarFilas1();
        borrarFilas2();
        armarTabla();
    }
}
