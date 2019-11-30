

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraApp extends Application {

	private RootController root;
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		root =new RootController();
		Scene scene=new Scene(root.getView());
		primaryStage.setTitle("CaculadoraFXML");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

	


}
