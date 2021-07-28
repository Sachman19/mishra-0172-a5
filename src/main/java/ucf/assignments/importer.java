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
    public ArrayList<item> importHTML(String filename) throws FileNotFoundException {
        ArrayList<item> returnList = new ArrayList<>();
        File importFile = new File(filename);
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
                }
            }
            inFile.close();
        }
        return returnList;
    }

    public ArrayList<item> importTSV(String filename) throws FileNotFoundException {
        ArrayList<item> returnList = new ArrayList<>();
        File importFile = new File(filename);
        if(importFile.exists()){
            Scanner inFile = new Scanner(importFile);
            //while

            while(inFile.hasNextLine()){
                String input;
                if(inFile.nextLine().equalsIgnoreCase("<tr>")){
                    item newItem = new item();
                    for(int i = 0; i < 3; i++){
                        if(i == 0){
                            input = inFile.nextLine();
                            input.replace("<td>", "");
                            input.replace("</td>", "");
                            newItem.setPrice(Double.parseDouble(input));
                        }
                        if(i == 1){
                            input = inFile.nextLine();
                            input.replace("<td>", "");
                            input.replace("</td>", "");
                            newItem.setSerial(input);
                        }
                        if(i == 2){
                            input = inFile.nextLine();
                            input.replace("<td>", "");
                            input.replace("</td>", "");
                            newItem.setName(input);
                        }
                    }
                }
            }
            inFile.close();
        }
        return returnList;
    }
}
