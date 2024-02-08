package basesdemipais.Interfaces;

import basesdemipais.propietario;
import java.awt.Color;
import javax.swing.JOptionPane;

public class interfazAgPropietario extends javax.swing.JFrame {

    public interfazAgPropietario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfidentificacion = new javax.swing.JTextField();
        jlidentificacion = new javax.swing.JLabel();
        jlnombre = new javax.swing.JLabel();
        jtfnombre = new javax.swing.JTextField();
        jlemail = new javax.swing.JLabel();
        jtfemail = new javax.swing.JTextField();
        jltelefono = new javax.swing.JLabel();
        jtftelefono = new javax.swing.JTextField();
        jbmodificar = new javax.swing.JButton();
        jbregresar = new javax.swing.JButton();
        jblimpiar = new javax.swing.JButton();
        jbguardar = new javax.swing.JButton();
        jbbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Propietario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jlidentificacion.setForeground(new java.awt.Color(0, 0, 0));
        jlidentificacion.setText("Numero de identificación");

        jlnombre.setForeground(new java.awt.Color(0, 0, 0));
        jlnombre.setText("Nombre completo");

        jtfnombre.setEnabled(false);

        jlemail.setForeground(new java.awt.Color(0, 0, 0));
        jlemail.setText("Email");

        jtfemail.setEnabled(false);

        jltelefono.setForeground(new java.awt.Color(0, 0, 0));
        jltelefono.setText("Numero de telefono");

        jtftelefono.setEnabled(false);

        jbmodificar.setText("Modificar");
        jbmodificar.setEnabled(false);
        jbmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmodificarActionPerformed(evt);
            }
        });

        jbregresar.setText("Regresar");
        jbregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregresarActionPerformed(evt);
            }
        });

        jblimpiar.setText("Limpiar");

        jbguardar.setText("Guardar");
        jbguardar.setEnabled(false);
        jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarActionPerformed(evt);
            }
        });

        jbbuscar.setText("Buscar\n");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlidentificacion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jltelefono)))
                    .addComponent(jlnombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlemail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbregresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jblimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlidentificacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jltelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbbuscar))))
                .addGap(18, 18, 18)
                .addComponent(jlnombre)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlemail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbregresar)
                        .addGap(18, 18, 18)
                        .addComponent(jbmodificar)
                        .addGap(19, 19, 19)
                        .addComponent(jblimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jbguardar)
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbregresarActionPerformed(java.awt.event.ActionEvent evt) {

        basesdemipais.Interfaces.interfazInicio.getObjInicio().setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_jbregresarActionPerformed

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {

        boolean datos = true;
        if (jtfnombre.getText().equals("")) {
            datos = false;
            jlnombre.setForeground(Color.red);
        }
        if (jtftelefono.getText().equals("")) {
            datos = false;
            jltelefono.setForeground(Color.red);
        }
        if (jtfemail.getText().equals("")) {
            datos = false;
            jlemail.setForeground(Color.red);
        }
        if (datos) {
            int id = Integer.parseInt(jtfidentificacion.getText());
            String nombre = jtfnombre.getText();
            int telefono = Integer.parseInt(jtftelefono.getText());
            String email = jtfemail.getText();
            propietario p = new propietario(id, nombre, email, telefono);
            if (basesdemipais.Interfaces.interfazInicio.getPropietarios().Adicionar(p)) {
                JOptionPane.showMessageDialog(null, "Cliente creado");
                limpiar();
                basesdemipais.Interfaces.interfazInicio.getObjInicio().setVisible(true);
                this.setVisible(false);
            } else
                JOptionPane.showMessageDialog(null, "Error 500: Comuniquese con "
                        + "el administrador");
        } else
            JOptionPane.showMessageDialog(null, "Información incompleta");
    }// GEN-LAST:event_jbguardarActionPerformed

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbbuscarActionPerformed
        if (!jtfidentificacion.getText().equals("")) {
            int id = Integer.parseInt(jtfidentificacion.getText());
            propietario p = basesdemipais.Interfaces.interfazInicio.getPropietarios().Buscar((id));
            if (p != null) // Cliente ya estaba registrado.
            {
                JOptionPane.showMessageDialog(null, "Propietario encontrado (Solo modificar)");
                jtfidentificacion.setEnabled(false);
                jtfnombre.setText(p.getNombre());
                jtfnombre.setEnabled(true);
                jtftelefono.setText(String.valueOf(p.getTelefono()));
                jtftelefono.setEnabled(true);
                jbguardar.setEnabled(false);
                jbmodificar.setEnabled(true);
                jtfemail.setText(p.getEmail());
                jtfemail.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "¡Propietario nuevo! complete la información");
                jtfidentificacion.setEnabled(false);
                jtfnombre.setEnabled(true);
                jbguardar.setEnabled(true);
                jbmodificar.setEnabled(false);
                jtfemail.setEnabled(true);
                jtftelefono.setEnabled(true);
            }
        }
    }// GEN-LAST:event_jbbuscarActionPerformed

    private void jbmodificarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbmodificarActionPerformed
        propietario p = basesdemipais.Interfaces.interfazInicio.getPropietarios()
                .Buscar(Integer.parseInt(jtfidentificacion.getText()));
        p.setNombre(jtfnombre.getText());
        p.setTelefono(Integer.parseInt(jtftelefono.getText()));
        p.setEmail(jtfemail.getText());
        JOptionPane.showMessageDialog(null, "Información guardada");
        limpiar();
        basesdemipais.Interfaces.interfazInicio.getObjInicio().setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_jbmodificarActionPerformed

    public void limpiar() {
        jtfidentificacion.setText("");
        jtfnombre.setText("");
        jtfemail.setText("");
        jtftelefono.setText("");
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfazAgPropietario.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazAgPropietario.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazAgPropietario.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazAgPropietario.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazAgPropietario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbguardar;
    private javax.swing.JButton jblimpiar;
    private javax.swing.JButton jbmodificar;
    private javax.swing.JButton jbregresar;
    private javax.swing.JLabel jlemail;
    private javax.swing.JLabel jlidentificacion;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JLabel jltelefono;
    private javax.swing.JTextField jtfemail;
    private javax.swing.JTextField jtfidentificacion;
    private javax.swing.JTextField jtfnombre;
    private javax.swing.JTextField jtftelefono;
    // End of variables declaration//GEN-END:variables
}
