/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CSV;

/**
 *
 * @author Oza Sagar
 */
public class IdealCondition 
{
    private int id;
    private String cropName;
    private String minTemperature;
    private String maxTemperature;
    private String humidity;
    private String precipitation;
    private String maxPHValue;
    private String minPHValue;
    private String moisture;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(String minTemperature) {
        this.minTemperature = minTemperature;
    }

    public String getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(String maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getMaxPHValue() {
        return maxPHValue;
    }

    public void setMaxPHValue(String maxPHValue) {
        this.maxPHValue = maxPHValue;
    }

    public String getMinPHValue() {
        return minPHValue;
    }

    public void setMinPHValue(String minPHValue) {
        this.minPHValue = minPHValue;
    }

    public String getMoisture() {
        return moisture;
    }

    public void setMoisture(String moisture) {
        this.moisture = moisture;
    }

    @Override
    public String toString() {
        return "IdealCondition{" + "id=" + id + ", cropName=" + cropName + ", minTemperature=" + minTemperature + ", maxTemperature=" + maxTemperature + ", humidity=" + humidity + ", precipitation=" + precipitation + ", maxPHValue=" + maxPHValue + ", minPHValue=" + minPHValue + ", moisture=" + moisture + '}';
    }

    
    
}
