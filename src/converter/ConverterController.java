package converter;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
/**
 * UI controller for events and initializing components.
 */
public class ConverterController {
	@FXML
	TextField textfield1;
	@FXML
	TextField textfield2;
	@FXML
	ComboBox<Length> combobox1;
	@FXML
	ComboBox<Length> combobox2;
	
	
	/**
	 * Convert a distance from one unit to another.
	 */
	public void handleConvert(ActionEvent event) {
		try {
			textfield1.setStyle("-fx-text-inner-color: black;");
			textfield2.setStyle("-fx-text-inner-color: black;");
			String text = textfield1.getText().trim();
			double b1 = combobox1.getValue().getValue();
			double b2 = combobox2.getValue().getValue();
			if (!text.equals("")) {
				double a = Double.parseDouble(text);
				textfield2.setText(String.format("%.4g", (a*b1)/b2));
			} else {
				String text2 = textfield2.getText().trim();
				double b = Double.parseDouble(text2);
				textfield1.setText(String.format("%.4g", (b*b2)/b1));
			}
		} catch (NumberFormatException e) {
			textfield1.setStyle("-fx-text-inner-color: red;");
			textfield2.setStyle("-fx-text-inner-color: red;");
			textfield2.setText("invalid");
		}
       
    }
        
	@FXML
	public void handleClear(ActionEvent event) {
		textfield1.setText("");
		textfield2.setText("");	
		textfield1.setStyle("-fx-text-inner-color: black;");
		textfield2.setStyle("-fx-text-inner-color: black;");
	}
	
	/**
	 * JavaFX calls the initialize() method of your controller when
	 * it creates the UI form, after the components have been created
	 * and @FXML annotated attributes have been set.
	 *
	 * This is a hook to initialize anything your controller or UI needs.
	 */
	@FXML
	public void initialize() {
	    // This is for testing
	    System.out.println("Running initialize");
	    if (combobox1 != null) {
	      combobox1.getItems().addAll( Length.values() );
	      combobox1.getSelectionModel().select(0); // select an item to show
	    }
	    if (combobox2 != null) {
	      combobox2.getItems().addAll( Length.values() );
	      combobox2.getSelectionModel().select(1); // select an item to show
	    }
	}
	
}
