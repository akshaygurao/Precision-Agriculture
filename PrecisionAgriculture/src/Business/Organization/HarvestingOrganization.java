/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Oza Sagar
 */
public class HarvestingOrganization extends Organization
{
    public HarvestingOrganization() 
    {
        super(Organization.Type.HarvestingOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
}
