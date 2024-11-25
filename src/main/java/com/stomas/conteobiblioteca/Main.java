/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.stomas.conteobiblioteca;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.DefaultListModel;

/**
 *
 * @author parag
 */
public class Main extends javax.swing.JFrame {

    private Timer timer; // Declarar el Timer a nivel de clase
    private TimerTask tarea; // Declarar la tarea a nivel de clase

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_comenzar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lb_cuenta_personas = new javax.swing.JLabel();
        lb_cuenta_lib_pedidos = new javax.swing.JLabel();
        lb_cuenta_lib_inventario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_detener = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jls_cuenta = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_comenzar.setText("Comenzar cuenta");
        bt_comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_comenzarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sistema de Gestión de Biblioteca"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_cuenta_personas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_cuenta_personas.setText("----");
        jPanel1.add(lb_cuenta_personas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 40, -1));

        lb_cuenta_lib_pedidos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_cuenta_lib_pedidos.setText("----");
        jPanel1.add(lb_cuenta_lib_pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 40, -1));

        lb_cuenta_lib_inventario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_cuenta_lib_inventario.setText("----");
        jPanel1.add(lb_cuenta_lib_inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 40, -1));

        jLabel4.setText("Personas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setText("Libros Pedidos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 80, -1));

        jLabel6.setText("Libros en inventario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        bt_detener.setText("Detener cuenta");
        bt_detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_detenerActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jls_cuenta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_comenzar)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addComponent(bt_detener, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(bt_comenzar)
                        .addGap(55, 55, 55)
                        .addComponent(bt_detener)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_comenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_comenzarActionPerformed
        // TODO add your handling code here:

        cuentap.setCant_personas(0);
        //se pasa una referencia al objeto de la clase Main
        cuentap.setMain(this); //permite acceder a los métodos y atributos de Main

        libroc.setPersona(cuentap);
        libroc.setCant_libros(0);
        libroc.setMain(this);

        inv.setPersona(cuentap);
        inv.setTotal_libros(500);
        inv.setMain(this);

        clearList();
        this.ls_cuenta.removeAll(ls_cuenta);

        cuentap.setRunning(true);
        libroc.setRunning(true);
        inv.setRunning(true);

        // Iniciar el Timer y las tareas
        timer = new Timer();
        tarea = new TimerTask() {
            @Override
            public void run() {
                // Ejecutamos los métodos run de cada hilo
                if (cuentap.isRunning() && libroc.isRunning() && inv.isRunning()) {
                    cuentap.run();
                    libroc.run();
                    inv.run();
                    //añadir valor
                    ls_cuenta.add("Llegaron " + cuentap.getLlegan_personas() + " personas, pidieron " + cuentap.getPiden_libros() + " libros, Total Inventario: " + inv.getTotal_libros() + ".");
                    ls_cuenta.add("- - - - - - -");
                    loadList();
                } else {
                    tarea.cancel();
                    timer.cancel(); // Detener el Timer si los hilos se detienen
                    ls_cuenta.add("Total:");
                    ls_cuenta.add("Cantidad de Personas: " + cuentap.getCant_personas() + ", Libros pedidos: " + libroc.getCant_libros() + ", Total Inventario: " + inv.getTotal_libros() + ".");
                    ls_cuenta.add("- - - - - - -");
                    loadList();
                }
            }

        };

        timer.schedule(tarea, 0, 1500);


    }//GEN-LAST:event_bt_comenzarActionPerformed

    private void bt_detenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_detenerActionPerformed


        timer.cancel();
        tarea.cancel();
        ls_cuenta.add("Total:");
        ls_cuenta.add("Cantidad de Personas: " + cuentap.getCant_personas() + ", Libros pedidos: " + libroc.getCant_libros() + ", Total Inventario: " + inv.getTotal_libros() + ".");
        ls_cuenta.add("- - - - - - -");
        loadList();

    }//GEN-LAST:event_bt_detenerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    ArrayList<String> ls_cuenta = new ArrayList<String>();

    CuentaPersona cuentap = new CuentaPersona();
    SumaLibros libroc = new SumaLibros();
    Inventario inv = new Inventario();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_comenzar;
    private javax.swing.JButton bt_detener;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jls_cuenta;
    private javax.swing.JLabel lb_cuenta_lib_inventario;
    private javax.swing.JLabel lb_cuenta_lib_pedidos;
    private javax.swing.JLabel lb_cuenta_personas;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JLabel getLb_cuenta_personas() {
        return lb_cuenta_personas;
    }

    public javax.swing.JLabel getLb_cuenta_lib_pedidos() {
        return lb_cuenta_lib_pedidos;
    }

    public javax.swing.JLabel getLb_cuenta_lib_inventario() {
        return lb_cuenta_lib_inventario;
    }

    private void loadList() {
        DefaultListModel<String> modelo = new DefaultListModel<String>();
        for (String per : this.ls_cuenta) {
            modelo.addElement(per);
        }
        this.jls_cuenta.setModel(modelo);
    }

    private void clearList() {
        DefaultListModel<String> modelo = new DefaultListModel<String>();
        for (String per : this.ls_cuenta) {
            modelo.removeElement(per);
        }
        this.jls_cuenta.setModel(modelo);
    }

}
