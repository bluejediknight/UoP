package week_1;

import javafx.application.Application; 
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;

public class Programming_projects_4 extends Application {

	public static void main(String[] args) 
	{		
		launch(args);
	}
	
	@Override
   public void start(Stage primaryStage) throws Exception
   {
       Group root = new Group();
       Scene scene = new Scene(root);
       Canvas canvas = new Canvas(400, 800);                   
       GraphicsContext gc = canvas.getGraphicsContext2D();     
       
       // Head
       gc.strokeOval(125, 30, 150, 150);
       gc.fillOval(165, 80, 10, 20);                          
       gc.fillOval(220, 80, 10, 20);                          
       gc.strokeArc(160, 100, 80, 50, 180, 180, ArcType.OPEN);
       
       // Middle
       gc.strokeOval(75, 180, 250, 250);       

       // Bottom
       gc.strokeOval(25, 430, 350, 350);
       
       
       root.getChildren().add(canvas);
       primaryStage.setTitle("HappyFace in JavaFX");
       primaryStage.setScene(scene);
       primaryStage.show();
   }

}
