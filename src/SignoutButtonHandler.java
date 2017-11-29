import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SignoutButtonHandler implements EventHandler<ActionEvent> 
{
	public void handle(ActionEvent event)
	{
		Stage stage = new Stage();
		Button yes = new Button("Yes");
		Button no = new Button("No");
		HBox hb = new HBox(100); 
		hb.getChildren().addAll(yes, no);
		BorderPane pane = new BorderPane();
		
		
		Scene appt = new Scene(hb, 400, 75);
		stage.setTitle("Log Out");
		stage.setScene(appt);
		stage.show();
		stage.sizeToScene();
	}
}
