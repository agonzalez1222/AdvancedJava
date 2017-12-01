import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MedicalAssistant{
	
	final Image image = new Image("https://vignette.wikia.nocookie.net/zombie/images/1/18/Hospital.jpg/revision/latest?cb=20160329114824");
	final BackgroundImage backgroundImage = new BackgroundImage(image, null, null, null, null);
	final Background background = new Background(backgroundImage);
	
	BorderPane border;
	static Button  logIn, logOut,aboutUs, shop, updates, viewProf, viewLabs, scheduleApt, doctors, contact, signUp, finish, finishLogIn;
	TextArea tf;
	static HBox hb;
	static VBox vb, vb2, signUpVBox, logInVBox;
	BorderPane centerPane;
	static Text welcome, credit, first, last, emailAddress, un, pw;
	static TextField firstName, lastName, dob, email, username, password,enterUn;
	static Stage stage,signUpStage, logInStage;
	static Scene scene, signUpScene, logInScene;
	Image logo;
	ImageView imv;
	static Patient patient;
	static PasswordField enterPw = new PasswordField();
	
	
	public void createUI(Stage stage, Scene scene) {
		//Layout
				border = new BorderPane();
				vb = new VBox(50);
				signUpVBox = new VBox();
				hb = new HBox(10); 
				vb2 = new VBox(50);
				centerPane = new BorderPane();
				logInVBox = new VBox();
				
				//Buttons
				logOut = new Button("Log Out");
				aboutUs = new Button("About Us");
				shop = new Button("Store");
				updates = new Button("Updates");
				viewProf= new Button("View Personal Information");
				viewLabs = new Button("View Labs");
				scheduleApt = new Button("Schedule Appointment");
				doctors = new Button("Doctors");
				contact = new Button("Contact Us");
				signUp = new Button("Sign Up");
				finish = new Button("Sign Up");
				logIn = new Button("Log In");
				finishLogIn = new Button("Log In");

				//TextFields
				firstName = new TextField("First Name");
				lastName = new TextField("Last Name");
				dob = new TextField("Age");
				email = new TextField("Email Address");
				username = new TextField("Desired Username");
				password = new TextField("Password");
				enterUn = new TextField("Enter Username");
				
				enterPw.setPromptText("Enter Password");
				
				//Sign Up
				signUpStage =  new Stage();
				
				signUpScene = new Scene(signUpVBox,300,250);
				signUpVBox.getChildren().addAll(firstName, lastName, dob, email,username, password,finish);
				signUpVBox.setAlignment(Pos.CENTER);
				finish.setAlignment(Pos.CENTER);
				signUp.setOnAction(e ->{
					
					signUpStage.setTitle("SIGN UP");
					signUpStage.setScene(signUpScene);
					signUpStage.show();
					
				});
				SavePatientHandler sph = new SavePatientHandler();
				finish.setOnAction(sph);

				
				logOut.setOnAction(new SignoutButtonHandler());
				updates.setOnAction(new UpdatesWithUs());
				contact.setOnAction(new ContactUS());
				
				//Log In Handlers
				logInStage = new Stage();
				logInScene = new Scene(logInVBox,250,200);
				
				enterUn.setAlignment(Pos.CENTER);
				enterPw.setAlignment(Pos.CENTER);
				finishLogIn.setAlignment(Pos.CENTER);
				logInVBox.getChildren().addAll(enterUn, enterPw,finishLogIn);
				logInVBox.setAlignment(Pos.CENTER);
				logIn.setOnAction(e->{
					
					logInStage.setTitle("LOG IN");
					logInStage.setScene(logInScene);
					logInStage.show();
				});
				LogInHandler lih = new LogInHandler();
				finishLogIn.setOnAction(lih);
				
				

				
				
				//credit Text
				credit = new Text("created by Alex Croghan, Armando Gonzalez, Kyle Rutherford");
				
				//TextArea Display
				tf = new TextArea("Welcome to AAK Medical!\n\nHere we work to give the best experience possible for all\n"
						+ "medical needs and provide an unparralled experience. \n\n\nPlease click the contact us button to reach us or view\nour wonderfull"
						+ " doctors by clicking the doctor button.\n\n\nWe also have updates relevant to the practice and a\nviewable store that links to several pharmacies. ");
				tf.setPrefSize(450, 250);
				tf.setFont(new Font(30));
				tf.setEditable(false);
				
				
				logo = new Image("file:images/logo.png");
				imv = new ImageView(logo);
				imv.setX(100);
				centerPane.setPrefSize(300,425);
				centerPane.setTop(imv);
				centerPane.setCenter(tf);
				
				//Add buttons to VB
				vb.setAlignment(Pos.TOP_LEFT);
				vb.getChildren().addAll(updates, aboutUs, shop, doctors);
				
				//Add Text and Button to HB
				hb.setAlignment(Pos.BASELINE_RIGHT);
				hb.setPrefHeight(50);
				hb.getChildren().addAll(signUp,logIn);
				
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
				
				stage.setHeight(1000);
                stage.setWidth(1000);
				stage.setTitle("Medical Assistant"); // Set the stage title
				stage.setScene(scene); // Place the scene in the stage
				stage.show(); // Display the stage
				
		ScheduleApt.apt(scheduleApt);
				
	}
}
