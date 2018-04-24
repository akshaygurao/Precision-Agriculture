/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Lab;


import Business.Farmer.Farmer;
import java.util.ArrayList;

/**
 *
 * @author jocel
 */
public class LabResultsDirectory 
{
     public ArrayList<LabResults> labResultsList;

    public ArrayList<LabResults> getLabResultsList() {
        return labResultsList;
    }

    public void setLabResultsList(ArrayList<LabResults> labResultsList) {
        this.labResultsList = labResultsList;
    }
    
    public LabResultsDirectory ()
    {
        labResultsList = new ArrayList<>();
    }
    
     public LabResults createLabresults(Farmer farmer,String recommendedFertilizer, String recommendedQuantity)
    {
        LabResults  labResults  = new LabResults();
        labResults.setLabId(labResults.getLabId());
        labResults.setFarmer(farmer);
        labResults.setRecommendedFertilizer(recommendedFertilizer);
        labResults.setRecommendedQuantity(recommendedQuantity);
        labResultsList.add(labResults);
        return labResults;
    }
}
