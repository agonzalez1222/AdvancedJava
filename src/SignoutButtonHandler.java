import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SignoutButtonHandler implements EventHandler<ActionEvent> 
{
	public static Object logoutStage;

	public void handle(ActionEvent event)
	{
		
		Text t = new Text("Click continue to signout and close program, otherwise click the X on this box.");
		t.setFont(new Font(20));
		BorderPane border = new BorderPane();
		Stage logoutStage = new Stage();
		Button signOut = new Button("Continue");
		
		signOut.setOnAction(new continueButtonHandler());
		
		//properties of the HBox
		HBox hb = new HBox(10); 
		hb.setAlignment(Pos.CENTER);
		hb.getChildren().addAll(signOut);
		
		// Set up border pane parts
		border.setTop(t);
		border.setCenter(hb);
		
		Scene scene = new Scene(border);
		
		logoutStage.setHeight(200);
		logoutStage.setTitle("Log Out");
		logoutStage.setScene(scene);
		logoutStage.show();
		
	}
	
	public class continueButtonHandler implements EventHandler<ActionEvent> 
	{
		public void handle(ActionEvent event)
		{
			//exits out of whole program if button is clicked
			System.exit(0);
		}
	}
	
}
