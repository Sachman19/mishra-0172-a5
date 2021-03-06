/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ucf.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class importer {
    public ArrayList<item> importHTML(File importFile) throws FileNotFoundException {
        ArrayList<item> returnList = new ArrayList<>();
        if(importFile.exists()){
            Scanner inFile = new Scanner(importFile);
            while(inFile.hasNextLine()){
                String input;
                if(inFile.nextLine().equalsIgnoreCase("<tr>")){
                    item newItem = new item();
                    for(int i = 0; i < 3; i++){
                        if(i == 0){
                            input = inFile.nextLine();
                            input = input.replace("<td>", "");
                            input = input.replace("</td>", "");
                            newItem.setPrice(Double.parseDouble(input));
                        }
                        if(i == 1){
                            input = inFile.nextLine();
                            input = input.replace("<td>", "");
                            input = input.replace("</td>", "");
                            newItem.setSerial(input);
                        }
                        if(i == 2){
                            input = inFile.nextLine();
                            input = input.replace("<td>", "");
                            input = input.replace("</td>", "");
                            newItem.setName(input);
                        }
                    }
                    returnList.add(newItem);
                }
            }
            inFile.close();
        }
        return returnList;
    }

    public ArrayList<item> importTSV(File importFile) throws FileNotFoundException {
        ArrayList<item> returnList = new ArrayList<>();
        if(importFile.exists()){
            Scanner inFile = new Scanner(importFile);
            inFile.nextLine();
            while(inFile.hasNextLine()){
                String[] input = inFile.nextLine().split("\t");
                item newItem = new item();
                newItem.setInfo(input[1], input[2], Double.parseDouble(input[0]));
                returnList.add(newItem);
            }
            inFile.close();
        }
        return returnList;
    }
}
