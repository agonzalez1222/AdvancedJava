import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MedicalAssistant{
	
	final Image image = new Image("https://vignette.wikia.nocookie.net/zombie/images/1/18/Hospital.jpg/revision/latest?cb=20160329114824");
	final BackgroundImage backgroundImage = new BackgroundImage(image, null, null, null, null);
	final Background background = new Background(backgroundImage);
	
	BorderPane border;
	Button logOut,aboutUs, shop, updates, editProf, viewLabs, scheduleApt, doctors, contact;
	TextArea tf;
	HBox hb;
	VBox vb, vb2;
	BorderPane centerPane;
	Text welcome, credit;
	Scene scene;
	Image logo;
	ImageView imv;
	
	public void createUI(Stage stage, Scene scene) {
		//Layout
				border = new BorderPane();
				vb = new VBox(10);
				hb = new HBox(10); 
				vb2 = new VBox(10);
				centerPane = new BorderPane();
				
				//Buttons
				logOut = new Button("Log Out");
				aboutUs = new Button("About Us");
				shop = new Button("Store");
				updates = new Button("Updates");
				editProf= new Button("Update Personal Information");
				viewLabs = new Button("View Labs");
				scheduleApt = new Button("Schedule Appointment");
				doctors = new Button("Doctors");
				contact = new Button("Contact Us");
				
				//Welcome text
				welcome = new Text("Welcome, Patient");
				welcome.setUnderline(true);
				welcome.setEffect(new DropShadow());
				welcome.setStroke(Color.CYAN);
				
				//credit Text
				credit = new Text("created by Alex Croghan, Armando Gonzalez, Kyle Rutherford");
				
				//TextArea Display
				tf = new TextArea("Display Information Here \nThis is a rough mockup of the patient's view");
				tf.setPrefSize(900, 450);
				tf.setEditable(false);
				
				logo = new Image("file:images/logo.png");
				imv = new ImageView(logo);
				imv.setX(100);
				centerPane.setPrefSize(900,900);
				centerPane.setTop(imv);
				centerPane.setCenter(tf);
				
				//Add buttons to VB
				vb.setAlignment(Pos.TOP_LEFT);
				vb.getChildren().addAll(updates, aboutUs, shop, editProf, viewLabs, scheduleApt, doctors);
				
				//Add Text and Button to HB
				hb.setAlignment(Pos.BASELINE_RIGHT);
				hb.setPrefHeight(50);
				hb.getChildren().addAll(welcome,logOut);
				
				//Add button to vb2
				vb2.getChildren().add(contact);
				
				
				
				//Configure BorderPane
				border.setBackground(background);
				border.setCenter(centerPane);
				border.setLeft(vb); // sets vb to Left Border
				border.setTop(hb);  // sets hb to top border
				border.setRight(vb2); // sets vb2 to right border
				border.setBottom(credit);
				border.topProperty();
				border.centerProperty();
			
				scene = new Scene(border);
				
				stage.setTitle("Medical Assistant"); // Set the stage title
				stage.setScene(scene); // Place the scene in the stage
				stage.show(); // Display the stage
				


	
	
	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				ScheduleApt.apt(scheduleApt);

	}
 
}
