import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ContactUS implements EventHandler<ActionEvent> 
{

	@Override
	public void handle(ActionEvent arg0) 
	{
		TextArea tf;
		Stage stage = new Stage();
		
		tf = new TextArea("Phone\n  Weekdays: 770-435-998  \n  Weekends: 770-398-9513\n\nEmail\n  Office: AAKMedical@yahoo.com\n  D. Scott Smith: SsmithAAKMed@yahoo.com\n"
				+ "  Dr. Bob Thorton: BthortonAAKMed@yahoo.com\n\nEmail and phone are unavailible on most major holidays.");
		tf.setPrefSize(400, 300);
		tf.setEditable(false);
		
		Scene contact = new Scene(tf);
		stage.setTitle("Contact information");
		stage.setScene(contact);
		stage.show();
		stage.sizeToScene();
		
	}

}
