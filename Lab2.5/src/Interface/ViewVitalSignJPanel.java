/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ViewVitalSignJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalSignJPanel
     */
    private VitalSignHistory vsh;
   double maxValue;
   double minValue;
    public ViewVitalSignJPanel(VitalSignHistory vsh) {
        
        initComponents();
        this.vsh=vsh;
        populateTable();
    }
    
    public void populateTable(){
     DefaultTableModel dtm = (DefaultTableModel)tblVitalSigns.getModel();
        dtm.setRowCount(0);
        
        for(VitalSigns vs : vsh.getVitalSignHistory()){
            Object row[] = new Object[2];
            row[0] = vs;
            row[1] = vs.getBloodPressure();
            dtm.addRow(row);
    }   
    }
    private void setAllEnabled(boolean b){
        tempTextField.setEnabled(b);
        bloodPressureTextField.setEnabled(b);
        pulseTextField.setEnabled(b);
        dateTextField.setEnabled(b);
        
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTemp = new javax.swing.JLabel();
        tempTextField = new javax.swing.JTextField();
        lblBloodPressure = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bloodPressureTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pulseTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnconfirm = new javax.swing.JButton();

        lblTemp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTemp.setText("View Vital Signs");

        tempTextField.setEnabled(false);

        lblBloodPressure.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblBloodPressure.setText("Temperature :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Blood Pressure :");

        bloodPressureTextField.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Pulse :");

        pulseTextField.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Date :");

        dateTextField.setEnabled(false);

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitalSigns);

        btnViewDetails.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnconfirm.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnconfirm.setText("Confirm");
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(lblTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBloodPressure)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pulseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnconfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTemp)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pulseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnupdate)
                        .addGap(16, 16, 16)
                        .addComponent(btnDel)
                        .addGap(18, 18, 18)
                        .addComponent(btnconfirm)
                        .addGap(39, 39, 39))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        int selectedrow = tblVitalSigns.getSelectedRow();
        if (selectedrow>=0)
        {
            VitalSigns vs =(VitalSigns)tblVitalSigns.getValueAt(selectedrow, 0);
            bloodPressureTextField.setText(String.valueOf(vs.getBloodPressure()));
            tempTextField.setText(String.valueOf(vs.getTemperature()));
            pulseTextField.setText(String.valueOf(vs.getPulse()));
            dateTextField.setText(vs.getDate());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "please Select any Row");
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        int selectedrow = tblVitalSigns.getSelectedRow();
        setAllEnabled(true);
        if(selectedrow>=0)
        {
            VitalSigns vs =(VitalSigns)tblVitalSigns.getValueAt(selectedrow, 0);
            this.tempTextField.setText(vs.getTemperature()+"");
            this.bloodPressureTextField.setText(vs.getBloodPressure()+"");
            this.pulseTextField.setText(vs.getPulse()+"");
            this.dateTextField.setText(vs.getDate()+"");
        }else{
            JOptionPane.showMessageDialog(null, "Select any Row");
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed

        int selectedrow = tblVitalSigns.getSelectedRow();
        if (selectedrow>=0)
        {
            VitalSigns vs =(VitalSigns)tblVitalSigns.getValueAt(selectedrow, 0);
            vsh.deletevitals(vs);
            JOptionPane.showMessageDialog(null, "Vital sign has been deleted");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "please Select any Row");
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        int selectedrow = tblVitalSigns.getSelectedRow();
        if (selectedrow>=0)
        {
            VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedrow, 0);
            vs.setTemperature(Double.parseDouble(tempTextField.getText()));
            vs.setBloodPressure(Double.parseDouble(tempTextField.getText()));
            vs.setPulse(Integer.parseInt(pulseTextField.getText()));
            vs.setDate(dateTextField.getText());
            populateTable();
            setAllEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Details Updated Successfully");

        }
    }//GEN-LAST:event_btnconfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodPressureTextField;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JButton btnconfirm;
    private javax.swing.JButton btnupdate;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JTextField tempTextField;
    // End of variables declaration//GEN-END:variables

    

    
}

   