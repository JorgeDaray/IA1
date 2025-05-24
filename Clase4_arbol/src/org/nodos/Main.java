
package org.nodos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    private Lista_nodos lista_nodo;
    private nodo nodo;
    private ArrayList<nodo> lista;
    ArbolBinario arbol = new ArbolBinario();
    public Main() {
        initComponents();
        lista = new ArrayList<>();
        lista_nodo = new Lista_nodos(lista);
    }
int guardar_id;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_id_nodo = new javax.swing.JLabel();
        lb_nombre_nodo = new javax.swing.JLabel();
        lb_peso_nodo = new javax.swing.JLabel();
        lb_buscar_nodo = new javax.swing.JLabel();
        tx_id_nodo = new javax.swing.JTextField();
        tx_buscar_nodo = new javax.swing.JTextField();
        tx_nombre_nodo = new javax.swing.JTextField();
        tx_peso_nodo = new javax.swing.JTextField();
        bt_buscar_nodo = new javax.swing.JButton();
        bt_guardar_nodo = new javax.swing.JButton();
        bt_editar_nodo = new javax.swing.JButton();
        bt_eliminar_nodo = new javax.swing.JButton();
        lb_preorden_nodo = new javax.swing.JLabel();
        lb_inorden_nodo = new javax.swing.JLabel();
        lb_postorden_nodo = new javax.swing.JLabel();
        tx_preorden_nodo = new javax.swing.JTextField();
        tx_inorden_nodo = new javax.swing.JTextField();
        tx_postorden_nodo = new javax.swing.JTextField();
        bt_inorden_nodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_id_nodo.setText("ID");

        lb_nombre_nodo.setText("Nombre");

        lb_peso_nodo.setText("Peso");

        lb_buscar_nodo.setText("ID a buscar");

        bt_buscar_nodo.setText("Buscar");
        bt_buscar_nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscar_nodoActionPerformed(evt);
            }
        });

        bt_guardar_nodo.setText("Guardar");
        bt_guardar_nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardar_nodoActionPerformed(evt);
            }
        });

        bt_editar_nodo.setText("Editar");
        bt_editar_nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editar_nodoActionPerformed(evt);
            }
        });

        bt_eliminar_nodo.setText("Eliminar");
        bt_eliminar_nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminar_nodoActionPerformed(evt);
            }
        });

        lb_preorden_nodo.setText("preorden");

        lb_inorden_nodo.setText("inorden");

        lb_postorden_nodo.setText("postorden");

        bt_inorden_nodo.setText("imprimir");
        bt_inorden_nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inorden_nodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_guardar_nodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_editar_nodo)
                        .addGap(117, 117, 117)
                        .addComponent(bt_eliminar_nodo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_preorden_nodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_peso_nodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_nombre_nodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_id_nodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_buscar_nodo, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(lb_inorden_nodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_postorden_nodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tx_nombre_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tx_id_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tx_buscar_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_buscar_nodo))
                            .addComponent(tx_peso_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tx_preorden_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tx_inorden_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_inorden_nodo))
                            .addComponent(tx_postorden_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_buscar_nodo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tx_buscar_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_buscar_nodo)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_id_nodo)
                    .addComponent(tx_id_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombre_nodo)
                    .addComponent(tx_nombre_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_peso_nodo)
                    .addComponent(tx_peso_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_guardar_nodo)
                    .addComponent(bt_editar_nodo)
                    .addComponent(bt_eliminar_nodo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_preorden_nodo)
                    .addComponent(tx_preorden_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_inorden_nodo)
                    .addComponent(tx_inorden_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_inorden_nodo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_postorden_nodo)
                    .addComponent(tx_postorden_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                int peso = Integer.parseInt(tx_peso_nodo.getText());
                arbol.insertar(peso);
                JOptionPane.showMessageDialog(this, "Guardado de manera correcta");
            }
            }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Entrada incorrecta");
        }
    }//GEN-LAST:event_bt_guardar_nodoActionPerformed

    private void bt_buscar_nodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscar_nodoActionPerformed
        try{
            nodo=new nodo();
            nodo.setNodo_id(Integer.parseInt(tx_buscar_nodo.getText()));
            nodo=lista_nodo.Buscar(nodo);
            if(nodo!=null)
            {
                tx_id_nodo.setText(String.valueOf(nodo.getNodo_id()));
                tx_nombre_nodo.setText(nodo.getNombre());
                tx_peso_nodo.setText(String.valueOf(nodo.getPeso()));
                int peso = Integer.parseInt(tx_peso_nodo.getText());
                arbol.buscar(peso);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "No se encontro el nodo");
            } 
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Entrada incorrecta");
        }  
    }//GEN-LAST:event_bt_buscar_nodoActionPerformed

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
                int peso = Integer.parseInt(tx_peso_nodo.getText());
                arbol.eliminar(peso);
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

    private void bt_inorden_nodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inorden_nodoActionPerformed
        
    }//GEN-LAST:event_bt_inorden_nodoActionPerformed

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
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_buscar_nodo;
    private javax.swing.JButton bt_editar_nodo;
    private javax.swing.JButton bt_eliminar_nodo;
    private javax.swing.JButton bt_guardar_nodo;
    private javax.swing.JButton bt_inorden_nodo;
    private javax.swing.JLabel lb_buscar_nodo;
    private javax.swing.JLabel lb_id_nodo;
    private javax.swing.JLabel lb_inorden_nodo;
    private javax.swing.JLabel lb_nombre_nodo;
    private javax.swing.JLabel lb_peso_nodo;
    private javax.swing.JLabel lb_postorden_nodo;
    private javax.swing.JLabel lb_preorden_nodo;
    private javax.swing.JTextField tx_buscar_nodo;
    private javax.swing.JTextField tx_id_nodo;
    private javax.swing.JTextField tx_inorden_nodo;
    private javax.swing.JTextField tx_nombre_nodo;
    private javax.swing.JTextField tx_peso_nodo;
    private javax.swing.JTextField tx_postorden_nodo;
    private javax.swing.JTextField tx_preorden_nodo;
    // End of variables declaration//GEN-END:variables
}
