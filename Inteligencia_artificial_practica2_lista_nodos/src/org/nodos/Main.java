
package org.nodos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    private Lista_nodos lista_nodo;
    private nodo nodo;
    private ArrayList<nodo> lista;
    public Main() {
        initComponents();
        lista = new ArrayList<>();
        lista_nodo = new Lista_nodos(lista);
    }
int guardar_id;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_ID_nodo = new javax.swing.JLabel();
        lb_nombre_nodo = new javax.swing.JLabel();
        lb_peso_nodo = new javax.swing.JLabel();
        lb_Dato = new javax.swing.JLabel();
        tx_id_nodo = new javax.swing.JTextField();
        tx_nombre_nodo = new javax.swing.JTextField();
        tx_peso_nodo = new javax.swing.JTextField();
        tx_Datos = new javax.swing.JTextField();
        bt_Nuevo_nodo = new javax.swing.JButton();
        bt_guardar_nodo = new javax.swing.JButton();
        bt_cancelar_nodo = new javax.swing.JButton();
        bt_editar_nodo = new javax.swing.JButton();
        bt_Buscar = new javax.swing.JButton();
        bt_eliminar_nodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_ID_nodo.setText("ID");

        lb_nombre_nodo.setText("Nombre");

        lb_peso_nodo.setText("Peso");

        lb_Dato.setText("Ingrese nodo a buscar");

        tx_Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_DatosActionPerformed(evt);
            }
        });

        bt_Nuevo_nodo.setText("Nuevo");
        bt_Nuevo_nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Nuevo_nodoActionPerformed(evt);
            }
        });

        bt_guardar_nodo.setText("Guardar");
        bt_guardar_nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardar_nodoActionPerformed(evt);
            }
        });

        bt_cancelar_nodo.setText("Cancelar");
        bt_cancelar_nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelar_nodoActionPerformed(evt);
            }
        });

        bt_editar_nodo.setText("Editar");
        bt_editar_nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editar_nodoActionPerformed(evt);
            }
        });

        bt_Buscar.setText("Buscar");
        bt_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_BuscarActionPerformed(evt);
            }
        });

        bt_eliminar_nodo.setText("Eliminar");
        bt_eliminar_nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminar_nodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_Dato, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tx_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lb_ID_nodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_nombre_nodo, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(lb_peso_nodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tx_peso_nodo, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(tx_nombre_nodo)
                                    .addComponent(tx_id_nodo))
                                .addGap(81, 81, 81))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(bt_Nuevo_nodo)
                        .addGap(18, 18, 18)
                        .addComponent(bt_guardar_nodo)
                        .addGap(18, 18, 18)
                        .addComponent(bt_cancelar_nodo)
                        .addGap(18, 18, 18)
                        .addComponent(bt_editar_nodo)
                        .addGap(18, 18, 18)
                        .addComponent(bt_eliminar_nodo)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Dato)
                    .addComponent(tx_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Buscar))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_ID_nodo)
                    .addComponent(tx_id_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombre_nodo)
                    .addComponent(tx_nombre_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_peso_nodo)
                    .addComponent(tx_peso_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Nuevo_nodo)
                    .addComponent(bt_guardar_nodo)
                    .addComponent(bt_cancelar_nodo)
                    .addComponent(bt_editar_nodo)
                    .addComponent(bt_eliminar_nodo))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx_DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_DatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_DatosActionPerformed

    private void bt_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_BuscarActionPerformed
        try{
            nodo=new nodo();
            nodo.setNodo_id(Integer.parseInt(tx_Datos.getText()));
            nodo=lista_nodo.Buscar(nodo);
            if(nodo!=null)
            {
                tx_id_nodo.setText(String.valueOf(nodo.getNodo_id()));
                tx_nombre_nodo.setText(nodo.getNombre());
                tx_peso_nodo.setText(String.valueOf(nodo.getPeso()));
            }
            else
            {
                JOptionPane.showMessageDialog(this, "No se encontro el nodo");
            } 
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Entrada incorrecta");
        }  
    }//GEN-LAST:event_bt_BuscarActionPerformed

    private void bt_guardar_nodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardar_nodoActionPerformed
            try{
            nodo=new nodo();
            nodo.setNodo_id(Integer.parseInt(tx_id_nodo.getText()));
            nodo=lista_nodo.Buscar(nodo);
            if(nodo!=null)
            {
                JOptionPane.showMessageDialog(this, "No se puede repetir ID");
            }
            else
            {
                guardar_id = Integer.parseInt(tx_id_nodo.getText());
                nodo=new nodo();
                nodo.setNodo_id(Integer.parseInt(tx_id_nodo.getText()));
                nodo.setNombre(tx_nombre_nodo.getText());
                nodo.setPeso(Double.valueOf(tx_peso_nodo.getText()));
                lista_nodo.Agregar_nodo(nodo);
                lista=lista_nodo.getActualizar();
                JOptionPane.showMessageDialog(this, "Guardado de manera correcta");
            }
            }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Entrada incorrecta");
        }
    }//GEN-LAST:event_bt_guardar_nodoActionPerformed

    private void bt_Nuevo_nodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Nuevo_nodoActionPerformed
        try{
            nodo=new nodo();
            int suma,aux;
            suma = guardar_id+1;
            tx_id_nodo.setText(String.valueOf(suma));
            tx_nombre_nodo.setText(null);
            tx_peso_nodo.setText(null);
            lista=lista_nodo.getActualizar();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Entrada incorrecta");
        }
    }//GEN-LAST:event_bt_Nuevo_nodoActionPerformed

    private void bt_cancelar_nodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelar_nodoActionPerformed
            tx_id_nodo.setText(null);
            tx_nombre_nodo.setText(null);
            tx_peso_nodo.setText(null);
            JOptionPane.showMessageDialog(this, "Cancelado");
    }//GEN-LAST:event_bt_cancelar_nodoActionPerformed

    private void bt_editar_nodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editar_nodoActionPerformed
        try{
            nodo=new nodo();
            nodo.setNodo_id(Integer.parseInt(tx_id_nodo.getText()));
            nodo=lista_nodo.Buscar(nodo);
            if(nodo!=null)
            {
                nodo=new nodo();
                nodo.setNodo_id(Integer.parseInt(tx_id_nodo.getText()));
                nodo.setNombre(tx_nombre_nodo.getText());
                nodo.setPeso(Double.valueOf(tx_peso_nodo.getText()));
                lista_nodo.Agregar_nodo(nodo);
                lista=lista_nodo.getActualizar();
                JOptionPane.showMessageDialog(this, "Edicion exitosa");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "No se encontro el nodo");
            } 
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Entrada incorrecta");
        }
    }//GEN-LAST:event_bt_editar_nodoActionPerformed

    private void bt_eliminar_nodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminar_nodoActionPerformed
        try{
            nodo=new nodo();
            nodo.setNodo_id(Integer.parseInt(tx_id_nodo.getText()));
            nodo=lista_nodo.Buscar(nodo);
            if(nodo!=null)
            {
                lista_nodo.eliminar_nodo(nodo);
                tx_id_nodo.setText(null);
                tx_nombre_nodo.setText(null);
                tx_peso_nodo.setText(null);
                lista=lista_nodo.getActualizar();
                JOptionPane.showMessageDialog(this, "Eliminacion exitosa");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "No se encontro el nodo");
            } 
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Entrada incorrecta");
        }
    }//GEN-LAST:event_bt_eliminar_nodoActionPerformed

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
    private javax.swing.JButton bt_Buscar;
    private javax.swing.JButton bt_Nuevo_nodo;
    private javax.swing.JButton bt_cancelar_nodo;
    private javax.swing.JButton bt_editar_nodo;
    private javax.swing.JButton bt_eliminar_nodo;
    private javax.swing.JButton bt_guardar_nodo;
    private javax.swing.JLabel lb_Dato;
    private javax.swing.JLabel lb_ID_nodo;
    private javax.swing.JLabel lb_nombre_nodo;
    private javax.swing.JLabel lb_peso_nodo;
    private javax.swing.JTextField tx_Datos;
    private javax.swing.JTextField tx_id_nodo;
    private javax.swing.JTextField tx_nombre_nodo;
    private javax.swing.JTextField tx_peso_nodo;
    // End of variables declaration//GEN-END:variables
}
