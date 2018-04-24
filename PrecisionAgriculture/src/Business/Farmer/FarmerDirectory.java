/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Farmer;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class FarmerDirectory 
{
    public ArrayList<Farmer> farmerList;
    
    public FarmerDirectory() 
    {
        farmerList = new ArrayList<>();
    }

    public ArrayList<Farmer> getFarmerList() {
        return farmerList;
    }

    public void setFarmerList(ArrayList<Farmer> farmerList) {
        this.farmerList = farmerList;
    }
    
    public Farmer createFarmer(String userName, String password, int farmSize, Employee employee, Role role)
    {
        Farmer farmer = new Farmer();
        farmer.setFarmerName(employee.getName());
        farmer.setFarmerId(farmer.getId());
        farmer.setFarmSize(farmSize);
        //farmer.setCropName(cropName);
        UserAccount ua = new UserAccount();
        farmer.setUserAccount(ua);
        farmer.getUserAccount().setUsername(userName);
        farmer.getUserAccount().setPassword(password);
        farmer.getUserAccount().setRole(role);
        farmer.getUserAccount().setEmployee(employee);
        farmer.setStatus("Sowing not started");
        farmerList.add(farmer);
        return farmer;
    }

    public Farmer authenticateFarmer(String username, String password){
        for (Farmer farmer : farmerList)
            if (farmer.getUserAccount().getUsername().equals(username) && farmer.getUserAccount().getPassword().equals(password))
            {
                return farmer;
            }
        return null;
    }
    
    @Override
    public String toString() {
        return "FarmerDirectory{" + "farmerList=" + farmerList + '}';
    }
   
}
