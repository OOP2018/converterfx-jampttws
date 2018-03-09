package converter;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.TextField;
/**
 * UI controller for events and initializing components.
 */
public class ConverterController {
	@FXML
	TextField textfield1;
	@FXML
	TextField textfield2;
	
	/**
	 * Convert a distance from one unit to another.
	 */
	public void handleConvert(ActionEvent event) {
		try {
			textfield1.setStyle("-fx-text-inner-color: black;");
			String text = textfield1.getText().trim();
			double a = Double.parseDouble(text);
			textfield2.setText(String.format("%f", a * 1.609344));

		    String text2 = textfield2.getText().trim();
			double b = Double.parseDouble(text2);
			textfield1.setText(String.format("%f", b / 1.609344));
//			System.out.println("handleConvert converting " + text);

		} catch (NumberFormatException e) {
			textfield2.setText("invalid");
			textfield1.setStyle("-fx-text-inner-color: red;");
		}
       
    }
        
	
	public void handleClear(ActionEvent event) {
		textfield1.setStyle("-fx-text-inner-color: black;");
	}
	
}
