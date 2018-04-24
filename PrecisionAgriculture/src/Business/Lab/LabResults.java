/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Lab;

import Business.Employee.Employee;
import Business.Farmer.Farmer;
import Business.UserAccount.UserAccount;

/**
 *
 * @author jocel
 */
public class LabResults extends Employee
{
    private int labId;
    private static int labCount = 1;
    private Farmer farmer;
    private String recommendedFertilizer;
 private String recommendedQuantity;
    public int getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public String getRecommendedFertilizer() {
        return recommendedFertilizer;
    }

    public void setRecommendedFertilizer(String recommendedFertilizer) {
        this.recommendedFertilizer = recommendedFertilizer;
    }

    public String getRecommendedQuantity() {
        return recommendedQuantity;
    }

    public void setRecommendedQuantity(String recommendedQuantity) {
        this.recommendedQuantity = recommendedQuantity;
    }
   
    
   public LabResults()
   {
       labId = labCount;
       labCount++;
      
   }
   
       @Override
    public String toString() {
        return "LabResults{" + "labId=" + labId + ", recommendedFertilizer=" + recommendedFertilizer + ", recommendedQuantity=" + recommendedQuantity  + farmer + '}';
    }
    }

   

