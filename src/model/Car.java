/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ruchachauthai
 */
public class Car {
    
    private String carType;
    private String modelName;
    private int modelNumber;
    private String carmanufacturer;
    private int numberOfseats;
    private int serialNumber;
    private String maintenanceExpDate;
    private String availability;
    private String yearOfManufacture; 
    private String city;        
    
  //  private ArrayList<Car> CarItemList;
    

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getCarmanufacturer() {
        return carmanufacturer;
    }

    public void setCarmanufacturer(String carmanufacturer) {
        this.carmanufacturer = carmanufacturer;
    }

    public int getNumberOfseats() {
        return numberOfseats;
    }

    public void setNumberOfseats(int numberOfseats) {
        this.numberOfseats = numberOfseats;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMaintenanceExpDate() {
        return maintenanceExpDate;
    }

    public void setMaintenanceExpDate(String maintenanceExpDate) {
        this.maintenanceExpDate = maintenanceExpDate;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    

    @Override
    public String toString() {
        return carType;
    }
    
    
    
    
    
}
