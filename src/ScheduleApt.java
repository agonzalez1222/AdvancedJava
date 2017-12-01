	import javafx.geometry.Insets;
import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
	import javafx.stage.Stage;

	public class ScheduleApt extends MedicalAssistant
	{
		

		
		public static void apt(Button b)
		{
				b.setOnAction( e -> 
			{
				Stage stage = new Stage();
				Button submit = new Button("Submit");
				Button exit = new Button("Exit");
				HBox h = new HBox();
				Image cross = new Image("https://image.freepik.com/free-vector/doctor-background-design_1270-62.jpg");
				final BackgroundImage backgroundImage = new BackgroundImage(cross, null, null, null, null);
				final Background background = new Background(backgroundImage);
				FlowPane f1 = new FlowPane();
				VBox text = new VBox();
				Label firstName = new Label("Name:");
				TextField fName = new TextField();
				fName.setPromptText("Please enter your name");
				Label lastName = new Label("Last Name:");
				TextField lName = new TextField();
				lName.setPromptText("Please enter your last name");
				Label desc = new Label("Describe what is going on below:");
				TextField describe = new TextField();
				describe.setPromptText("Describe");
				describe.setPrefHeight(100);
				describe.setPrefWidth(1000);
				text.setSpacing(30);
				text.getChildren().addAll(firstName, fName, lastName, lName, desc,describe);
				text.getChildren().addAll(exit, submit);
				text.setPadding(new Insets(30));
				f1.setBackground(background);
				f1.getChildren().add(text);
				Scene appt = new Scene(f1, 500, 500);
				stage.setTitle("Appointments");
				stage.setScene(appt);
				stage.show();
				stage.sizeToScene();
				
				exit.setOnAction(w -> {
					
					stage.close();
				});
			
			});
	}
}
