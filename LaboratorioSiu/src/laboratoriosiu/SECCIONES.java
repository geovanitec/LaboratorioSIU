/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriosiu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static laboratoriosiu.ALUMNOS.password;
import static laboratoriosiu.ALUMNOS.server;
import static laboratoriosiu.ALUMNOS.user;

/**
 *
 * @author Geovani
 */
public class SECCIONES extends javax.swing.JInternalFrame {

    
    
     public static String db = "universidad";
    public static String user = "root";
    public static String password = "Cagada1234";
    public static String host = "localhost";
    public static String server = "jdbc:mysql://"+ host + "/" +db;
    /**
     * Creates new form SECCIONES
     */
    public SECCIONES() {
        initComponents();
         this.setTitle(" SECCIONES geovani Mendoza 995918-15407  FORM secciones");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreSeccion = new javax.swing.JTextField();
        txtCodigoSeccion = new javax.swing.JTextField();
        txtEstatus = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setVisible(true);

        jButton1.setText("SECCIONES");

        jLabel1.setText("CODIGO SECCION");

        jLabel2.setText("NOMBRE SECCION");

        jLabel3.setText("ESTATUS SECCION");

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnEliminar)
                                .addGap(44, 44, 44)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        
try{
            
             Connection cn = DriverManager.getConnection(server, user, password);
             PreparedStatement pst = cn.prepareStatement("insert into secciones values(?,?,?)");
            
            // pst.setString(1, "0");
            pst.setString(1, txtCodigoSeccion.getText().trim());
            pst.setString(2, txtNombreSeccion.getText().trim());
           
            pst.setString(3, txtEstatus.getText().trim());
            
            
            JOptionPane.showMessageDialog(null, "ALUMNO Registrado.");
            
            
            pst.executeUpdate();
            
           
            txtCodigoSeccion.setText("");
            
            txtNombreSeccion.setText("");
            
            txtEstatus.setText("");
            
           
            
        }catch(Exception e){
            
           
            
        }


        














// TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        
         try {
            String codigoSecciones = txtBuscar.getText().trim();
            
                   Connection cn = DriverManager.getConnection(server, user, password);
            PreparedStatement pst = cn.prepareStatement("update secciones set codigoSecciones = ?, nombreSecciones = ?  , estatusAlumnos = ? where codigoSecciones = " + codigoSecciones);
            
      pst.setString(1, txtCodigoSeccion.getText().trim());
            pst.setString(2, txtNombreSeccion.getText().trim());
          
            pst.setString(3, txtEstatus.getText().trim());
            
            pst.executeUpdate();
            
            
             txtNombreSeccion.setText("");
            
            txtEstatus.setText("");
            txtEstatus.setText("");
            
            JOptionPane.showMessageDialog(null, "Modificación exitosa.");
            
        } catch (Exception e) {
        }
        




// TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        


try{
                Connection cn = DriverManager.getConnection(server, user, password);
                       PreparedStatement pst = cn.prepareStatement("select * from secciones where codigoSecciones = ?");
            
            //aca busca que tiene el txt 
            pst.setString(1, txtBuscar.getText().trim());
            
            /// aca ejecuta el query
            ResultSet rs = pst.executeQuery();
            
            
            if(rs.next()){
                txtCodigoSeccion.setText(rs.getString("codigoSecciones"));
                txtNombreSeccion.setText(rs.getString("nombreSecciones"));
                
                txtEstatus.setText(rs.getString("estatusSecciones"));
                
            } else {
                JOptionPane.showMessageDialog(null, "seccion registrado.");
            }
            
        }catch (Exception e){
            
        }






// TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

          try {
            
              Connection cn = DriverManager.getConnection(server, user, password);
            PreparedStatement pst = cn.prepareStatement("delete from secciones where codigoSecciones = ? " );
            
            pst.setString(1, txtBuscar.getText().trim());
            pst.executeUpdate();
            
            txtCodigoSeccion.setText("");
            
            txtNombreSeccion.setText("");
            
            txtEstatus.setText("");
            
            JOptionPane.showMessageDialog(null, "eliminacion exitosa.");
            
         
            
        } catch (Exception e) {
        }









// TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigoSeccion;
    private javax.swing.JTextField txtEstatus;
    private javax.swing.JTextField txtNombreSeccion;
    // End of variables declaration//GEN-END:variables
}
