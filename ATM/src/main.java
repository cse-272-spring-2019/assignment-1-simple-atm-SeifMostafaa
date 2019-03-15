import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.Insets;
import java.awt.TextField;

import com.sun.javafx.scene.control.behavior.TextInputControlBehavior;
import com.sun.org.apache.xpath.internal.operations.Or;
import com.sun.xml.internal.ws.org.objectweb.asm.Label;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class main extends Application {
	
	Stage window, deposit, withdraw;
	Scene scene1, scene2;
	String amount= "";
	String withFlag = "";
	bankAccount seif = new bankAccount();
	
	String operationList[] = new String[6];
	String amountList[] = new String[6];
	int count = 0;
	int countPRV = 4;
	int countNXT = 4;
	int nxtFlag = 0;
	int prvFlag = 0;
	
	boolean answer;

	public static void main(String[] args) {
		launch(args);	
	}
	
	/*Shifting The Transactions array Function*/
	
	public void checkTrn() {
		int j;
		
		if (count > 4) {
		count = 4;
		for (j=0; j<4; j++) {
			
		operationList[j] = operationList[j+1];
		amountList[j] = amountList[j+1];			
			}
		}
	}
	
	/*GUI Implementation*/
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("ATM Login Form");
		
		deposit = primaryStage;
		deposit.setTitle("ATM Login Form");
		
		withdraw = primaryStage;
		withdraw.setTitle("ATM Login Form");
		
		
		
		Stage deposit = new Stage();
		deposit.initModality(Modality.APPLICATION_MODAL);
		deposit.setTitle("Depositing");
		
		Stage withdraw = new Stage();
		withdraw.initModality(Modality.APPLICATION_MODAL);
		withdraw.setTitle("Withdrawing");
	
		GridPane gridtrn = new GridPane();
		Scene scenetrn = new Scene(gridtrn, 700, 500);
		

		GridPane gridDepo = new GridPane();
		gridDepo.setAlignment(Pos.CENTER);
		gridDepo.setVgap(15);
		gridDepo.setHgap(15);
		gridDepo.setPadding(new javafx.geometry.Insets (10,0,0,0));
		
		
		GridPane gridWith = new GridPane();
		gridWith.setAlignment(Pos.CENTER);
		gridWith.setVgap(15);
		gridWith.setHgap(15);
		gridWith.setPadding(new javafx.geometry.Insets (10,0,0,0));
		
		
		
		Scene scene3 = new Scene (gridDepo, 700, 500);
		Scene scene4 = new Scene (gridWith, 700, 500);
		
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.setPadding(new javafx.geometry.Insets (10,0,0,0));
		
		
		
		Text welcometxt = new Text("Welcome");
		welcometxt.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
		grid.add(welcometxt, 0, 0);
		
		javafx.scene.control.Label lbluser = new javafx.scene.control.Label("CardNumber ");
		grid.add(lbluser, 0, 1);
		
		javafx.scene.control.TextField usrtxt = new javafx.scene.control.TextField();
		grid.add(usrtxt, 1, 1);
		
		
		javafx.scene.control.Label lblpass = new javafx.scene.control.Label("PassCode ");
		grid.add(lblpass, 0, 2);
		
		javafx.scene.control.PasswordField usrpass = new javafx.scene.control.PasswordField();
		grid.add(usrpass, 1, 2);
		
		
		
		javafx.scene.control.TextField data = new javafx.scene.control.TextField();
		data.setEditable(false);
		
	    
	    /* Setting The Depositing Scene Numbers*/
		
		javafx.scene.control.TextField fieldDepo = new javafx.scene.control.TextField();
		fieldDepo.setEditable(false);
		
		GridPane nums1 = new GridPane();
		nums1.getColumnConstraints().add(new ColumnConstraints(50));
		nums1.getColumnConstraints().add(new ColumnConstraints(50));
		nums1.getColumnConstraints().add(new ColumnConstraints(50));

	    nums1.getRowConstraints().add(new RowConstraints(70));
	    nums1.getRowConstraints().add(new RowConstraints(70));
	    nums1.getRowConstraints().add(new RowConstraints(70));
	    nums1.getRowConstraints().add(new RowConstraints(70));
		
		
	    
	    Button button01 = new Button("0");
		button01.setOnAction(e -> {
			amount += "0";
			fieldDepo.setText(amount);
		});
		
		Button button11 = new Button("1");
		button11.setOnAction(e -> {
			amount += "1";
			fieldDepo.setText(amount);
		});
		Button button21 = new Button("2");
		button21.setOnAction(e -> {
			amount += "2";
			fieldDepo.setText(amount);
		});
		
		Button button31 = new Button("3");
		button31.setOnAction(e -> {
			amount += "3";
			fieldDepo.setText(amount);
		});		
		Button button41 = new Button("4");
		button41.setOnAction(e -> {
			amount += "4";
			fieldDepo.setText(amount);
		});

		Button button51 = new Button("5");
		button51.setOnAction(e -> {
			amount += "5";
			fieldDepo.setText(amount);
		});

		Button button61 = new Button("6");
		button61.setOnAction(e -> {
			amount += "6";
			fieldDepo.setText(amount);

		});

		Button button71 = new Button("7");
		button71.setOnAction(e -> {
			amount += "7";
			fieldDepo.setText(amount);

		});

		Button button81 = new Button("8");
		button81.setOnAction(e -> {
			amount += "8";
			fieldDepo.setText(amount);

		});

		Button button91 = new Button("9");
		button91.setOnAction(e -> {
			amount += "9";
			fieldDepo.setText(amount);
		});
		
		Button buttondepo2 = new Button("Deposit");
		buttondepo2.setOnAction(e ->{
			
			seif.deposit(fieldDepo.getText());
			
			if(count > 4)
				checkTrn();
			amountList[count] = fieldDepo.getText();
			operationList[count] = ("Deposited: ");
			countPRV = 4;
			count++;

			fieldDepo.setText(" ");
			amount = "";
			
			deposit.close();;
			
		});
		
		
		Button back1 = new Button ("Back");
		back1.setOnAction(e ->{
			fieldDepo.setText(" ");
			amount = "";
			deposit.close();
		});
				
		
		
		nums1.add(button01, 2, 3);
		nums1.add(button11, 1, 0);
		nums1.add(button21, 2, 0);
		nums1.add(button31, 3, 1);
		nums1.add(button41, 1, 1);
		nums1.add(button51, 2, 1);
		nums1.add(button61, 3, 2);
		nums1.add(button71, 1, 2);
		nums1.add(button81, 2, 2);
		nums1.add(button91, 3, 0);
	
		gridDepo.add(nums1, 2, 5);
		gridDepo.add(fieldDepo, 0, 5);
		gridDepo.add(buttondepo2, 0, 7);
		gridDepo.add(back1, 1, 7);
		
		
	    /*Setting The Depositing Scene Numbers*/
		/*Finishing The Withdrawing Scene Numbers*/
		

		javafx.scene.control.TextField fieldWith = new javafx.scene.control.TextField();
		fieldWith.setEditable(false);
		
		GridPane nums2 = new GridPane();
		nums2.getColumnConstraints().add(new ColumnConstraints(50));
		nums2.getColumnConstraints().add(new ColumnConstraints(50));
		nums2.getColumnConstraints().add(new ColumnConstraints(50));

	    nums2.getRowConstraints().add(new RowConstraints(70));
	    nums2.getRowConstraints().add(new RowConstraints(70));
	    nums2.getRowConstraints().add(new RowConstraints(70));
	    nums2.getRowConstraints().add(new RowConstraints(70));

		
	    
	    Button button02 = new Button("0");
		button02.setOnAction(e -> {
			amount += "0";
			fieldWith.setText(amount);
		});
		
		Button button12 = new Button("1");
		button12.setOnAction(e -> {
			amount += "1";
			fieldWith.setText(amount);
		});
		Button button22 = new Button("2");
		button22.setOnAction(e -> {
			amount += "2";
			fieldWith.setText(amount);
		});
		
		Button button32 = new Button("3");
		button32.setOnAction(e -> {
			amount += "3";
			fieldWith.setText(amount);
		});		
		Button button42 = new Button("4");
		button42.setOnAction(e -> {
			amount += "4";
			fieldWith.setText(amount);
		});

		Button button52 = new Button("5");
		button52.setOnAction(e -> {
			amount += "5";
			fieldWith.setText(amount);
		});

		Button button62 = new Button("6");
		button62.setOnAction(e -> {
			amount += "6";
			fieldWith.setText(amount);

		});

		Button button72 = new Button("7");
		button72.setOnAction(e -> {
			amount += "7";
			fieldWith.setText(amount);

		});

		Button button82 = new Button("8");
		button82.setOnAction(e -> {
			amount += "8";
			fieldWith.setText(amount);

		});

		Button button92 = new Button("9");
		button92.setOnAction(e -> {
			amount += "9";
			fieldWith.setText(amount);
		});
		
		Button buttonwith2 = new Button ("Withdraw");
		buttonwith2.setOnAction(e ->{
			
			if ( seif.withdraw(fieldWith.getText()) ) {
				if(count > 4)
					checkTrn();				
				amountList[count] = fieldWith.getText();
				operationList[count] = ("Withdrawned: ");
				countPRV = 4;
				count++;
				
				fieldDepo.setText(" ");
				fieldWith.setText(" ");
				amount = "";
				
			}
			else {
				ErrorMessage.display("Can't Withdraw !!", "The Amount You Wanted To Withdraw is More than Your Balance");
				fieldWith.setText(" ");
				data.setText(" ");
				amount = "";

			}
			
			withdraw.close();
		});
			
		
		Button back2 = new Button ("Back");
		back2.setOnAction(e ->{
			fieldWith.setText(" ");
			amount = "";
			withdraw.close();
		});
		
			nums2.add(button02, 2, 3);
			nums2.add(button12, 1, 0);
			nums2.add(button22, 2, 0);
			nums2.add(button32, 3, 1);
			nums2.add(button42, 1, 1);
			nums2.add(button52, 2, 1);
			nums2.add(button62, 3, 2);
			nums2.add(button72, 1, 2);
			nums2.add(button82, 2, 2);
			nums2.add(button92, 3, 0);
			
			
			
			gridWith.add(nums2, 2, 5);
			gridWith.add(fieldWith, 0, 5);
			gridWith.add(buttonwith2, 0, 7);
			gridWith.add(back2, 1, 7);
			
		/*Finishing The Withdrawing Scene Numbers*/
		
		
		
		Button buttonnxt = new Button("Next");
		buttonnxt.setOnAction(e ->{
			if (nxtFlag == 0) {
				countNXT = countPRV+1;
				nxtFlag = 1;
			}			
			if (countNXT > 4 ) {
				data.setText("End of History Transactions");
				prvFlag = 0;

				}
			
			else{
				
					if (operationList[countNXT] == null || amountList[countNXT] == null) 
					
						countNXT = count-1;
				
					
					data.setText(operationList[countNXT] + amountList[countNXT]);
					countNXT++;	
					prvFlag = 0;
					}
			});

		Button buttonprv = new Button("Previous");
		buttonprv.setOnAction(e ->{
			if (prvFlag == 0) {
				countPRV = countNXT;
				prvFlag = 1;
			}			
			if (countPRV < 0 ) {
				data.setText("End of History Transactions");
				nxtFlag = 0;
				}
			
			
			else{
				if (operationList[countPRV] == null || amountList[countPRV] == null)
					countPRV =  count-1;
				
					data.setText(operationList[countPRV] + amountList[countPRV]);
					countPRV--;
					nxtFlag = 0;
				
				}
			
		});
		
		
		
		Button escButton = new Button("Exit");
		escButton.setOnAction(e ->{
			window.close();
		});


		
		HBox trn = new HBox(210);
		HBox option = new HBox(230);
		option.getChildren().add(buttonprv);
		option.getChildren().add(escButton);
		option.getChildren().add(buttonnxt);
		
		
		
		Button buttondepo = new Button("Deposit");
		buttondepo.setOnAction(e ->{
			deposit.setScene(scene3);
			deposit.show();
		});
		
		Button buttonwith = new Button("Withdraw");
		buttonwith.setOnAction(e ->{
			withdraw.setScene(scene4);
			withdraw.show();
		});
		
		Button buttoninq = new Button("Inquiry");
		buttoninq.setOnAction(e ->{
			data.setText("Account Balance: "+ Double.toString(seif.inquiry()));
			if(count > 4)
				checkTrn();
			amountList[count] = Double.toString(seif.inquiry());
			operationList[count] = ("Balance Inquired: ");
			countPRV = 4;
			count++;
			amount = "";
		});

		
		
		trn.getChildren().addAll(buttoninq, buttonwith, buttondepo);
		gridtrn.setAlignment(Pos.CENTER);
		gridtrn.setVgap(15);
		gridtrn.setHgap(15);
		gridtrn.setPadding(new javafx.geometry.Insets (10,0,0,0));
		gridtrn.add(option, 0, 9);
		gridtrn.add(trn, 0, 6);
		gridtrn.add(data, 0, 3);
		Text trntxt = new Text("Welcome, client");
		trntxt.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
		gridtrn.add(trntxt, 0, 0);

		
		
		
		Button loginBTN = new Button ("Login");
		grid.add(loginBTN, 1, 3);
		loginBTN.setOnAction(e -> {
			if ( !(usrtxt.getText().toString().equalsIgnoreCase("5402")) || !(usrpass.getText().toString().equalsIgnoreCase("5402") ))
				ErrorMessage.display("Login Error", "You Have Entered A Wrong CardNumber or PassCode, Please Check Your Bank Account And Try Again");
				
			else
				window.setScene(scenetrn);
		});
		
		
		Scene loginScene = new Scene(grid, 500, 500);
		window.setScene(loginScene);
		window.show();
		
		
		
		
	}

}
