/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() 
    {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() 
    {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
//        if (type.getValue().equals(Type.FarmerOrganization.getValue()))
//        {
//            organization = new FarmerOrganization();
//            organizationList.add(organization);
//        }
        if (type.getValue().equals(Type.SowingOrganization.getValue()))
        {
            organization = new SowingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.IrrigationOrganization.getValue()))
        {
            organization = new IrrigationOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.FertilizerOrganization.getValue()))
        {
            organization = new FertilizerOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.HarvestingOrganization.getValue()))
        {
            organization = new HarvestingOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.TransportOrganization.getValue()))
        {
            organization = new TransportOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.LabOrganization.getValue()))
        {
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}