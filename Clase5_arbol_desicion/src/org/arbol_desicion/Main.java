
package org.arbol_desicion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
Scanner scanner = new Scanner(System.in);
Map<String, String> map = new HashMap<>();
arbol ob=new arbol();
String respuesta;
    public Main() {
        initComponents();
        arbol ob=new arbol();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tp_registro = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lb_enfermedad = new javax.swing.JLabel();
        lb_signo = new javax.swing.JLabel();
        lb_sintoma = new javax.swing.JLabel();
        bt_registrar = new javax.swing.JButton();
        tx_signo = new javax.swing.JTextField();
        tx_enfermedad = new javax.swing.JTextField();
        tx_sintoma = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lb_pregunta = new javax.swing.JLabel();
        cb_desicion = new javax.swing.JComboBox<>();
        bt_evaluar = new javax.swing.JButton();
        lb_resultado = new javax.swing.JLabel();
        tx_resultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_enfermedad.setText("Ingrese Enfermedad");

        lb_signo.setText("Ingrese Signo");

        lb_sintoma.setText("Ingrese Sintoma");

        bt_registrar.setText("Registrar");
        bt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrarActionPerformed(evt);
            }
        });

        tx_enfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_enfermedadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_registrar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_sintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tx_sintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_signo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tx_signo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_enfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tx_enfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_enfermedad)
                    .addComponent(tx_enfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_signo)
                    .addComponent(tx_signo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_sintoma)
                    .addComponent(tx_sintoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(bt_registrar)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        tp_registro.addTab("Registro Enfermedades", jPanel1);

        lb_pregunta.setText("¿Tienes fiebre?");

        cb_desicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        cb_desicion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_desicionItemStateChanged(evt);
            }
        });
        cb_desicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_desicionActionPerformed(evt);
            }
        });

        bt_evaluar.setText("Evaluar");
        bt_evaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_evaluarActionPerformed(evt);
            }
        });

        lb_resultado.setText("Resultado:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tx_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_pregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_desicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addComponent(bt_evaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lb_pregunta)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_desicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_evaluar))
                .addGap(74, 74, 74)
                .addComponent(lb_resultado)
                .addGap(18, 18, 18)
                .addComponent(tx_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        tp_registro.addTab("Diagnostico", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_registro)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_registrarActionPerformed

    private void tx_enfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_enfermedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_enfermedadActionPerformed

    private void cb_desicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_desicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_desicionActionPerformed

    private void cb_desicionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_desicionItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_desicionItemStateChanged

    private void bt_evaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_evaluarActionPerformed
        try{
            switch (lb_pregunta.getText()) {
                case "¿Tienes fiebre?" -> {
                    respuesta = cb_desicion.getSelectedItem().toString();
                    map.put("fiebre", respuesta);
                    lb_pregunta.setText("¿Tienes tos?");
                }
                case "¿Tienes tos?" -> {
                    respuesta = cb_desicion.getSelectedItem().toString();
                    map.put("tos", respuesta);
                    lb_pregunta.setText("¿Tienes dolor de garganta?");
                }
                case "¿Tienes dolor de garganta?" -> {
                    respuesta = cb_desicion.getSelectedItem().toString();
                    map.put("dolor_garganta", respuesta);
                    lb_pregunta.setText("¿Tienes dificultad para respirar?");
                }
                case "¿Tienes dificultad para respirar?" -> {
                    respuesta = cb_desicion.getSelectedItem().toString();
                    map.put("dificultad_respirar", respuesta);
                    lb_pregunta.setText("¿Tienes fatiga?");
                }
                case "¿Tienes fatiga?" -> {
                    respuesta = cb_desicion.getSelectedItem().toString();
                    map.put("fatiga", respuesta);
                    lb_pregunta.setText("¿Tienes Perdida reciente del sentido del gusto o del olfato?");
                }
                case "¿Tienes Perdida reciente del sentido del gusto o del olfato?" -> {
                    respuesta = cb_desicion.getSelectedItem().toString();
                    map.put("Perdida_reciente_del_sentido_del_gusto_o_del_olfato", respuesta);
                    lb_pregunta.setText("¿Tienes Secrecion o congestion nasal?");
                }
                case "¿Tienes Secrecion o congestion nasal?" -> {
                    respuesta = cb_desicion.getSelectedItem().toString();
                    map.put("Secrecion_o_congestion_nasal", respuesta);
                    lb_pregunta.setText("¿Tienes Dolores musculares?");
                }
                case "¿Tienes Dolores musculares?" -> {
                    respuesta = cb_desicion.getSelectedItem().toString();
                    map.put("Dolores_musculares", respuesta);
                    lb_pregunta.setText("¿Tienes Cansancio?");
                }
                case "¿Tienes Cansancio?" -> {
                    respuesta = cb_desicion.getSelectedItem().toString();
                    map.put("Cansancio", respuesta);
                    lb_pregunta.setText("¿Tienes Dolor de cabeza?");
                }
                case "¿Tienes Dolor de cabeza?" -> {
                    respuesta = cb_desicion.getSelectedItem().toString();
                    map.put("Dolor_de_cabeza", respuesta);
                    String resultado = ob.root.classify(map);
                    tx_resultado.setText(resultado);
                    System.out.println("El resultado es: " + resultado);
                }
                default -> {
                }
            }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error de entrada");
        }
    }//GEN-LAST:event_bt_evaluarActionPerformed

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
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_evaluar;
    private javax.swing.JButton bt_registrar;
    private javax.swing.JComboBox<String> cb_desicion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_enfermedad;
    private javax.swing.JLabel lb_pregunta;
    private javax.swing.JLabel lb_resultado;
    private javax.swing.JLabel lb_signo;
    private javax.swing.JLabel lb_sintoma;
    private javax.swing.JTabbedPane tp_registro;
    private javax.swing.JTextField tx_enfermedad;
    private javax.swing.JTextField tx_resultado;
    private javax.swing.JTextField tx_signo;
    private javax.swing.JTextField tx_sintoma;
    // End of variables declaration//GEN-END:variables
}
