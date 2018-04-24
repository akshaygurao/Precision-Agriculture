/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Farmer.Farmer;
import Business.Organization.FarmerOrganization;
import Business.Organization.FertilizerOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FarmerRole.FarmerWorkAreaJPanel;
import userinterface.FertilizerAdminRole.FertilizerAdminWorkAreaPanel;

/**
 *
 * @author Oza Sagar
 */
public class FertilizerOrganizationAdminRole extends Role
{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Farmer farmer,LabOrganization labOrganization) 
    {
        return new FertilizerAdminWorkAreaPanel(userProcessContainer, account, (FertilizerOrganization)organization, enterprise, system,labOrganization);
    }
    
    
}