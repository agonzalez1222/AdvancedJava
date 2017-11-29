import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class LogInHandler implements EventHandler<ActionEvent>{
	
	@Override
	public void handle(ActionEvent event) {
		
		File filename = new File("patientInfo.txt");
		Scanner scan = null;
		String str;
		String[] strSplit;
		
		boolean loggedIn = false;
		
		try {
			scan = new Scanner(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(scan.hasNextLine()) {
			str = scan.nextLine();
			strSplit = str.split(",");
			if(strSplit[4].equals(MedicalAssistant.enterUn.getText())&&strSplit[5].equals(MedicalAssistant.enterPw.getText())) {
				MedicalAssistant.patient = new Patient(strSplit[0],strSplit[01],strSplit[2],strSplit[3],strSplit[4],strSplit[5]);
				//Welcome text
				MedicalAssistant.welcome = new Text("Welcome, " + MedicalAssistant.patient.firstName );
				MedicalAssistant.welcome.setUnderline(true);
				MedicalAssistant.welcome.setEffect(new DropShadow());
				MedicalAssistant.welcome.setStroke(Color.CYAN);
				
				MedicalAssistant.hb.getChildren().removeAll(MedicalAssistant.signUp, MedicalAssistant.logIn);
				MedicalAssistant.hb.getChildren().addAll(MedicalAssistant.welcome, MedicalAssistant.logOut);
				
				MedicalAssistant.vb.getChildren().addAll(MedicalAssistant.viewProf, MedicalAssistant.viewLabs, MedicalAssistant.scheduleApt);//ADD or CHANGE PATIENT VIEW BUTTONS HERE
				loggedIn = true;
				
			}
			
			//MedicalAssistant.logInVBox.getChildren().addAll(error);
		}
		if(loggedIn) {
			MedicalAssistant.logInStage.close();
		}
		
	}

}
