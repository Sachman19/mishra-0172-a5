package ucf.assignments;

import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class controllerMenu {

    private ArrayList<item> itemList;

    public TableColumn tablePrice;
    public TableColumn tableSerial;
    public TableColumn tableName;
    public MenuItem importTSVButton;
    public MenuItem importHTMLButton;
    public MenuItem exportTSVButton;
    public MenuItem exportHTMLButton;
    public MenuItem sortNameButton;
    public MenuItem sortSerialButton;
    public MenuItem sortPriceButton;
    public MenuItem readMeButton;
    public Button addButton;
    public TextField searchBar;

    public void editItemMenu() {
    }

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
    }

    public void searchItems() {
    }

    public void initArrayList(ArrayList<item> startList){
        itemList = startList;
    }
}
