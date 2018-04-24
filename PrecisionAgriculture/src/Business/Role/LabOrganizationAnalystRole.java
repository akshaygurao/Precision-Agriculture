/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Farmer.Farmer;

import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.LabOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Lab.LabAnalystRole.LabAnalystWorkAreaJPanel;

/**
 *
 * @author jocel
 */
public class LabOrganizationAnalystRole extends Role
{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Farmer farmer, LabOrganization labOrganization) 
    {
        System.out.println("Inside Lab Analyst role");
        return new LabAnalystWorkAreaJPanel(userProcessContainer, account, (LabOrganization)organization, enterprise, system);
    }
}
