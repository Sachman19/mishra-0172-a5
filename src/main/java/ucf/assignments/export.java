/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ucf.assignments;

import java.util.ArrayList;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class export {
    public void exportTSV(ArrayList<item> itemList) {
        try {
            File export = new File("export.tsv");
            if (export.createNewFile()) {
                PrintWriter outFile = new PrintWriter(export);
                outFile.print("Price%tSerial%tName%n");
                for(int i = 0; i < itemList.size(); i++){
                    outFile.format("%.5f/t", itemList.get(i).getPrice());
                    outFile.format("%.12s/t", itemList.get(i).getSerial());
                    outFile.format("%.12s/n", itemList.get(i).getName());
                }
            }
        } catch (IOException e) {
            return;
        }

    }
}
