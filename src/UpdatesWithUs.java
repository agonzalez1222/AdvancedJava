import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class UpdatesWithUs implements EventHandler<ActionEvent> 
{

	@Override
	public void handle(ActionEvent arg0) 
	{
		TextArea tf;
		Stage stage = new Stage();
		
		tf = new TextArea("10/15/2016: Closed due to incliment weather.\n\n02/04/17: Free wheelchair day. \n\n03/02/17: 2 for 1 flu vaccines.\n\n"
				+ "03/05/17:2 for 1 flu vaccines end.\n\n04/06/17: Office closed due to repair.\n\n07/04/17: Closed for 4th of July.\n\n08/14/17: Back to school vist discount time.");
		tf.setPrefSize(900, 450);
		tf.setEditable(false);
		
		Scene updates = new Scene(tf, 500, 500);
		stage.setTitle("Updates");
		stage.setScene(updates);
		stage.show();
		stage.sizeToScene();
	}

}
