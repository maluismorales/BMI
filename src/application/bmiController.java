package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class bmiController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton pi;

    @FXML
    private ToggleGroup tg;

    @FXML
    private RadioButton km;

    @FXML
    private TextField txtHeight;

    @FXML
    private TextField txtWeight;

    @FXML
    private Label lblHeight;

    @FXML
    private Label lblWeight;

    @FXML
    private Button btnCalculate;

    @FXML
    private Label lblBMI;

    @FXML
    private TextField txtBMI;

    @FXML
    private Slider sldrBMIScale;

    // Calculate BMI
    @FXML
    void handleButtonAction(ActionEvent event) {
    	
    	try{
    		Double w ;
    		Double h; 
    		w = Double.valueOf(txtWeight.getText());
    		h = Double.valueOf(txtHeight.getText());
    		
    		Double bmi;
    		  
    		if(pi.isSelected()){
    		bmi = (w * 703.0)/(h*h);
    		txtBMI.setText(String.format("%.2f",bmi));
    		sldrBMIScale.setValue(bmi);
    		}
    		else if(km.isSelected()) {
    		bmi = w /(h*h);
    		txtBMI.setText(String.format("%.2f",bmi));
    		}
    		  
    		}catch(NumberFormatException nf){
    		txtWeight.setText("Enter valid value");
    		txtWeight.selectAll();
    		txtWeight.requestFocus();
    		txtHeight.setText("Enter valid value");
    		txtHeight.selectAll();    		  
    		}
    }

    // Initialize
    @FXML
    void initialize() {
        assert pi != null : "fx:id=\"pi\" was not injected: check your FXML file 'bmi.fxml'.";
        assert tg != null : "fx:id=\"tg\" was not injected: check your FXML file 'bmi.fxml'.";
        assert km != null : "fx:id=\"km\" was not injected: check your FXML file 'bmi.fxml'.";
        assert txtHeight != null : "fx:id=\"txtHeight\" was not injected: check your FXML file 'bmi.fxml'.";
        assert txtWeight != null : "fx:id=\"txtWeight\" was not injected: check your FXML file 'bmi.fxml'.";
        assert lblHeight != null : "fx:id=\"lblHeight\" was not injected: check your FXML file 'bmi.fxml'.";
        assert lblWeight != null : "fx:id=\"lblWeight\" was not injected: check your FXML file 'bmi.fxml'.";
        assert btnCalculate != null : "fx:id=\"btnCalculate\" was not injected: check your FXML file 'bmi.fxml'.";
        assert lblBMI != null : "fx:id=\"lblBMI\" was not injected: check your FXML file 'bmi.fxml'.";
        assert txtBMI != null : "fx:id=\"txtBMI\" was not injected: check your FXML file 'bmi.fxml'.";
        assert sldrBMIScale != null : "fx:id=\"sldrBMIScale\" was not injected: check your FXML file 'bmi.fxml'.";

    }
}
