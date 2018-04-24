/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type)
    {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Distributor)
        {
            enterprise = new DistributorEnterprise(name);
            enterpriseList.add(enterprise);
        }

        if (type == Enterprise.EnterpriseType.Lab)
        {
            enterprise = new LabEnterprise(name);
            enterpriseList.add(enterprise);
        }

        if (type == Enterprise.EnterpriseType.Transporter)
        {
            enterprise = new TransporterEnterprise(name);
            enterpriseList.add(enterprise);
        }
        System.out.println("Enterprise: " + enterprise);
        return enterprise;
    }
    
}
