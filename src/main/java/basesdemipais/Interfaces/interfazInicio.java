package basesdemipais.Interfaces;

import basesdemipais.propietario;
import basesdemipais.vector;
import javax.swing.JOptionPane;

public class interfazInicio extends javax.swing.JFrame {
    static interfazInicio objInicio;
    static vector inmuebles = new vector(30);
    static vector propietarios = new vector(30);
    static vector vendidos = new vector(30);
    public static String opcion;

    public static vector getInmuebles() {
        return inmuebles;
    }

    public static vector getVendidos() {
        return vendidos;
    }

    public static vector getPropietarios() {
        return propietarios;
    }

    // defino el metodo get para el objeto de la interfaz
    public static interfazInicio getObjInicio() {
        return objInicio;
    }

    public interfazInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jltitulo = new javax.swing.JLabel();
        jlinmuebles = new javax.swing.JLabel();
        jlacciones = new javax.swing.JLabel();
        jbagregarpropietario = new javax.swing.JButton();
        jbagregarpropiedad = new javax.swing.JButton();
        jbenventa = new javax.swing.JButton();
        jbvendidas = new javax.swing.JButton();
        jtfingresarcodigo = new javax.swing.JTextField();
        jbbuscar = new javax.swing.JButton();
        jlingresarcodigo = new javax.swing.JLabel();
        jbverporpropietario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setTitle("Inicio");
        setBackground(new java.awt.Color(204, 0, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jltitulo.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jltitulo.setText("Bases de mi país");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jltitulo)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(jltitulo)
                                .addGap(14, 14, 14)));

        jlinmuebles.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jlinmuebles.setText("Inmuebles");

        jlacciones.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jlacciones.setText("Acciones");

        jbagregarpropietario.setText("Agregar Propietario");
        jbagregarpropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbagregarpropietarioActionPerformed(evt);
            }
        });

        jbagregarpropiedad.setText("Agregar Propiedad");
        jbagregarpropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbagregarpropiedadActionPerformed(evt);
            }
        });

        jbenventa.setText("Ver propiedades en venta");
        jbenventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbenventaActionPerformed(evt);
            }
        });

        jbvendidas.setText("Ver propiedades vendidas");
        jbvendidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbvendidasActionPerformed(evt);
            }
        });

        jtfingresarcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfingresarcodigoActionPerformed(evt);
            }
        });

        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jlingresarcodigo.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jlingresarcodigo.setText("Ingrese codigo de la propiedad:");
        jlingresarcodigo.setToolTipText("");

        jbverporpropietario.setText("Ver propiedades por propietario");
        jbverporpropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbverporpropietarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlingresarcodigo)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jlacciones)
                                                                        .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                                .addComponent(jbagregarpropiedad,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                                .addComponent(jbagregarpropietario,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)))
                                                                .addGap(81, 81, 81))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jtfingresarcodigo)
                                                                .addGap(38, 38, 38)))
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jlinmuebles)
                                                        .addComponent(jbenventa)
                                                        .addComponent(jbvendidas)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(55, 55, 55)
                                                                .addComponent(jbbuscar))
                                                        .addComponent(jbverporpropietario))))
                                .addContainerGap(11, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlacciones)
                                        .addComponent(jlinmuebles))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbagregarpropietario)
                                        .addComponent(jbenventa))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbagregarpropiedad)
                                        .addComponent(jbvendidas))
                                .addGap(18, 18, 18)
                                .addComponent(jbverporpropietario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58,
                                        Short.MAX_VALUE)
                                .addComponent(jlingresarcodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtfingresarcodigo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbbuscar))
                                .addGap(37, 37, 37)));

        pack();
    }

    private void jbenventaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbenventaActionPerformed
        InterfazListas lista = new InterfazListas(1);
        lista.setVisible(true);
        this.setVisible(false);
    }

    private void jbvendidasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbvendidasActionPerformed
        InterfazListas lista = new InterfazListas(2);
        lista.setVisible(true);
        this.setVisible(false);
    }

    private void jbverporpropietarioActionPerformed(java.awt.event.ActionEvent evt) {
        String menu[] = new String[getPropietarios().getCont()];
        vector propi = getPropietarios();
        for (int i = 0; i < menu.length; i++) {
            menu[i] = ((propietario) propi.getU(i)).getNombre();
        }

        opcion = (String) JOptionPane.showInputDialog(null, "Seleccione un"
                + " propietario", "Lista de propietarios", 1, null, menu, menu[0]);

        // Abrir interfaz con el caso 3 donde nos mostrara la tabla de propiedades segun
        // el usuario
        InterfazListas lista = new InterfazListas(3);
        lista.setVisible(true);
        this.setVisible(false);

    }

    private void jbagregarpropietarioActionPerformed(java.awt.event.ActionEvent evt) {
        new interfazAgPropietario().setVisible(true);
        this.setVisible(false);
    }

    private void jbagregarpropiedadActionPerformed(java.awt.event.ActionEvent evt) {
        new interfazAgInmueble().setVisible(true);
        this.setVisible(false);
    }

    private void jtfingresarcodigoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {
        int codigo = Integer.parseInt(jtfingresarcodigo.getText());
        if (basesdemipais.Interfaces.interfazInicio.getInmuebles().BuscarInmueble(codigo) != null) {
            JOptionPane.showMessageDialog(null,
                    basesdemipais.Interfaces.interfazInicio.getInmuebles()
                            .BuscarInmueble(Integer.parseInt(jtfingresarcodigo.getText())));
        }
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
            java.util.logging.Logger.getLogger(interfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                objInicio = new interfazInicio();
                objInicio.setVisible(true);
            }
        });
    }

    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbagregarpropiedad;
    private javax.swing.JButton jbagregarpropietario;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbenventa;
    private javax.swing.JButton jbvendidas;
    private javax.swing.JButton jbverporpropietario;
    private javax.swing.JLabel jlacciones;
    private javax.swing.JLabel jlingresarcodigo;
    private javax.swing.JLabel jlinmuebles;
    private javax.swing.JLabel jltitulo;
    private javax.swing.JTextField jtfingresarcodigo;
    // End of variables declaration

}
