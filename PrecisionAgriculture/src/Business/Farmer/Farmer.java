/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Farmer;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;

/**
 *
 * @author aksha
 */
public class Farmer extends Employee
{
   private int farmerId;
   private static int farmerCount = 1;
   
   public Farmer()
   {
       farmerId = farmerCount;
       farmerCount++;
       userAccount = new UserAccount();
   }
   
   
   private String farmerName;
   private int farmSize;
   private String cropName;
   private int cropQuantity;
   private int cropPrice;
   private int expectedDays;
   private int irrigationDays;
   private float fertilizerPrice;
   private int harvestQuantity;
   private int sowingAdminId;
   private int irrigationAdminId;
   private int fertilizerAdminId;
   private int harvestingAdminId;
   private int transportAdminId;
   private UserAccount userAccount;
   private String status;
   private String fertilizerUsed;
   private String fertilizerQuantity;
 

    public String getFertilizerUsed() {
        return fertilizerUsed;
    }

    public void setFertilizerUsed(String fertilizerUsed) {
        this.fertilizerUsed = fertilizerUsed;
    }

    public String getFertilizerQuantity() {
        return fertilizerQuantity;
    }

    public void setFertilizerQuantity(String fertilizerQuantity) {
        this.fertilizerQuantity = fertilizerQuantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public int getFarmSize() {
        return farmSize;
    }

    public void setFarmSize(int farmSize) {
        this.farmSize = farmSize;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public int getCropQuantity() {
        return cropQuantity;
    }

    public void setCropQuantity(int cropQuantity) {
        this.cropQuantity = cropQuantity;
    }

    public int getCropPrice() {
        return cropPrice;
    }

    public void setCropPrice(int cropPrice) {
        this.cropPrice = cropPrice;
    }

    public int getExpectedDays() {
        return expectedDays;
    }

    public void setExpectedDays(int expectedDays) {
        this.expectedDays = expectedDays;
    }

    public int getIrrigationDays() {
        return irrigationDays;
    }

    public void setIrrigationDays(int irrigationDays) {
        this.irrigationDays = irrigationDays;
    }

    public float getFertilizerPrice() {
        return fertilizerPrice;
    }

    public void setFertilizerPrice(float fertilizerPrice) {
        this.fertilizerPrice = fertilizerPrice;
    }

    public int getHarvestQuantity() {
        return harvestQuantity;
    }

    public void setHarvestQuantity(int harvestQuantity) {
        this.harvestQuantity = harvestQuantity;
    }

    public int getSowingAdminId() {
        return sowingAdminId;
    }

    public void setSowingAdminId(int sowingAdminId) {
        this.sowingAdminId = sowingAdminId;
    }

    public int getIrrigationAdminId() {
        return irrigationAdminId;
    }

    public void setIrrigationAdminId(int irrigationAdminId) {
        this.irrigationAdminId = irrigationAdminId;
    }

    public int getFertilizerAdminId() {
        return fertilizerAdminId;
    }

    public void setFertilizerAdminId(int fertilizerAdminId) {
        this.fertilizerAdminId = fertilizerAdminId;
    }

    public int getHarvestingAdminId() {
        return harvestingAdminId;
    }

    public void setHarvestingAdminId(int harvestingAdminId) {
        this.harvestingAdminId = harvestingAdminId;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public int getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }

    public int getTransportAdminId() {
        return transportAdminId;
    }

    public void setTransportAdminId(int transportAdminId) {
        this.transportAdminId = transportAdminId;
    }

 
    

    @Override
    public String toString() {
        return "Farmer{" + "farmerId=" + farmerId + ", farmerName=" + farmerName + ", farmSize=" + farmSize + ", cropName=" + cropName + ", cropQuantity=" + cropQuantity + ", cropPrice=" + cropPrice + ", expectedDays=" + expectedDays + ", irrigationDays=" + irrigationDays + ", fertilizerPrice=" + fertilizerPrice + ", harvestQuantity=" + harvestQuantity + ", sowingAdminId=" + sowingAdminId + ", irrigationAdminId=" + irrigationAdminId + ", fertilizerAdminId=" + fertilizerAdminId + ", harvestingAdminId=" + harvestingAdminId + ", transportAdminId=" + transportAdminId + ", userAccount=" + userAccount + ", status=" + status + ", fertilizerUsed=" + fertilizerUsed + ", fertilizerQuantity=" + fertilizerQuantity + '}';
    }
      
}
