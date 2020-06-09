package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Calculator implements Initializable{

@FXML	
private TextField input1;
@FXML	
private TextField input2;
@FXML
private ComboBox<String> myoperator;
@FXML	
private Button clear;
@FXML	
private Label result;
public void operator(ActionEvent event)
{

 try
 { 	String op=myoperator.getValue();
 	int num1=Integer.parseInt(input1.getText());
 	int num2=Integer.parseInt(input2.getText());
 	int sum=0;
 	switch(op)
 	 {
 	 case "+" :sum=num1+num2 ; break;
 	 case "-":sum=num1-num2 ; break;
 	 case "*":sum=num1*num2 ; break;
 	 case "/":sum=num1/num2 ; break;
 	 }
 	result.setText(String.valueOf(sum));
 }catch (Exception e)
 {
 	
 	result. setText("Please Enter Digit Only");
 }
 
}
public void clear1(ActionEvent event) {
input1.clear();
input2.clear();
myoperator.setValue(null);
result.setText("");
}

@Override
public void initialize(URL location, ResourceBundle resources) {
	myoperator.getItems().addAll("+","-","*","/");	
	myoperator.setOnAction(this::operator);	
	clear.setOnAction(this::clear1);
}
}
