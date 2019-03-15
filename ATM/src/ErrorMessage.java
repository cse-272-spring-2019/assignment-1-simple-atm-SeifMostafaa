import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ErrorMessage {
	
	public static void display(String title, String message) {
		
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(700);
		window.setMinHeight(200);
		
		Label label = new Label();
		label.setText(message);
		
		Button closeBTN = new Button ("Sorry !!");
		closeBTN.setOnAction(e -> window.close() );
		
		VBox layout = new VBox(70);
		layout.getChildren().addAll(label, closeBTN);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		
		window.setScene(scene);
		window.showAndWait();
		
		
		
	}
	
	

}
