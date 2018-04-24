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
public class Sensor 
{
    private int sensorId;
    private String cropName;
    private String date;
    private String time;
    private String temperature;
    private String precipitation;
    private String humidity;
    private String moisture;
    private String place;
    private String cropMaturityLevel;
    private String cropCurrentHeight;

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getMoisture() {
        return moisture;
    }

    public void setMoisture(String moisture) {
        this.moisture = moisture;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCropMaturityLevel() {
        return cropMaturityLevel;
    }

    public void setCropMaturityLevel(String cropMaturityLevel) {
        this.cropMaturityLevel = cropMaturityLevel;
    }

    public String getCropCurrentHeight() {
        return cropCurrentHeight;
    }

    public void setCropCurrentHeight(String cropCurrentHeight) {
        this.cropCurrentHeight = cropCurrentHeight;
    }

    @Override
    public String toString() {
        return "Sensor{" + "sensorId=" + sensorId + ", cropName=" + cropName + ", date=" + date + ", time=" + time + ", temperature=" + temperature + ", precipitation=" + precipitation + ", humidity=" + humidity + ", moisture=" + moisture + ", place=" + place + ", cropMaturityLevel=" + cropMaturityLevel + ", cropCurrentHeight=" + cropCurrentHeight + '}';
    }
    
}
