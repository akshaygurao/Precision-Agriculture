/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Farmer.Farmer;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.Lab.AdministrativeRole.LabAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Farmer farmer, LabOrganization laborganization) {
        if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Lab))
        {
             return new LabAdminWorkAreaJPanel(userProcessContainer, enterprise);
        }
      else
        {
    return new AdminWorkAreaJPanel(userProcessContainer, enterprise, business);
       }
        
    

    }
    
}
