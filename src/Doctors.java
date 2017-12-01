import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Doctors 
{
	public static void doc(Button doctors)
	{
		doctors.setOnAction(e -> 
		{
			Stage view = new Stage();
			FlowPane flow = new FlowPane();
			VBox v = new VBox();
			VBox b = new VBox();
			Label intro = new Label("Lead Doctors ");
			Label doctor1 = new Label("Scott Smith");
			Label doctor2 = new Label("Bob Thorton");
			Image doc1 = new Image("https://media.istockphoto.com/photos/friendly-doctor-at-the-hospital-picture-id511583494?k=6&m=511583494&s=612x612&w=0&h=-8azV9sjiTx9dPBAIxy0I9g15pUVs4gTVT7gGsjx9J4=");
			Image doc2 = new Image("http://www.beverlychamber.com/wp-content/uploads/2017/11/headaches-doctor.jpg");
			ImageView num1 = new ImageView(doc1);
			ImageView num2 = new ImageView(doc2);
			num1.setFitHeight(200);
			num1.setFitWidth(200);
			num2.setFitHeight(200);
			num2.setFitWidth(200);
			Button exit1 = new Button("Exit");
			v.getChildren().addAll(intro, num1, doctor1, num2, doctor2, exit1);
			
			view.setTitle("Doctors");
			v.setPadding(new Insets(130));
			flow.getChildren().addAll(v);
			
			
			Scene s1 = new Scene(flow, 550, 650);
			view.setScene(s1);
			view.show();
			
			exit1.setOnAction(q -> 
			{
				view.close();
			});
			
		
		});
	}
}
