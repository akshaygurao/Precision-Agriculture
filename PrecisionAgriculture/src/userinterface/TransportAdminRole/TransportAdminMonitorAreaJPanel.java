/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TransportAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Farmer.Farmer;
import Business.Network.Network;
import Business.Organization.HarvestingOrganization;
import Business.Organization.Organization;
import Business.Organization.TransportOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TransportWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aksha
 */
public class TransportAdminMonitorAreaJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
private UserAccount userAccount;
private Enterprise enterprise;
private HarvestingOrganization harvestingOrganization;
private TransportOrganization transportOrganization;
private EcoSystem system;
    /**
     * Creates new form TransportAdminMonitorAreaJPanel
     */
    TransportAdminMonitorAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, TransportOrganization transportOrganization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.transportOrganization = transportOrganization;
        this.system = system;
//        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
//        {
//            if(org instanceof TransportOrganization)
//            {
//                this.transportOrganization = (TransportOrganization) org;
//            }
//        }
        valueLabel.setText(enterprise.getName());
        populateTable();
    }

    private void populateTable() 
    {
        DefaultTableModel model = (DefaultTableModel) farmersAssignedToTransportJTable.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest workRequest : transportOrganization.getWorkQueue().getWorkRequestList())
        {
            Object[] row = new Object[6];
            row[0] = ((Farmer)((TransportWorkRequest)workRequest).getData()).getFarmerId();
            row[1] = ((Farmer)((TransportWorkRequest)workRequest).getData()).getFarmerName();
            row[2] = ((Farmer)((TransportWorkRequest)workRequest).getData()).getFarmSize();
            row[3] = ((Farmer)((TransportWorkRequest)workRequest).getData()).getCropName();
            row[4] = (((TransportWorkRequest)workRequest)).getStatus();
            row[5] = ((Farmer)((TransportWorkRequest)workRequest).getData());
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
        farmersAssignedToTransportJTable = new javax.swing.JTable();
        backJBtn = new javax.swing.JButton();
        transferJBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        enterpriseLabel.setText("Enterprise :");

        valueLabel.setText("<value>");

        assignedFarmersLabel.setText("Farmer's Assigned to me:");

        farmersAssignedToTransportJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Farmer ID", "Farmer Name", "Crop Selected", "Transport Status", "Status", "Object"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(farmersAssignedToTransportJTable);
        if (farmersAssignedToTransportJTable.getColumnModel().getColumnCount() > 0) {
            farmersAssignedToTransportJTable.getColumnModel().getColumn(5).setMinWidth(0);
            farmersAssignedToTransportJTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            farmersAssignedToTransportJTable.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        backJBtn.setText("<< Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });

        transferJBtn.setText("Start Transport");
        transferJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferJBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Transport Employee Monitoring Work Area Panel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(assignedFarmersLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(transferJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addComponent(assignedFarmersLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backJBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(transferJBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJBtnActionPerformed

    private void transferJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferJBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = farmersAssignedToTransportJTable.getSelectedRow();
        
        if (selectedRow < 0)
        {
           JOptionPane.showMessageDialog(null, "Please Select a Row");
           return;
        }
        
        for(Network network : system.getNetworkList())
        {
            for(Enterprise e :network.getEnterpriseDirectory().getEnterpriseList())
            {
//                if(e.getOrganizationDirectory().getOrganizationList().contains(TransportOrganization.class))
                
                {
              for(Organization organization : e.getOrganizationDirectory().getOrganizationList())
            {
                if(organization instanceof TransportOrganization)
                {
                    for(WorkRequest twr: organization.getWorkQueue().getWorkRequestList())
                    {
                        //Object o = ((TransportWorkRequest)twr).getData();
                        //System.out.println("TWR farmer id: " + ((TransportWorkRequest)twr).getFarmerUserId());
                        //System.out.println("Farmer id from Farmer : " + farmer.getFarmerId());
                        Farmer farmer = ((Farmer)((TransportWorkRequest)twr).getData());
                        int farmerId = farmer.getFarmerId();
                        if(((TransportWorkRequest)twr).getFarmerUserId() == farmerId)
                        {
                            twr.setStatus("Packaging and transport completed");
                            ((TransportWorkRequest)twr).setData(farmer);
                            
                            //statusTextFeld.setText(farmer.getStatus());
                            JOptionPane.showMessageDialog(null, "Packaging and transport completed and delievered to " + enterprise.getEnterpriseType().Distributor);
                            return;
                        }
                         
                    }
                }
            }
                }
            }
        }
         
         populateTable();

    }//GEN-LAST:event_transferJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignedFarmersLabel;
    private javax.swing.JButton backJBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTable farmersAssignedToTransportJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton transferJBtn;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
