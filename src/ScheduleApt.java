import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScheduleApt extends MedicalAssistant
{
	

	
	public static void apt(Button b)
	{
			b.setOnAction( e -> 
		{
			Stage stage = new Stage();
			FlowPane f1 = new FlowPane();
			VBox text = new VBox();
			Label firstName = new Label("Name:");
			TextField fName = new TextField();
			fName.setPromptText("Please enter your name");
			Label lastName = new Label("Last Name:");
			TextField lName = new TextField();
			lName.setPromptText("Please enter your last name");
			Label desc = new Label("Describe what is going on below:");
			text.getChildren().addAll(firstName, fName, lastName, lName, desc);
			f1.getChildren().add(text);
			Scene appt = new Scene(f1, 500, 500);
			stage.setTitle("Appointments");
			stage.setScene(appt);
			stage.show();
			stage.sizeToScene();
		
		});
	}
}
