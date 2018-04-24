/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.CSV.IdealCondition;
import Business.CSV.Sensor;
import Business.CSV.Weather;
import au.com.bytecode.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Oza Sagar
 */
public class Initialization 
{
    //File baseFolder = new File("E:\\AED LECTURES\\Project\\Backup712\\Project_Precision Agriculture\\aed_fall_2016_project_jocelyn_quadras_001250597\\CSV files");


//    File baseFolder = new File("B:\\AED\\Backup\\aed_fall_2016_project_jocelyn_quadras_001250597\\CSV files");
    //File baseFolder = new File("C:\\Users\\aksha\\OneDrive\\Documents\\NetBeansProjects\\Project_Precision Agriculture\\aed_fall_2016_project_jocelyn_quadras_001250597\\CSV files");
    //File baseFolder = new File("C:\\Users\\jocel\\AED_CLASSES\\AED_FALL_2016_Project_Jocelyn_Quadras_001250597\\aed_fall_2016_project_jocelyn_quadras_001250597\\CSV files");

    //File baseFolder = new File("B:\\AED\\Backup\\aed_fall_2016_project_jocelyn_quadras_001250597\\CSV files");
    File baseFolder = new File("C:\\Users\\aksha\\OneDrive\\Documents\\NetBeansProjects\\Project_Precision Agriculture\\aed_fall_2016_project_jocelyn_quadras_001250597\\CSV files");
   

    //File baseFolder = new File("B:\\AED\\CheckedIn08-12\\aed_fall_2016_project_jocelyn_quadras_001250597\\CSV files");
    

    CSVReader reader;
    String[] nextLine;
    ArrayList<Weather> weatherDataList;
    ArrayList<Sensor> sensorDataList;
    ArrayList<IdealCondition> idealConditionsList;
    
    public Initialization()
    {
        weatherDataList = new ArrayList<Weather>();
        sensorDataList = new ArrayList<Sensor>();
        idealConditionsList = new ArrayList<IdealCondition>();
    }
    
    public ArrayList<Sensor> readSensorData() throws IOException, FileNotFoundException
    {
        this.reader = new CSVReader(new FileReader(baseFolder.toString().concat("\\" + "Sensor-Data.csv")), ',', '"', 1);
        while ((nextLine = reader.readNext()) != null)
        {
            if (nextLine != null) 
            {
                Sensor sensor = new Sensor();
                sensor.setSensorId(Integer.parseInt(nextLine[0]));
                sensor.setCropName(nextLine[1]);
                sensor.setDate(nextLine[2]);
                sensor.setTime(nextLine[3]);
                sensor.setTemperature(nextLine[4]);
                sensor.setPrecipitation(nextLine[5]);
                sensor.setHumidity(nextLine[6]);
                sensor.setMoisture(nextLine[7]);
                sensor.setPlace(nextLine[8]);
                sensor.setCropMaturityLevel(nextLine[9]);
                sensor.setCropCurrentHeight(nextLine[10]);
                sensorDataList.add(sensor);
                
            }
        }
        return sensorDataList;
    }

    public ArrayList<Weather> readWeatherData() throws FileNotFoundException, IOException 
    {
        this.reader = new CSVReader(new FileReader(baseFolder.toString().concat("\\" + "Weather.csv")), ',', '"', 1);
        while ((nextLine = reader.readNext()) != null)
        {
            if (nextLine != null) 
            {
                Weather weather = new Weather();
                weather.setId(Integer.parseInt(nextLine[0]));
                weather.setDate(nextLine[1]);
                weather.setTime(nextLine[2]);
                weather.setHumidity(nextLine[3]);
                weather.setTemperature(nextLine[4]);
                weather.setWind(nextLine[5]);
                weather.setPrecipitation(nextLine[6]);
                weather.setPlace(nextLine[7]);
                weatherDataList.add(weather);
            }
        }
        return weatherDataList;
    }

    public ArrayList<IdealCondition> readIdealConditionList() throws FileNotFoundException, IOException 
    {
        this.reader = new CSVReader(new FileReader(baseFolder.toString().concat("\\" + "Ideal-weather.csv")), ',', '"', 1);
        while ((nextLine = reader.readNext()) != null)
        {
            if (nextLine != null) 
            {
               IdealCondition idealCondition = new IdealCondition();
               idealCondition.setId(Integer.parseInt(nextLine[0]));
               idealCondition.setCropName(nextLine[1]);
               idealCondition.setMinTemperature(nextLine[2]);
               idealCondition.setMaxTemperature(nextLine[3]);
               idealCondition.setHumidity(nextLine[4]);
               idealCondition.setPrecipitation(nextLine[5]);
               idealCondition.setMaxPHValue(nextLine[6]);
               idealCondition.setMinPHValue(nextLine[7]);
               idealCondition.setMoisture(nextLine[8]);
               idealConditionsList.add(idealCondition);
            }
        }
        return idealConditionsList;
    }
}
