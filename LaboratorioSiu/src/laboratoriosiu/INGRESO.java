/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriosiu;

import java.awt.Dimension;

/**
 *
 * @author Geovani
 */
public class INGRESO extends javax.swing.JFrame {

    /**
     * Creates new form INGRESO
     */
    public INGRESO() {
        initComponents();
                this.setTitle(" SISTEMA UNIVERSIDAD SIU geovani Mendoza 995918-15407  ");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuAlumnos = new javax.swing.JMenuItem();
        jMenuMaestros = new javax.swing.JMenuItem();
        jMenuFacultades = new javax.swing.JMenuItem();
        jMenuSecciones = new javax.swing.JMenuItem();
        jMenuCarreras = new javax.swing.JMenuItem();
        jMenuCursos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 898, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        jMenu1.setText("OPCIONES");

        jMenuAlumnos.setText("ALUMNOS");
        jMenu1.add(jMenuAlumnos);

        jMenuMaestros.setText("MAESTROS");
        jMenuMaestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMaestrosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuMaestros);

        jMenuFacultades.setText("FACULTADES");
        jMenu1.add(jMenuFacultades);

        jMenuSecciones.setText("SECCIONES");
        jMenu1.add(jMenuSecciones);

        jMenuCarreras.setText("CARRERAS");
        jMenuCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCarrerasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCarreras);

        jMenuCursos.setText("CURSOS");
        jMenu1.add(jMenuCursos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("SALIR");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuMaestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMaestrosActionPerformed
        // TODO add your handling code here:
        Maestros ventanamaestros = new Maestros();
        jDesktopPane1.add(ventanamaestros);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventanamaestros.getSize();
        ventanamaestros.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ventanamaestros.show();
        
        
    }//GEN-LAST:event_jMenuMaestrosActionPerformed

    private void jMenuCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCarrerasActionPerformed
        // TODO add your handling code here:
        
        carreras ventanacarreras = new carreras();
        jDesktopPane1.add(ventanacarreras);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventanacarreras.getSize();
        ventanacarreras.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ventanacarreras.show();
        
    }//GEN-LAST:event_jMenuCarrerasActionPerformed

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
            java.util.logging.Logger.getLogger(INGRESO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INGRESO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INGRESO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INGRESO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INGRESO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuAlumnos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCarreras;
    private javax.swing.JMenuItem jMenuCursos;
    private javax.swing.JMenuItem jMenuFacultades;
    private javax.swing.JMenuItem jMenuMaestros;
    private javax.swing.JMenuItem jMenuSecciones;
    // End of variables declaration//GEN-END:variables
}
