package week_1;

import javafx.application.Application; 
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;

public class Programming_projects_5 extends Application {

	public static void main(String[] args) 
	{		
		launch(args);
	}
	
	@Override
   public void start(Stage primaryStage) throws Exception
   {
       Group root = new Group();
       Scene scene = new Scene(root);
       Canvas canvas = new Canvas(500, 300);                   
       GraphicsContext gc = canvas.getGraphicsContext2D();     
       
       // Using these allowed me to position the whole
       // picture after the rings were set
       int x = 15;
       int y = 40; 
       
       // Left to right
       gc.strokeOval(x, y, 150, 150);
       x += 80;
       y += 80;
       gc.strokeOval(x, y, 150, 150);
       x += 80;
       y -= 80;
       gc.strokeOval(x, y, 150, 150);
       x += 80;
       y += 80;
       gc.strokeOval(x, y, 150, 150);
       x += 80;
       y -= 80;
       gc.strokeOval(x, y, 150, 150);
       
       
       root.getChildren().add(canvas);
       primaryStage.setTitle("Olympics in JavaFX");
       primaryStage.setScene(scene);
       primaryStage.show();
   }

}
