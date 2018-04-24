/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Farmer.Farmer;
import Business.Farmer.FarmerDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.SowingOrganization;
import Business.Role.FarmerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aksha
 */
public class ManageFarmersJPanel extends javax.swing.JPanel {
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private FarmerDirectory farmerDirectory;
    private Enterprise enterprise;
    /**
     * Creates new form ManageFarmersJPanel
     */
    public ManageFarmersJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, FarmerDirectory farmerDirectory, Enterprise enterprise) 
    {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDirectory;
        this.farmerDirectory = farmerDirectory;
        this.enterprise = enterprise;
        
        populateFarmerTable();
        populateSowingAdminComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        farmerNameTxtFld = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        createFarmerJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        farmSizeTxtFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        userNameTxtFld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordTxtFld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "UserName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        jLabel2.setText("Farmer Name:");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        createFarmerJButton.setText("Create Farmer");
        createFarmerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFarmerJButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Farm Size:");

        jLabel5.setText("Farmer UserName:");

        jLabel6.setText("Farmer Password:");

        jLabel1.setText("Create Farmers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(backJButton)
                            .addGap(348, 348, 348)
                            .addComponent(createFarmerJButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(farmerNameTxtFld, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(farmSizeTxtFld)
                                    .addComponent(userNameTxtFld)
                                    .addComponent(passwordTxtFld)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(farmerNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(farmSizeTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(userNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passwordTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(createFarmerJButton))
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void createFarmerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFarmerJButtonActionPerformed

        String userName = userNameTxtFld.getText();
        String password = passwordTxtFld.getText();
        int farmSize = Integer.parseInt(farmSizeTxtFld.getText());
        
        if(userName == null || password == null || farmSize == 0)
        {
            JOptionPane.showMessageDialog(null, "All fields are compulsory");
            return;
        }
        
        Employee employee = new Employee();
        employee.setName(farmerNameTxtFld.getText());
        Role role = new FarmerRole();
        farmerDirectory.createFarmer(userName, password, farmSize, employee, role);
        populateFarmerTable();
        userNameTxtFld.setText("");
        passwordTxtFld.setText("");
        farmSizeTxtFld.setText("");
        farmerNameTxtFld.setText("");
//        JOptionPane.showMessageDialog(null, "Farmer created successfully");
//        return;
//        Farmer farmer = new Farmer();
//        farmer.setFarmerName(farmerNameTxtFld.getText());
//        farmer.setFarmerId(farmer.getId());
//        farmer.setFarmSize(Integer.parseInt(farmSizeTxtFld.getText()));
//        UserAccount ua = new UserAccount();
//        farmer.setUserAccount(ua);
//        farmer.getUserAccount().setUsername(userNameTxtFld.getText());
//        //setUsername(userNameTxtFld.getText());
//        farmer.getUserAccount().setPassword(passwordTxtFld.getText());
//        //String assignedTo=sowingAdminComboBox.getSelectedItem().toString();
//        organizationDir.getFarmerList().add(farmer);
        //organization.getEmployeeDirectory().createEmployee(name);
        //organizationDir.createFarmer(farmerNameTxtFld.getText(), Integer.parseInt(farmSizeTxtFld.getText()), userNameTxtFld.getText(), passwordTxtFld.getText());

    }//GEN-LAST:event_createFarmerJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createFarmerJButton;
    private javax.swing.JTextField farmSizeTxtFld;
    private javax.swing.JTextField farmerNameTxtFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTextField passwordTxtFld;
    private javax.swing.JTextField userNameTxtFld;
    // End of variables declaration//GEN-END:variables

    private void populateFarmerTable()
    {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Farmer farmer : farmerDirectory.getFarmerList()){
            Object[] row = new Object[4];
            row[0] = farmer.getFarmerId();
            row[1] = farmer.getFarmerName();
            row[2] = farmer.getUserAccount().getUsername();
            row[3] = farmer;
            
            model.addRow(row);
        }
    }
    
    private void populateSowingAdminComboBox() 
    {
//        sowingAdminComboBox.removeAllItems();
//
//        for (Organization organization : organizationDir.getOrganizationList()) 
//        {
//           if(organization instanceof SowingOrganization)
//           {
//              for(UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList())
//              {
//                  sowingAdminComboBox.addItem(userAccount.getUsername());
//              }
//               
//           }
//        }
    }
}
