/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class DashboardController implements Initializable {

    @FXML
    private ComboBox<String> clientCombox;
    ObservableList<String> list=FXCollections.observableArrayList("Marc","Mathias","Maruis","Marion");
    @FXML
    private Label resultCombox;
    @FXML
    private TextField addItem;
    @FXML
    private ListView<String> listView;
    @FXML
    private Button btnSelected;
    @FXML
    private Label choise;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        clientCombox.setItems(list);
        listView.setItems(list);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    

    @FXML
    private void comboxChange(ActionEvent event) {
        resultCombox.setText(clientCombox.getValue());
        
    }

    @FXML
    private void addItemButton(ActionEvent event) {
        clientCombox.getItems().add(addItem.getText());
        addItem.setText("");
    }

    @FXML
    private void handleBtnSelected(ActionEvent event) {
        ObservableList <String> names;
        names=listView.getSelectionModel().getSelectedItems();
        for(String name :names){
            choise.setText(choise.getText()+", "+name);
        }
    }
    
}
