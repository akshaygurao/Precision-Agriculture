/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TransportAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Farmer.Farmer;
import Business.Organization.TransportOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TransportWorkRequest;
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
public class TransportAdminWorkAreaJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
private UserAccount userAccount;
private Enterprise enterprise;
private TransportOrganization transportOrganization;
private EcoSystem system;
    /**
     * Creates new form TransportAdminWorkAreaJPanel
    */

    public TransportAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, TransportOrganization transportOrganization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.transportOrganization = transportOrganization;
        this.enterprise = enterprise;
        this.system = system;
        populateTable();
    }

    private void populateTable() 
    {
        DefaultTableModel model = (DefaultTableModel) farmersCreatedJTable.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest workRequest : transportOrganization.getWorkQueue().getWorkRequestList())
        {
            TransportWorkRequest transportWorkRequest = (TransportWorkRequest) workRequest;
            Object[] row = new Object[6];
             row[0] = ((Farmer)transportWorkRequest.getData()).getFarmerId();
            row[1] = ((Farmer)transportWorkRequest.getData()).getFarmerName();
            row[2] = transportWorkRequest.getData();
//            row[2] =((Farmer)sowingWorkRequest.getData()).getUserAccount().getUsername();
//            row[3] = ((Farmer)sowingWorkRequest.getData()).getSowingAdminId();
//            row[4] = ((Farmer)sowingWorkRequest.getData());
//            row[5] = sowingWorkRequest;
            
            
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
                "Farmer ID", "Farmer Name", "Object"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
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

        jLabel1.setText("Transport Employee Work Area Panel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(assignToMeJBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(monitorJBtn))
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignToMeJBtn)
                    .addComponent(monitorJBtn))
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void monitorJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitorJBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("TransportAdminMonitorAreaJPanel", new TransportAdminMonitorAreaJPanel(userProcessContainer, userAccount, transportOrganization, enterprise , system));
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
        TransportWorkRequest transportWorkRequest = new TransportWorkRequest();
        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList())
        {
            if(((Farmer)((TransportWorkRequest)workRequest).getData()).getFarmerId()==farmer.getFarmerId())
            {
                JOptionPane.showMessageDialog(null, "Farmer is already assigned to me!!");
                return;  
            }
        }
        
        transportWorkRequest.setReceiver(userAccount);
        transportWorkRequest.setRequestDate(new Date());
        transportWorkRequest.setStatus("Harvesting Done");
        transportWorkRequest.setData(farmer);
        
        transportOrganization.getWorkQueue().getWorkRequestList().add(transportWorkRequest);
        userAccount.getWorkQueue().getWorkRequestList().add(transportWorkRequest);
         JOptionPane.showMessageDialog(null, "Farmer assigned to me Successfully!!");
                              
    }//GEN-LAST:event_assignToMeJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeJBtn;
    private javax.swing.JTable farmersCreatedJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton monitorJBtn;
    // End of variables declaration//GEN-END:variables
}