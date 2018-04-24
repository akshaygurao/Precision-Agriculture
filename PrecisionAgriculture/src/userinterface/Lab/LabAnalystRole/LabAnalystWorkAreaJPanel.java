/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Lab.LabAnalystRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Farmer.Farmer;
import Business.Organization.IrrigationOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabWorkRequest;
import Business.WorkQueue.SowingWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SowingAdminRole.SowingAdminMonitorAreaJPanel;

/**
 *
 * @author jocel
 */
public class LabAnalystWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabAnalystWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private LabOrganization labOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;
    private EcoSystem system;
    public LabAnalystWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, LabOrganization labOrganization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.labOrganization = labOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system=system;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        assignToMeJBtn = new javax.swing.JButton();
        monitorJBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        farmersCreatedJTable1 = new javax.swing.JTable();

        jLabel1.setText("Lab Analyst Work Area Panel");

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

        farmersCreatedJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Farmer ID", "Farmer Name", "Username", "Reporting Fertilizer Admin", "Object"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(farmersCreatedJTable1);
        if (farmersCreatedJTable1.getColumnModel().getColumnCount() > 0) {
            farmersCreatedJTable1.getColumnModel().getColumn(4).setMinWidth(0);
            farmersCreatedJTable1.getColumnModel().getColumn(4).setPreferredWidth(0);
            farmersCreatedJTable1.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(assignToMeJBtn)
                        .addGap(49, 49, 49)
                        .addComponent(monitorJBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignToMeJBtn)
                    .addComponent(monitorJBtn))
                .addContainerGap(222, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignToMeJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeJBtnActionPerformed
        // TODO add your handling code here:
      int selectedRow = farmersCreatedJTable1.getSelectedRow();
       
       if (selectedRow < 0)
       {
      
          JOptionPane.showMessageDialog(null, "Please Select a Row");
           return;
       }
       Farmer farmer = (Farmer)farmersCreatedJTable1.getValueAt(selectedRow,4);
       LabWorkRequest labWorkRequest = new LabWorkRequest();
       for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList())
       {
           if(((Farmer)((LabWorkRequest)workRequest).getData()).getFarmerId()==farmer.getFarmerId())
           {
               JOptionPane.showMessageDialog(null, "Farmer is already assigned to me!!");
               return;  
           }
       }
       
       labWorkRequest.setReceiver(userAccount);
       labWorkRequest.setRequestDate(new Date());
       labWorkRequest.setStatus("In Farm Analysis Stage");
       labWorkRequest.setData(farmer);
       
       labOrganization.getWorkQueue().getWorkRequestList().add(labWorkRequest);
       userAccount.getWorkQueue().getWorkRequestList().add(labWorkRequest);
       JOptionPane.showMessageDialog(null, "Farmer assigned to me Successfully!!");
       populateTable();

    }//GEN-LAST:event_assignToMeJBtnActionPerformed

    private void monitorJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitorJBtnActionPerformed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("LabAnalystMonitorAreaJPanel", new LabAnalystMonitorWorkAreaJPanel(userProcessContainer, userAccount, labOrganization, enterprise,system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_monitorJBtnActionPerformed

    public void populateTable()
    {
        {
        DefaultTableModel model = (DefaultTableModel) farmersCreatedJTable1.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest workRequest : labOrganization.getWorkQueue().getWorkRequestList())
        {
            LabWorkRequest labWorkRequest = (LabWorkRequest) workRequest;
            Object[] row = new Object[6];
            row[0] = ((Farmer)labWorkRequest.getData()).getFarmerId();
            row[1] = ((Farmer)labWorkRequest.getData()).getFarmerName();
            row[2] =((Farmer)labWorkRequest.getData()).getUserAccount();
            row[3] = ((Farmer)labWorkRequest.getData()).getFertilizerAdminId();
            row[4] = ((Farmer)labWorkRequest.getData());
            row[5] = labWorkRequest;
            model.addRow(row);
        }
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeJBtn;
    private javax.swing.JTable farmersCreatedJTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton monitorJBtn;
    // End of variables declaration//GEN-END:variables
}
