package com.mycompany.tableview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class FXMLDocumentController implements Initializable {
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
  
    @FXML
    private TableView<String> Product;

    @FXML
    private TableColumn<String, String> nameInput;

    @FXML
    private TableColumn<String, Double> priceInput;

    @FXML
    private TableColumn<String, Integer> quantityInput;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;
    
    @FXML
    private Button editButton;

    @FXML
    void addButtonClicked() {
    }

    @FXML
    void deleteButtonClicked() {
    }
    
    @FXML
    void editButtonClicked() {
    }
}