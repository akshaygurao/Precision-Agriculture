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
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author jocel
 */
public class FarmerFertilizerAnalysisJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FarmerFertilizerAnalysisJPanel
     */
     private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public FarmerFertilizerAnalysisJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise)
    {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        farmersPHValueLabel = new javax.swing.JLabel();
        recommendedFertilizerNameLabel = new javax.swing.JLabel();
        recommendedFertilizerQuantityLabel = new javax.swing.JLabel();
        recommendedFertilizerNameTextField = new javax.swing.JTextField();
        recommendedFertilizerQuantityTextField = new javax.swing.JTextField();
        sendAnalysisToFarmerJButton = new javax.swing.JButton();
        farmersMoistureValueLabel = new javax.swing.JLabel();
        farmersPHValueTextField = new javax.swing.JTextField();
        farmersMoistureValueTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        farmersPHValueLabel.setText("Selected Farmer's PH value:");

        recommendedFertilizerNameLabel.setText("Enter Recommended Fertilizer Name:");

        recommendedFertilizerQuantityLabel.setText("Enter Recommended Fertilizer Quantity:");

        sendAnalysisToFarmerJButton.setText("Send To Farmer");

        farmersMoistureValueLabel.setText("Selected Farmers Moisture value:");

        farmersPHValueTextField.setEnabled(false);

        farmersMoistureValueTextField.setEnabled(false);

        jLabel1.setText("Farmer's Fertilzer Requirement Analysis");

        backJButton.setText("<<BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(farmersPHValueLabel)
                                    .addComponent(farmersMoistureValueLabel))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(farmersMoistureValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(farmersPHValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(backJButton)))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(sendAnalysisToFarmerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(151, 151, 151))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(recommendedFertilizerQuantityLabel)
                                .addComponent(recommendedFertilizerNameLabel))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(recommendedFertilizerQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(recommendedFertilizerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(138, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(farmersPHValueLabel)
                    .addComponent(farmersPHValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(farmersMoistureValueLabel)
                    .addComponent(farmersMoistureValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(149, 149, 149))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(243, 243, 243)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(recommendedFertilizerNameLabel)
                        .addComponent(recommendedFertilizerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(recommendedFertilizerQuantityLabel)
                        .addComponent(recommendedFertilizerQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addComponent(sendAnalysisToFarmerJButton)
                    .addContainerGap(207, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FertilizerAdminMonitorAreaJPanel fawajp = ( FertilizerAdminMonitorAreaJPanel) component;
        //dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel farmersMoistureValueLabel;
    private javax.swing.JTextField farmersMoistureValueTextField;
    private javax.swing.JLabel farmersPHValueLabel;
    private javax.swing.JTextField farmersPHValueTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel recommendedFertilizerNameLabel;
    private javax.swing.JTextField recommendedFertilizerNameTextField;
    private javax.swing.JLabel recommendedFertilizerQuantityLabel;
    private javax.swing.JTextField recommendedFertilizerQuantityTextField;
    private javax.swing.JButton sendAnalysisToFarmerJButton;
    // End of variables declaration//GEN-END:variables
}
