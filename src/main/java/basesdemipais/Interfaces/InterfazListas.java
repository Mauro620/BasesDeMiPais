package basesdemipais.Interfaces;

import basesdemipais.inmueble;
import basesdemipais.vector;

import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InterfazListas extends javax.swing.JFrame {
    static int ban;
    static Object[][] datos;

    public InterfazListas(int i) {
        ban = i;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jttable = new javax.swing.JTable();
        jbvender = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcbzona = new javax.swing.JComboBox<>();
        jlzona = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfhasta = new javax.swing.JTextField();
        jtfdesde = new javax.swing.JTextField();
        jbbuscar = new javax.swing.JButton();
        jbregresar = new javax.swing.JButton();
        jbborrar = new javax.swing.JButton();
        jlordenar = new javax.swing.JLabel();
        jcbordenar = new javax.swing.JComboBox<>();
        jbstats = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jttable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "title1", "title2", "title3", "title4"
                }));
        jttable.setToolTipText("");
        jScrollPane1.setViewportView(jttable);

        jbvender.setText("Vender");
        jbvender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbvenderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setText("jlabel 1");

        jcbzona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas las zonas", "Sabaneta",
                "Envigado", "Itagui", "Poblado", "Caldas", "Manrique", "Belen", "Cristorey" }));

        jlzona.setText("Zona");

        jLabel4.setText("Rango de precio");

        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jbregresar.setText("regresar");
        jbregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregresarActionPerformed(evt);
            }
        });

        jbborrar.setText("Borrar");
        jbborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbborrarActionPerformed(evt);
            }
        });

        jlordenar.setText("Ordenar");

        jcbordenar.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Mayor precio", "Menor precio" }));
        jcbordenar.setEnabled(false);

        jbstats.setText("Ver stats");
        jbstats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(160, 160, 160)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jlzona)
                                                                        .addComponent(jcbzona,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                116,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jtfdesde,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        90,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jtfhasta,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        86,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(41, 41, 41)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jcbordenar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jlordenar)))
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 452,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jbbuscar)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jbvender, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jbregresar)
                                                        .addComponent(jbborrar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jbstats))
                                                .addGap(1, 1, 1)))
                                .addGap(41, 41, 41)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jbstats)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbborrar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jbregresar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbvender)
                                                .addGap(10, 10, 10))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jlzona)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jlordenar))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jcbzona, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jtfhasta, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jtfdesde, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jbbuscar)
                                                        .addComponent(jcbordenar,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(38, 38, 38)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(58, 58, 58)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbstatsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbstatsActionPerformed
        String cadena = vector.porcentajes(basesdemipais.Interfaces.interfazInicio.getInmuebles(),
                basesdemipais.Interfaces.interfazInicio.getVendidos());
        JOptionPane.showMessageDialog(null, cadena);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        // Aquí se debe llenar la tabla con la información
        String datos[][];
        switch (ban) {
            case 1:
                jLabel1.setText("Propiedades en venta");
                String titulo[] = { "Codigo", "Tipo", "Tamaño", "Precio" };
                vector v = basesdemipais.Interfaces.interfazInicio.getInmuebles();
                datos = new String[v.getCont()][titulo.length];
                for (int i = 0; i < v.getCont(); i++) {
                    inmueble inmu = (inmueble) v.getU(i);
                    String tipo = vector.obtenerTipo(inmu);
                    datos[i][0] = "" + ((inmueble) v.getU(i)).getCodigo();
                    datos[i][1] = "" + tipo;
                    datos[i][2] = "" + ((inmueble) v.getU(i)).getTamaño();
                    datos[i][3] = "" + ((inmueble) v.getU(i)).getPrecio();

                }
                jttable.setModel(new DefaultTableModel(datos, titulo));
                jttable.setVisible(true);
                break;
            case 2:
                jLabel1.setText("Propiedades vendidas");
                jbborrar.setEnabled(false);
                String titulo2[] = { "Codigo", "Tipo", "Tamaño", "Precio" };
                vector v2 = basesdemipais.Interfaces.interfazInicio.getVendidos();
                datos = new String[v2.getCont()][titulo2.length];
                for (int i = 0; i < v2.getCont(); i++) {
                    inmueble inmu = (inmueble) v2.getU(i);
                    String tipo = vector.obtenerTipo(inmu);
                    datos[i][0] = "" + ((inmueble) v2.getU(i)).getCodigo();
                    datos[i][1] = "" + tipo;
                    datos[i][2] = "" + ((inmueble) v2.getU(i)).getTamaño();
                    datos[i][3] = "" + ((inmueble) v2.getU(i)).getPrecio();

                }
                jttable.setModel(new DefaultTableModel(datos, titulo2));
                jttable.setVisible(true);
                break;
            case 3:
                interfazInicio prueba = new interfazInicio();
                jLabel1.setText("Propiedades de " + prueba.opcion);
                jbborrar.setEnabled(false);
                String titulo3[] = { "Codigo", "Tipo", "Tamaño", "Precio", "Estado" };
                vector enVenta = basesdemipais.Interfaces.interfazInicio.getInmuebles();
                vector vendido = basesdemipais.Interfaces.interfazInicio.getVendidos();
                int cont = 0;

                for (int i = 0; i < enVenta.getCont(); i++) {
                    if (((inmueble) enVenta.getU(i)).getPropietario().getNombre() == prueba.opcion) {
                        cont += 1;
                    }
                }
                for (int i = 0; i < vendido.getCont(); i++) {
                    if (((inmueble) vendido.getU(i)).getPropietario().getNombre() == prueba.opcion) {
                        cont += 1;
                    }
                }

                vector nuevo = new vector(cont);

                for (int i = 0; i < enVenta.getCont(); i++) {
                    if (((inmueble) enVenta.getU(i)).getPropietario().getNombre() == prueba.opcion) {
                        nuevo.Adicionar(enVenta.getU(i));
                    }
                }
                for (int i = 0; i < vendido.getCont(); i++) {
                    if (((inmueble) vendido.getU(i)).getPropietario().getNombre() == prueba.opcion) {
                        nuevo.Adicionar(vendido.getU(i));
                    }
                }

                datos = new String[nuevo.getCont()][titulo3.length];
                String estado = "";
                for (int i = 0; i < nuevo.getCont(); i++) {
                    int aux = ((inmueble) nuevo.getU(i)).getCodigo();
                    for (int j = 0; j < enVenta.getCont(); j++) {
                        if (aux == ((inmueble) enVenta.getU(j)).getCodigo()) {
                            estado = "en venta";
                        }
                    }
                    for (int j = 0; j < vendido.getCont(); j++) {
                        if (aux == ((inmueble) vendido.getU(j)).getCodigo()) {
                            estado = "Vendido";
                        }
                    }

                    inmueble inmu = (inmueble) nuevo.getU(i);
                    String tipo = vector.obtenerTipo(inmu);
                    datos[i][0] = "" + ((inmueble) nuevo.getU(i)).getCodigo();
                    datos[i][1] = "" + tipo;
                    datos[i][2] = "" + ((inmueble) nuevo.getU(i)).getTamaño();
                    datos[i][3] = "" + ((inmueble) nuevo.getU(i)).getPrecio();
                    datos[i][4] = "" + estado;

                }
                jttable.setModel(new DefaultTableModel(datos, titulo3));
                jttable.setVisible(true);
                break;

        }

    }

    private void jbvenderActionPerformed(java.awt.event.ActionEvent evt) {
        int vender = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el codigo que el inmueble de el que se realizara la venta: "));
        vector v = basesdemipais.Interfaces.interfazInicio.getInmuebles();
        if (v.BuscarI(vender) != null) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog(null, "¿Seguro que quieres vender" + v.BuscarI(vender), "WARNING",
                    dialogButton);
            if (dialogButton == JOptionPane.YES_OPTION) {
                basesdemipais.Interfaces.interfazInicio.getVendidos().Adicionar(v.BuscarI(vender));
                v.Eliminar(vender);
                JOptionPane.showMessageDialog(null, "Propiedad vendida");
            } else if (dialogButton == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "No se registro la venta");
            }
        }
    }

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {
        String datos[][];
        String titulo2[] = { "Codigo", "Tipo", "Tamaño", "Precio" };
        vector v2 = basesdemipais.Interfaces.interfazInicio.getInmuebles();
        datos = new String[v2.getCont()][titulo2.length];

        double inicial = jtfdesde.getText().isEmpty() ? 0 : Double.parseDouble(jtfdesde.getText());
        double final1 = jtfhasta.getText().isEmpty() ? Double.MAX_VALUE : Double.parseDouble(jtfhasta.getText());
        String zonaSeleccionada = jcbzona.getSelectedItem().toString();

        int rowCount = 0; // Contador para el número de filas coincidentes
        for (int i = 0; i < v2.getCont(); i++) {
            inmueble inmu = (inmueble) v2.getU(i);
            String tipo = vector.obtenerTipo(inmu);

            if (inmu.getPrecio() >= inicial && inmu.getPrecio() <= final1 &&
                    (zonaSeleccionada.equals("Todas las zonas") || zonaSeleccionada.equals(inmu.getZona()))) {
                datos[rowCount][0] = "" + inmu.getCodigo();
                datos[rowCount][1] = "" + tipo;
                datos[rowCount][2] = "" + inmu.getTamaño();
                datos[rowCount][3] = "" + inmu.getPrecio();
                rowCount++;
                jcbordenar.setEnabled(true);
            }
        }

        // Redimensiona la matriz de datos si es necesario
        if (rowCount < v2.getCont()) {
            datos = Arrays.copyOf(datos, rowCount);
        }

        jttable.setModel(new DefaultTableModel(datos, titulo2));
        jttable.setVisible(true);

        if (jcbordenar.getSelectedItem().equals("Mayor precio")) {
            ordenar(datos);
            jttable.setModel(new DefaultTableModel(datos, titulo2));
            jttable.setVisible(true);
        }
    }

    private void ordenar(String[][] datos) {
        int n = datos.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                double precio1 = Double.parseDouble(datos[j][3]);
                double precio2 = Double.parseDouble(datos[j + 1][3]);

                if (precio1 < precio2) {
                    // Intercambiar las filas en la matriz datos
                    String[] temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                }
            }
        }
    }

    private void jbregresarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbregresarActionPerformed
        basesdemipais.Interfaces.interfazInicio.getObjInicio().setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_jbregresarActionPerformed

    private void jbborrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbborrarActionPerformed
        int borrar = Integer
                .parseInt(JOptionPane.showInputDialog("Ingrese el codigo que el inmueble que desea borrar: "));
        vector v = basesdemipais.Interfaces.interfazInicio.getInmuebles();
        if (v.BuscarI(borrar) != null) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog(null, "¿Seguro que quieres vender" + v.BuscarI(borrar), "WARNING",
                    dialogButton);
            if (dialogButton == JOptionPane.YES_OPTION) {
                v.Eliminar(borrar);
                JOptionPane.showMessageDialog(null, "Propiedad borrada exitosamente");
                System.out.println(basesdemipais.Interfaces.interfazInicio.getInmuebles().Mostrar());
                if (dialogButton == JOptionPane.NO_OPTION) {
                    remove(dialogButton);
                }
            }
        }
    }// GEN-LAST:event_jbborrarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazListas.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazListas.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazListas.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazListas.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazListas(ban).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbborrar;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbregresar;
    private javax.swing.JButton jbstats;
    private javax.swing.JButton jbvender;
    private javax.swing.JComboBox<String> jcbordenar;
    private javax.swing.JComboBox<String> jcbzona;
    private javax.swing.JLabel jlordenar;
    private javax.swing.JLabel jlzona;
    private javax.swing.JTextField jtfdesde;
    private javax.swing.JTextField jtfhasta;
    private javax.swing.JTable jttable;
    // End of variables declaration//GEN-END:variables
}
