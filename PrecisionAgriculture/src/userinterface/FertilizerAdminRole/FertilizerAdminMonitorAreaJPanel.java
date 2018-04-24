/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FertilizerAdminRole;

import Business.Enterprise.Enterprise;
import Business.Organization.FertilizerOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.Farmer.Farmer;
import Business.Organization.HarvestingOrganization;
import Business.Organization.Organization;
import Business.WorkQueue.FertilizerWorkRequest;
import Business.WorkQueue.HarvestingWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jocel
 */
public class FertilizerAdminMonitorAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FertilizerAdminWorkAreaJPanel
     */
    
     private JPanel userProcessContainer;
    private FertilizerOrganization fertilizerOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private HarvestingOrganization harvestingOrganization;
    
    FertilizerAdminMonitorAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, FertilizerOrganization fertilizerOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        //this.fertilizerOrganization = fertilizerOrganization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof HarvestingOrganization)
            {
                this.harvestingOrganization = (HarvestingOrganization) org;
            }
        }
        valueLabel.setText(enterprise.getName());
        populateTable();
    }

    private void populateTable() 
    {
        DefaultTableModel model = (DefaultTableModel) farmersAssignedToFertilizerJTable.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList())
        {
            Object[] row = new Object[7];
            row[0] = ((Farmer)((FertilizerWorkRequest)workRequest).getData()).getFarmerId();
            row[1] = ((Farmer)((FertilizerWorkRequest)workRequest).getData()).getFarmerName();
            row[2] = ((Farmer)((FertilizerWorkRequest)workRequest).getData()).getFarmSize();
            row[3] = ((Farmer)((FertilizerWorkRequest)workRequest).getData()).getCropName();
            row[4] = (((FertilizerWorkRequest)workRequest)).getStatus();
            row[5] = ((Farmer)((FertilizerWorkRequest)workRequest).getData());
            row[6] = ((Farmer)((FertilizerWorkRequest)workRequest).getData()).getStatus();
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

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        assignedFarmersLabel = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        farmersAssignedToFertilizerJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        backJBtn = new javax.swing.JButton();
        selectFarmerAssignedLabel = new javax.swing.JLabel();
        reportToHarvestingAdminJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        enterpriseLabel.setText("Enterprise :");

        valueLabel.setText("<value>");

        assignedFarmersLabel.setText("Farmer's Assigned to me:");

        farmersAssignedToFertilizerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Farmer ID", "Farmer Name", "Farm Size", "Crop Selected", "Fertilization Status", "Object", "Farmer Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(farmersAssignedToFertilizerJTable);
        if (farmersAssignedToFertilizerJTable.getColumnModel().getColumnCount() > 0) {
            farmersAssignedToFertilizerJTable.getColumnModel().getColumn(5).setMinWidth(0);
            farmersAssignedToFertilizerJTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            farmersAssignedToFertilizerJTable.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        backJBtn.setText("<< Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });

        selectFarmerAssignedLabel.setText("Select Farmer to Report to Harvesting Admin:");

        reportToHarvestingAdminJButton.setText("Report");
        reportToHarvestingAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportToHarvestingAdminJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Fertilizer Employee Monitoring Panel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(1008, 1008, 1008))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(assignedFarmersLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectFarmerAssignedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reportToHarvestingAdminJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(assignedFarmersLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportToHarvestingAdminJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectFarmerAssignedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(457, 457, 457))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJBtnActionPerformed

    private void reportToHarvestingAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportToHarvestingAdminJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = farmersAssignedToFertilizerJTable.getSelectedRow();
        
        if (selectedRow < 0)
        {
           JOptionPane.showMessageDialog(null, "Please Select a Row");
           return;
        }
        
        String status = (String)farmersAssignedToFertilizerJTable.getValueAt(selectedRow, 4);
//        if(!status.equalsIgnoreCase("Fertilization Done"))
//        {
//            JOptionPane.showMessageDialog(null, "Fertilization is not done yet. So you can't report to harvesting admin");
//            return;
//        }
        
        Farmer farmer = (Farmer)farmersAssignedToFertilizerJTable.getValueAt(selectedRow, 5);
        HarvestingWorkRequest harvestingWorkRequest = new HarvestingWorkRequest();
        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList())
        {
            if(((Farmer)((FertilizerWorkRequest)workRequest).getData()).getStatus().equalsIgnoreCase("Reported"))
            {
            JOptionPane.showMessageDialog(null, "Farmer is already reported!!");
            return;  
            }
        }
        
        harvestingWorkRequest.setReceiver(userAccount);
        harvestingWorkRequest.setRequestDate(new Date());
        harvestingWorkRequest.setStatus("Reported to Harvesting Organization");
        harvestingWorkRequest.setFarmerUserId(farmer.getFarmerId());
        farmer.setStatus("Reported to Harvesting Organization");
        harvestingWorkRequest.setData(farmer);
        
        harvestingOrganization.getWorkQueue().getWorkRequestList().add(harvestingWorkRequest);
        //userAccount.getWorkQueue().getWorkRequestList().add(irrigationWorkRequest);
         JOptionPane.showMessageDialog(null, "Farmer reported Successfully!!");
         populateTable();
    }//GEN-LAST:event_reportToHarvestingAdminJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignedFarmersLabel;
    private javax.swing.JButton backJBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTable farmersAssignedToFertilizerJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton reportToHarvestingAdminJButton;
    private javax.swing.JLabel selectFarmerAssignedLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
