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
public class Item {
    
    private ArrayList<Car> CarItemList;
    
    public Item() {
        this.CarItemList = new ArrayList<Car>();
    }

    public ArrayList<Car> getCarItemList() {
        return CarItemList;
    }

    public void setCarItemList(ArrayList<Car> CarItemList) {
        this.CarItemList = CarItemList;
    }
    
    public Car addCarItem(){
    Car car1=new Car();
    CarItemList.add(car1);
    return car1;
    }
    
    public Car addNewrequestItem(){
        Car car = new Car();
       // requestItem requestItem = new requestItem(car);
        CarItemList.add(car);
        return car;
    }
    public void delete(Car c){
    CarItemList.remove(c);
    }
}
