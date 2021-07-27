/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ucf.assignments;

import java.lang.*;

public class item {
    String serial, name;
    double price;

    //setters
    public void setSerial(String input){ //each of these individual setters should be used to change individual values
        serial = input;
    }

    public void setName(String input){
        name = input;
    }

    public void setPrice(double input){
        price = input;
    }

    public void setInfo(String ser, String nam, double cost){ //This should be used to initialize object.
        setSerial(ser);
        setName(nam);
        setPrice(cost);
    }

    //getters
    public String getSerial(){
        return serial;
    }

    public String getName(){
        return name;
    }

    public Double getPrice(){
        return price;
    }

}
