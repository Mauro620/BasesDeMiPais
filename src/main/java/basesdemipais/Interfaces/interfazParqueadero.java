/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package basesdemipais.Interfaces;

import basesdemipais.parqueadero;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author celislinux
 */
public class interfazParqueadero extends javax.swing.JFrame {

    /**
     * Creates new form interfazParqueadero
     */
    public interfazParqueadero() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jltitulo = new javax.swing.JLabel();
        jldesc = new javax.swing.JLabel();
        jldesc2 = new javax.swing.JLabel();
        jcbtipodeparqueadero = new javax.swing.JComboBox<>();
        jltipodeparqueadero = new javax.swing.JLabel();
        jbguardar = new javax.swing.JButton();
        jbimagen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(653, 463));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jltitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jltitulo.setForeground(new java.awt.Color(255, 255, 255));
        jltitulo.setText("Agregar un parqueadero");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jltitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jltitulo)
                .addGap(21, 21, 21))
        );

        jldesc.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jldesc.setForeground(new java.awt.Color(0, 0, 0));
        jldesc.setText("En esta sección podras agregar un parqueadero que estará bajo nuestra responsabilidad.");

        jldesc2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jldesc2.setForeground(new java.awt.Color(0, 0, 0));
        jldesc2.setText("Los siguientes items son necesarios para agregar un parqueadero.");

        jcbtipodeparqueadero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Sencillo", "Doble lineal", "Doble" }));
        jcbtipodeparqueadero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbtipodeparqueaderoFocusGained(evt);
            }
        });

        jltipodeparqueadero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jltipodeparqueadero.setForeground(new java.awt.Color(0, 0, 0));
        jltipodeparqueadero.setText("Tipo de parqueadero:");

        jbguardar.setText("Guardar");
        jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarActionPerformed(evt);
            }
        });

        jbimagen.setBackground(new java.awt.Color(60, 63, 65));
        jbimagen.setIcon(new javax.swing.ImageIcon("/home/celislinux/NetBeansProjects/BasesDeMiPais/src/main/java/basesdemipais/BASES DE MI PAIS.png")); // NOI18N
        jbimagen.setBorder(null);
        jbimagen.setBorderPainted(false);
        jbimagen.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jltipodeparqueadero, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbtipodeparqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jbguardar)
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jldesc2)
                    .addComponent(jldesc))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jldesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jldesc2)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jltipodeparqueadero)
                        .addGap(1, 1, 1)
                        .addComponent(jcbtipodeparqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(jbguardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbtipodeparqueaderoFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jcbtipodeparqueaderoFocusGained
        jcbtipodeparqueadero.setBackground(Color.WHITE);
    }

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {
        boolean par = true;
        if (jcbtipodeparqueadero.getSelectedItem().equals("Seleccione")) {
            par = false;
            jcbtipodeparqueadero.setBackground(new java.awt.Color(255, 0, 51));
        }
        if (par == false) {
            JOptionPane.showMessageDialog(null, "Datos invalidos");
        }
        if (par) {
            String tipoParqueadero = (String) jcbtipodeparqueadero.getSelectedItem();

            interfazAgInmueble prueba = new interfazAgInmueble();
            parqueadero parqueadero = new parqueadero(prueba.codigo, prueba.p, prueba.tamano, prueba.direccion,
                    prueba.precio, prueba.zona, tipoParqueadero);

            if (basesdemipais.Interfaces.interfazInicio.getInmuebles().Adicionar(parqueadero)) {
                JOptionPane.showMessageDialog(null, "Inmueble creado");
                basesdemipais.Interfaces.interfazInicio.getObjInicio().setVisible(true);
                this.setVisible(false);
            }
        }
    }// GEN-LAST:event_jbguardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfazParqueadero.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazParqueadero.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazParqueadero.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazParqueadero.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazParqueadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbguardar;
    private javax.swing.JButton jbimagen;
    private javax.swing.JComboBox<String> jcbtipodeparqueadero;
    private javax.swing.JLabel jldesc;
    private javax.swing.JLabel jldesc2;
    private javax.swing.JLabel jltipodeparqueadero;
    private javax.swing.JLabel jltitulo;
    // End of variables declaration//GEN-END:variables
}
