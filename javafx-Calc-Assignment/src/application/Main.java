package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		/*
		 * try { BorderPane root = new BorderPane(); Scene scene = new
		 * Scene(root,400,400);
		 * scene.getStylesheets().add(getClass().getResource("application.css").
		 * toExternalForm()); primaryStage.setScene(scene); primaryStage.show(); }
		 * catch(Exception e) { e.printStackTrace(); }
		 */
	Parent root=	FXMLLoader.load(getClass().getResource("Calculator.fxml"));
	Scene scene=new Scene(root);
	stage.setScene(scene);	
	stage.setTitle("Simple Calculator");
	//stage.initStyle(StageStyle.UNDECORATED);
	stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
