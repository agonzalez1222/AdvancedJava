import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class UpdatesWithUs implements EventHandler<ActionEvent> 
{

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		TextArea tf;
		Stage stage = new Stage();
		
		tf = new TextArea("10/15/2016: Closed due to incliment weather.\n 02/04/17: Free wheelchair day. \n 03/02/17: 2 for 1 flu vaccines.");
		tf.setPrefSize(900, 450);
		tf.setEditable(false);
		
		Scene updates = new Scene(tf, 500, 500);
		stage.setTitle("Updates");
		stage.setScene(updates);
		stage.show();
		stage.sizeToScene();
	}

}
