/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FarmerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Farmer.Farmer;
import Business.Initialization;
import Business.Lab.LabResults;
import Business.Lab.LabResultsDirectory;
import Business.Network.Network;
import Business.Organization.FertilizerOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.SowingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FertilizerWorkRequest;
import Business.WorkQueue.IrrigationWorkRequest;
import Business.WorkQueue.LabWorkRequest;
import Business.WorkQueue.SowingWorkRequest;
import Business.WorkQueue.WorkRequest;
import com.sun.corba.se.spi.orbutil.threadpool.Work;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aksha
 */

public class FertilizingTaskWorkAreaJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
private OrganizationDirectory organizationDirectory;
private Farmer farmer;
private Initialization initialization;
private UserAccount userAccount;
private FertilizerWorkRequest fertilizerWorkRequest;
private LabWorkRequest labWorkRequest;
private LabOrganization labOrganization;
private EcoSystem system;
private LabResultsDirectory lb;
  
    /**
     * Creates new form FertilizingTaskWorkAreaJPanel
     */
    

    FertilizingTaskWorkAreaJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory,Initialization initialization, Farmer farmer,EcoSystem system,LabOrganization labOrganizatio) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory=organizationDirectory;
        this.farmer=farmer;
        this.initialization=initialization;
        this.userAccount = farmer.getUserAccount();
        this.fertilizerWorkRequest = new FertilizerWorkRequest();
        labWorkRequest=new LabWorkRequest();
        this.system=system;
        this.lb = new LabResultsDirectory();
        this.labOrganization = labOrganizatio;
        
        for(Network network : system.getNetworkList())
       {
           for(Enterprise e :network.getEnterpriseDirectory().getEnterpriseList())
           {
               //if(e.getOrganizationDirectory().getOrganizationList().contains(TransportOrganization.class))
               
               {
                   for(Organization org : e.getOrganizationDirectory().getOrganizationList())
               {
                   if(org instanceof LabOrganization)
                   {
                       labOrganization = (LabOrganization) org;
                       break;
                   }
               }
               }
               
           }
       }
        
        if(labOrganization != null)
        {
            
        for(WorkRequest wr : labOrganization.getWorkQueue().getWorkRequestList())
        {
            fertilizerTxtFld.setText(farmer.getFertilizerUsed());
            quantityTxtFld.setText(farmer.getFertilizerQuantity());
            break;
        }
        
//        for(LabResults labresults: lb.getLabResultsList())
//        {
//                    System.out.println("Lab Resulst: " + labresults);
//
//            if(farmer.getFarmerId()== labresults.getFarmer().getFarmerId())
//            {
//                fertilizerTxtFld.setText(labresults.getRecommendedFertilizer());
//                quantityTxtFld.setText(labresults.getRecommendedQuantity());
//            }
//          
//        }
        }
        
        
        
        for(WorkRequest workRequest: userAccount.getWorkQueue().getWorkRequestList())
        {
            if(workRequest instanceof FertilizerWorkRequest && workRequest != null && workRequest.getStatus().equalsIgnoreCase("Fertilization Started"))
            {
                fertilizerWorkRequest = (FertilizerWorkRequest)workRequest;
                setDataInFields(workRequest);
                startJBtn.setEnabled(false);
                endJBtn.setEnabled(true);
                
            }
            else if(workRequest instanceof FertilizerWorkRequest && workRequest != null && !workRequest.getStatus().equalsIgnoreCase("Fertilization Done"))
            {
                setDataInFields(workRequest);
                startJBtn.setEnabled(false);
                endJBtn.setEnabled(false);
            }
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

        jLabel1 = new javax.swing.JLabel();
        analysisJBtn = new javax.swing.JButton();
        startJBtn = new javax.swing.JButton();
        endJBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fertilizerTxtFld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        quantityTxtFld = new javax.swing.JTextField();
        useOtherJBtn = new javax.swing.JButton();
        useOtherJBtn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        priceTxtFld = new javax.swing.JTextField();
        backJBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Fertilizing Task - Farmer Role");

        analysisJBtn.setText("Request Soil Analysis of my farm");
        analysisJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analysisJBtnActionPerformed(evt);
            }
        });

        startJBtn.setText("Start Fertilizing Task ");
        startJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startJBtnActionPerformed(evt);
            }
        });

        endJBtn.setText("End Fertizing Task ");
        endJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endJBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Reports:");

        jLabel5.setText("Recommemded Fertilizer:");

        fertilizerTxtFld.setEnabled(false);
        fertilizerTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fertilizerTxtFldActionPerformed(evt);
            }
        });

        jLabel6.setText("Recommended Quantity:");

        quantityTxtFld.setEnabled(false);

        useOtherJBtn.setText("Use other");
        useOtherJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useOtherJBtnActionPerformed(evt);
            }
        });

        useOtherJBtn1.setText("Use other");

        jLabel7.setText("Price:");

        backJBtn.setText("<< Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(backJBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fertilizerTxtFld))
                                    .addComponent(analysisJBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                    .addComponent(endJBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(quantityTxtFld)
                                            .addComponent(priceTxtFld)))
                                    .addComponent(startJBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(useOtherJBtn)
                                    .addComponent(useOtherJBtn1))))))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(analysisJBtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fertilizerTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(useOtherJBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantityTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(useOtherJBtn1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(priceTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(startJBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endJBtn)
                .addGap(27, 27, 27)
                .addComponent(backJBtn)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startJBtnActionPerformed
  
        for(WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList())
        {
            if(workRequest instanceof FertilizerWorkRequest && workRequest.getStatus().equalsIgnoreCase("Irrigation Done"))
            {
                workRequest.setResolveDate(new Date());
                ((Farmer)((FertilizerWorkRequest) workRequest).getData()).setStatus("Fertilization Started");
                workRequest.setStatus("Fertilization Started");
                startJBtn.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Fertilization started for farmer with ID: " + ((Farmer)((FertilizerWorkRequest) workRequest).getData()).getFarmerId());
                
                return;
            }
        }
        for(Organization organization : organizationDirectory.getOrganizationList())
        {
            if(organization instanceof FertilizerOrganization)
            {
                for(WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList())
                {
                    if(workRequest.getFarmerUserId() == farmer.getFarmerId())
                    {
                        workRequest.setStatus("Fertilization Started");
                        farmer.setStatus("Fertilization Started");
                        userAccount.getWorkQueue().getWorkRequestList().add(workRequest);
                        endJBtn.setEnabled(true);
                        startJBtn.setEnabled(false);
                        JOptionPane.showMessageDialog(null, "Fertilization started for farmer with ID: " + ((Farmer)((FertilizerWorkRequest) workRequest).getData()).getFarmerId());
                        return;
                        //break;
                                               
                    }
                }
            }
        }
                
        
        
        
        //populateTable();

    }//GEN-LAST:event_startJBtnActionPerformed

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJBtnActionPerformed

    private void analysisJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analysisJBtnActionPerformed
        // TODO add your handling code here:
                   
            labWorkRequest.setSender(userAccount);
            labWorkRequest.setRequestDate(new Date());
            labWorkRequest.setStatus("Requested for soil analysis");
            labWorkRequest.setData(farmer);
            userAccount.getWorkQueue().getWorkRequestList().add(labWorkRequest);
            labOrganization.getWorkQueue().getWorkRequestList().add(labWorkRequest);
            JOptionPane.showMessageDialog(null, "Request sent to Lab Enterprise!!!");
            return;
//            for(Organization organization : organizationDirectory.getOrganizationList())
//            {
//                if(organization instanceof LabOrganization)
//                {
//                    organization.getWorkQueue().getWorkRequestList().add(labWorkRequest);
//                }
//            }
        
        
    }//GEN-LAST:event_analysisJBtnActionPerformed

    private void endJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endJBtnActionPerformed
        // TODO add your handling code here:
        for(WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList())
        {
            if(workRequest instanceof FertilizerWorkRequest && workRequest.getStatus().equalsIgnoreCase("Fertilization Started"))
            {
                workRequest.setResolveDate(new Date());
                ((Farmer)((FertilizerWorkRequest) workRequest).getData()).setStatus("Fertilization Done");
                workRequest.setStatus("Fertilization Done");
                JOptionPane.showMessageDialog(null, "Fertilization done for farmer with ID: " + ((Farmer)((FertilizerWorkRequest) workRequest).getData()).getFarmerId());
                return;
            }
        }
        for(Organization organization : organizationDirectory.getOrganizationList())
        {
            if(organization instanceof FertilizerOrganization)
            {
                for(WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList())
                {
                    if(workRequest.getFarmerUserId() == farmer.getFarmerId())
                    {
                        workRequest.setStatus("Fertilization Done");
                        farmer.setStatus("Fertilization Done");
                        endJBtn.setEnabled(false);
                        startJBtn.setEnabled(false);
                        JOptionPane.showMessageDialog(null, "Fertilization Done for farmer with ID: " + ((Farmer)((FertilizerWorkRequest) workRequest).getData()).getFarmerId());
                        return;
                        //break;
                                               
                    }
                }
            }
        }
                
        
    }//GEN-LAST:event_endJBtnActionPerformed

    private void useOtherJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useOtherJBtnActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_useOtherJBtnActionPerformed

    private void fertilizerTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fertilizerTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fertilizerTxtFldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analysisJBtn;
    private javax.swing.JButton backJBtn;
    private javax.swing.JButton endJBtn;
    private javax.swing.JTextField fertilizerTxtFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField priceTxtFld;
    private javax.swing.JTextField quantityTxtFld;
    private javax.swing.JButton startJBtn;
    private javax.swing.JButton useOtherJBtn;
    private javax.swing.JButton useOtherJBtn1;
    // End of variables declaration//GEN-END:variables

    private void setDataInFields(WorkRequest workRequest) {
        
        
    }
}
