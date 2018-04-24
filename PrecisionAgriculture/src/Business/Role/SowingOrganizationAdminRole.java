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
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.SowingOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FarmerRole.FarmerWorkAreaJPanel;
import userinterface.SowingAdminRole.SowingAdminWorkAreaPanel;

/**
 *
 * @author Oza Sagar
 */
public class SowingOrganizationAdminRole extends Role
{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Farmer farmer, LabOrganization labOrganization) 
    {
        return new SowingAdminWorkAreaPanel(userProcessContainer, account, (SowingOrganization)organization, enterprise, system);
    }
    
    
}
