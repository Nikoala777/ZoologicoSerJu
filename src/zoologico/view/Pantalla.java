package zoologico.view;

/**
 *
 * @author juan_
 */
public class Pantalla extends javax.swing.JFrame {
    private AnimalesView verventanaAnimales;
    private ZooView verventanaZoo;
    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        texto1Bienvenida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar1Epiko = new javax.swing.JMenuBar();
        Menu1Animales = new javax.swing.JMenu();
        CheckBoxMenuItem1Animales = new javax.swing.JCheckBoxMenuItem();
        CheckBoxMenuItem2Zoo = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(0, 0, 140));

        texto1Bienvenida.setBackground(new java.awt.Color(0, 0, 0));
        texto1Bienvenida.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        texto1Bienvenida.setForeground(new java.awt.Color(0, 105, 0));
        texto1Bienvenida.setText("¡Bienvenido al mejor Zoologico del mundo!");
        texto1Bienvenida.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(49, 78, 255));
        jLabel1.setText("En la sección superior izquierda encontrarás el acceso a las funcionalidades de nuestro zoo");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        escritorio.setLayer(texto1Bienvenida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(texto1Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(texto1Bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(494, 494, 494))
        );

        Menu1Animales.setText("Seleccionar");
        Menu1Animales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu1AnimalesActionPerformed(evt);
            }
        });

        CheckBoxMenuItem1Animales.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        CheckBoxMenuItem1Animales.setSelected(false);
        CheckBoxMenuItem1Animales.setText("Animales");
        CheckBoxMenuItem1Animales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxMenuItem1AnimalesActionPerformed(evt);
            }
        });
        Menu1Animales.add(CheckBoxMenuItem1Animales);

        CheckBoxMenuItem2Zoo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        CheckBoxMenuItem2Zoo.setSelected(false);
        CheckBoxMenuItem2Zoo.setText("Zoologico");
        CheckBoxMenuItem2Zoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxMenuItem2ZooActionPerformed(evt);
            }
        });
        Menu1Animales.add(CheckBoxMenuItem2Zoo);

        menuBar1Epiko.add(Menu1Animales);

        setJMenuBar(menuBar1Epiko);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu1AnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu1AnimalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu1AnimalesActionPerformed

    private void CheckBoxMenuItem2ZooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxMenuItem2ZooActionPerformed
        if (CheckBoxMenuItem2Zoo.isSelected()) {
            // Abrir la ventana ZooView si no está ya abierta
            if (verventanaZoo == null || verventanaZoo.isClosed()) {
                verventanaZoo = new ZooView();
                escritorio.add(verventanaZoo);
                verventanaZoo.setVisible(true);
                try {
                    verventanaZoo.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    e.printStackTrace();
                }
            }
        } else {
            // Cerrar la ventana ZooView si está abierta
            if (verventanaZoo!= null && !verventanaZoo.isClosed()) {
                try {
                    verventanaZoo.setClosed(true);
                } catch (java.beans.PropertyVetoException e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_CheckBoxMenuItem2ZooActionPerformed

    private void CheckBoxMenuItem1AnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxMenuItem1AnimalesActionPerformed
        if (CheckBoxMenuItem1Animales.isSelected()) {
            // Abrir la ventana AnimalesView si no está ya abierta
            if (verventanaAnimales == null || verventanaAnimales.isClosed()) {
                verventanaAnimales = new AnimalesView();
                escritorio.add(verventanaAnimales);
                verventanaAnimales.setVisible(true);
                try {
                    verventanaAnimales.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    e.printStackTrace();
                }
            }
        } else {
            // Cerrar la ventana AnimalesView si está abierta
            if (verventanaAnimales != null && !verventanaAnimales.isClosed()) {
                try {
                    verventanaAnimales.setClosed(true);
                } catch (java.beans.PropertyVetoException e) {
                    e.printStackTrace();
                }
            }
        }

    }//GEN-LAST:event_CheckBoxMenuItem1AnimalesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem CheckBoxMenuItem1Animales;
    private javax.swing.JCheckBoxMenuItem CheckBoxMenuItem2Zoo;
    private javax.swing.JMenu Menu1Animales;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuBar1Epiko;
    private javax.swing.JLabel texto1Bienvenida;
    // End of variables declaration//GEN-END:variables
}
