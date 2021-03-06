/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FertilizerAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Farmer.Farmer;
import Business.Organization.FertilizerOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FertilizerWorkRequest;
import Business.WorkQueue.IrrigationWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aksha
 */
public class FertilizerAdminWorkAreaPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private FertilizerOrganization fertilizerOrganization;
    /**
     * Creates new form SowingAdminWorkAreaPanel
     */
    

    public FertilizerAdminWorkAreaPanel(JPanel userProcessContainer, UserAccount account, FertilizerOrganization fertilizerOrganization, Enterprise enterprise, EcoSystem system, LabOrganization labOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
       //this.organization = organization;
       this.fertilizerOrganization = fertilizerOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        populateTable();
    }

    private void populateTable() 
    {
        DefaultTableModel model = (DefaultTableModel) farmersCreatedJTable.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest workRequest : fertilizerOrganization.getWorkQueue().getWorkRequestList())
        {
            FertilizerWorkRequest fertilizerWorkRequest = (FertilizerWorkRequest) workRequest;
            Object[] row = new Object[4];
            row[0] = ((Farmer)fertilizerWorkRequest.getData()).getFarmerId();
            row[1] = ((Farmer)fertilizerWorkRequest.getData()).getFarmerName();
            row[2] = (Farmer)fertilizerWorkRequest.getData();
//            row[2] =((Farmer)fertilizerWorkRequest.getData()).getUserAccount().getUsername();
//            row[3] = ((Farmer)fertilizerWorkRequest.getData()).getSowingAdminId();
//            row[4] = ((Farmer)fertilizerWorkRequest.getData());
            row[3] = fertilizerWorkRequest;
            
            
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        farmersCreatedJTable = new javax.swing.JTable();
        assignToMeJBtn = new javax.swing.JButton();
        monitorJBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        farmersCreatedJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Farmer ID", "Farmer Name", "Object", "Object"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(farmersCreatedJTable);
        if (farmersCreatedJTable.getColumnModel().getColumnCount() > 0) {
            farmersCreatedJTable.getColumnModel().getColumn(2).setMinWidth(0);
            farmersCreatedJTable.getColumnModel().getColumn(2).setPreferredWidth(0);
            farmersCreatedJTable.getColumnModel().getColumn(2).setMaxWidth(0);
            farmersCreatedJTable.getColumnModel().getColumn(3).setMinWidth(0);
            farmersCreatedJTable.getColumnModel().getColumn(3).setPreferredWidth(0);
            farmersCreatedJTable.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        assignToMeJBtn.setText("Assign to me");
        assignToMeJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeJBtnActionPerformed(evt);
            }
        });

        monitorJBtn.setText("Monitor Assigned Farmers");
        monitorJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitorJBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Fertilizer Employee Work Area Panel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(assignToMeJBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(monitorJBtn))
                            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignToMeJBtn)
                    .addComponent(monitorJBtn))
                .addContainerGap(258, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void monitorJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitorJBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("FertilizerAdminMonitorAreaJPanel", new FertilizerAdminMonitorAreaJPanel(userProcessContainer, userAccount, fertilizerOrganization, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_monitorJBtnActionPerformed

    private void assignToMeJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeJBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = farmersCreatedJTable.getSelectedRow();
        
        if (selectedRow < 0)
        {
       
           JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
        Farmer farmer = (Farmer)farmersCreatedJTable.getValueAt(selectedRow, 2);
        farmer.setFertilizerAdminId(userAccount.getEmployee().getId());
        FertilizerWorkRequest fertilizerWorkRequest = (FertilizerWorkRequest)farmersCreatedJTable.getValueAt(selectedRow, 3);
        //FertilizerWorkRequest fertilizerWorkRequest = new FertilizerWorkRequest();
        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList())
        {
            if(((Farmer)((FertilizerWorkRequest)workRequest).getData()).getFarmerId()==farmer.getFarmerId())
            {
                JOptionPane.showMessageDialog(null, "Farmer is already assigned to me!!");
                return;  
            }
        }
        
        
        //fertilizerOrganization.getWorkQueue().getWorkRequestList().add(fertilizerWorkRequest);
        userAccount.getWorkQueue().getWorkRequestList().add(fertilizerWorkRequest);
        JOptionPane.showMessageDialog(null, "Farmer assigned to me Successfully!!");
        return;
    }//GEN-LAST:event_assignToMeJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeJBtn;
    private javax.swing.JTable farmersCreatedJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton monitorJBtn;
    // End of variables declaration//GEN-END:variables
}
