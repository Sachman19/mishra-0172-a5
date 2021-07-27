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
            //This locates the current working directory and places a file called export.tsv in it.
            File export = new File(System.getProperty("user.dir") + "/export.tsv");

            //If file creation is successful, print out to file. other case is that export already happens and the file already exists.
            if (export.createNewFile() || export.exists()) {
                PrintWriter outFile = new PrintWriter(export);
                outFile.println("Price\tSerial\tName");
                for(int i = 0; i < itemList.size(); i++){
                    outFile.format("%f\t", itemList.get(i).getPrice());
                    outFile.format("%s\t", itemList.get(i).getSerial());
                    outFile.format("%s\n", itemList.get(i).getName());
                }
                outFile.close();
            }
        } catch (IOException e) {
            return;
        }

    }

    public void exportHTML(ArrayList<item> itemList){
        try {
            //This locates the current working directory and places a file called export.tsv in it.
            File export = new File(System.getProperty("user.dir") + "/export.html");

            //If file creation is successful, print out to file.
            if (export.createNewFile()) {
                PrintWriter outFile = new PrintWriter(export);
                outFile.println("<!DOCTYPE html>\n<html>\n<head>");
                outFile.println("<style>\ntable, th, td {\n  border: 1px solid black;\n  border-collapse: collapse;\n}");
                outFile.println("th, td {\n  padding: 5px;\n}");
                outFile.println("th {\n text-align: left;\n}");
                outFile.println("</style>\n</head>");
                outFile.println("<body>");
                outFile.println("<table style =\"width:30%\">");
                outFile.println("<tr>\n  <th>Price</th>\n  <th>Serial</th>\n  <th>Name</th>\n</tr>");
                for(int i = 0; i < itemList.size(); i++){
                    outFile.println("<tr>");
                    outFile.format("  <td>%f</td>\n", itemList.get(i).getPrice());
                    outFile.format("  <td>%s</td>\n", itemList.get(i).getSerial());
                    outFile.format("  <td>%s</td>\n", itemList.get(i).getName());
                    outFile.println("</tr>");
                }
                outFile.println("</table>\n\n</body>\n</html>");
                outFile.close();
            }
        } catch (IOException e) {
            return;
        }
    }

}
