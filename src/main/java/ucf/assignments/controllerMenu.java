package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.*;

import java.io.File;
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

    public void editItemMenu(MouseEvent mouseEvent) {
    }

    public void importTSV(ActionEvent actionEvent) {
        FileChooser importMenu = new FileChooser();
        importMenu.setTitle("Choose a File.");

        importMenu.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Text Files", "*.txt")
        );

        Stage fileSelect = new Stage();
        File importFile = importMenu.showOpenDialog(fileSelect);

        if(importFile != null){

        }
    }

    public void importHTML(ActionEvent actionEvent) {
    }

    public void exportTSV(ActionEvent actionEvent) {
    }

    public void exportHTML(ActionEvent actionEvent) {
    }

    public void sortName(ActionEvent actionEvent) {
    }

    public void sortSerial(ActionEvent actionEvent) {
    }

    public void sortPrice(ActionEvent actionEvent) {
    }

    public void readMe(ActionEvent actionEvent) {
    }

    public void addItem(ActionEvent actionEvent) {
    }

    public void searchItems(ActionEvent actionEvent) {
    }
}
