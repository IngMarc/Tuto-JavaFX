/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class DesignController implements Initializable {

    @FXML
    private Label label;
    private float number1=0;    
    private float number2=0;
    private String operator="";
    private boolean start=true;
    private Modal model=new Modal();


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void processNumbers(ActionEvent event) {
        if(start){
            label.setText("");
            start=false;
        }
        String value=((Button)event.getSource()).getText();
        label.setText(label.getText()+value);
    }
    

    @FXML
    private void processOperator(ActionEvent event) {
        String value=((Button)event.getSource()).getText();
        if(value.equals("CE")){
            start=true;
            operator="";
            number1=0;
            label.setText("0");
            return;
        }
        if(!value.equals("=")){
            if(!operator.isEmpty()) return;
            operator=value;
            number1=Float.parseFloat(label.getText());
            label.setText("");
        }else{
            if(operator.isEmpty()) return;
            number2=Float.parseFloat(label.getText());
            float result=model.calculator(number1, number2, operator);
            label.setText(String.valueOf(result));
        }
    }
    
}
