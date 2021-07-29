package ucf.assignments;

import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class controllerMenu {

    private ArrayList<item> itemList;

    //Used to add items to Arraylist
    public TextField priceInput;
    public TextField serialInput;
    public TextField nameInput;
    public Button addButton;

    //table elements
    public TableColumn tablePrice;
    public TableColumn tableSerial;
    public TableColumn tableName;

    //Menu items
    public MenuItem importTSVButton;
    public MenuItem importHTMLButton;
    public MenuItem exportTSVButton;
    public MenuItem exportHTMLButton;
    public MenuItem sortNameButton;
    public MenuItem sortSerialButton;
    public MenuItem sortPriceButton;
    public MenuItem readMeButton;

    //Search bar
    public TextField searchBar;

    public void importTSV() throws FileNotFoundException {
        FileChooser importMenu = new FileChooser();
        importMenu.setTitle("Choose a File.");

        importMenu.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Text Files", "*.txt")
        );

        Stage fileSelect = new Stage();
        File importFile = importMenu.showOpenDialog(fileSelect);

        if(importFile != null){
            importer newImport = new importer();
            ArrayList<item> tempList = newImport.importTSV(importFile);
            itemList.addAll(tempList);

            tempList.clear(); //all items are added to the original arraylist so no need for this one anymore.
        }
    }

    public void importHTML() throws FileNotFoundException {
        FileChooser importMenu = new FileChooser();
        importMenu.setTitle("Choose a File.");

        importMenu.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Text Files", "*.html")
        );

        Stage fileSelect = new Stage();
        File importFile = importMenu.showOpenDialog(fileSelect);

        if(importFile != null){
            importer newImport = new importer();
            ArrayList<item> tempList = newImport.importHTML(importFile);
            itemList.addAll(tempList);

            tempList.clear(); //all items are added to the original arraylist so no need for this one anymore.
        }
    }

    public void exportTSV() {
        export newExport = new export();
        newExport.exportTSV(itemList);
    }

    public void exportHTML() {
        export newExport = new export();
        newExport.exportHTML(itemList);
    }

    public void sortName() {
    }

    public void sortSerial() {
    }

    public void sortPrice() {
    }

    public void readMe() {
    }

    public void addItem() {
        //Check for validity of input
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);

        String serial = serialInput.getText(), name = nameInput.getText();
        //Check that price is a number
        try{
            Double price = Double.parseDouble(priceInput.getText());
        } catch (NumberFormatException e){
            errorAlert.setHeaderText("Price must be numerical.");
            errorAlert.setContentText("The price must be a number. Decimals are within scope.");
            errorAlert.showAndWait();
            return;
        }
        Double price = Double.parseDouble(priceInput.getText());

        //check that serial length is correct
        if(serial.length() != 10){
            errorAlert.setHeaderText("Serial Length Invalid");
            errorAlert.setContentText("The serial must be 10 characters. Serial is currently " + serial.length() + " characters long");
            errorAlert.showAndWait();
            return;
        }

        //check that serial length is correct
        if(name.length() < 2 || name.length() > 256){
            errorAlert.setHeaderText("Name Length Invalid");
            errorAlert.setContentText("The name must be between 2 and 256 characters. The name is currently " + name.length() + " characters long");
            errorAlert.showAndWait();
            return;
        }

        //If all checks go through, then all strings are legitimate.
        //Create item
        item temp = new item();
        temp.setInfo(serial, name, price);
        itemList.add(temp);
    }

    public void searchItems() {
    }

    public void initArrayList(ArrayList<item> startList){
        itemList = startList;
    }
}
