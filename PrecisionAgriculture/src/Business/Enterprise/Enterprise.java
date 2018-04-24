/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Farmer.FarmerDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author raunak
 */
public abstract class Enterprise extends Organization{

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private FarmerDirectory farmerDirectory;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        farmerDirectory = new FarmerDirectory();
    }

    public FarmerDirectory getFarmerDirectory() {
        return farmerDirectory;
    }

    public void setFarmerDirectory(FarmerDirectory farmerDirectory) {
        this.farmerDirectory = farmerDirectory;
    }
    
    public enum EnterpriseType{

        Distributor("Distributor"),
        Lab("Lab"), 
        Transporter("Transporter");
        
        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

}
