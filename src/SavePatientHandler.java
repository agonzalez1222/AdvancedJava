import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class SavePatientHandler implements EventHandler<ActionEvent>{
	
	@Override
	public void handle(ActionEvent arg0) {
		File filename = new File("patientInfo.txt");
		Scanner scan = null;
		PrintWriter pw= null;
		Boolean isInUse = false;
		String str;
		String[] strSplit;

		
		try {
			filename.createNewFile();
			scan = new Scanner(filename);
			FileWriter fw = new FileWriter(filename,true);
			pw = new PrintWriter(fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(scan.hasNextLine()) {
			str = scan.nextLine();
			strSplit = str.split(",");
			if (strSplit[4].equals(MedicalAssistant.username.getText()))
				isInUse = true;
		}
		
		if(isInUse) {
			System.out.println("Username is already in use! Try again.");
			
		} else {
			pw.println(MedicalAssistant.firstName.getText()+ ","+ MedicalAssistant.lastName.getText()+","+MedicalAssistant.dob.getText()+"," 
		+MedicalAssistant.email.getText()+ ","+MedicalAssistant.username.getText()+","+MedicalAssistant.password.getText());
			MedicalAssistant.signUpStage.close();
			
		}
		scan.close();
		pw.close();
	}
	
	
}


