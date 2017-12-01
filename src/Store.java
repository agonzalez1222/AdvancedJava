import java.awt.Desktop;
import java.net.URL;

import javafx.scene.control.Button;

public class Store extends MedicalAssistant
{
	public static void store(Button store)
	{
		store.setOnAction(e -> {
			
			
			    try {
			        Desktop.getDesktop().browse(new URL("https://www.walmart.com/cp/pharmacy/1088604").toURI());
			    } catch (Exception e1) {
			        e1.printStackTrace();
			    }
			
			
		});
	}
}
