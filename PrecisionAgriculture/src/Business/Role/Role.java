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
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Farmer("Farmer"),
        //FarmerOrganizationAdmin("Farmer Organization Admin"),
        SowingOrganizationAdmin("Sowing Organization Admin"),
        IrrigationOrganizationAdmin("Irrigation Organization"),
        FertilizerOrganizationAdmin("Fertilizer Organization Admin"),
        HarvestingOrganizationAdmin("Harvesting Organization Admin"),
        LabAnalyst("Lab Analyst");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            Farmer farmer,
            LabOrganization labOrganization);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}