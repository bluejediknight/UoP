package week_2;
import java.util.Scanner;
public class SimpleCalculation_Final {

    public static void main(String[] args) {
        double w, l, h;
        double numWin, winWidth, winHeight;
        double numDoors, doorWidth, doorHeight;
        double surfaceArea;
        
        System.out.println("Please enter the width, length and height of the house to be painted");
        Scanner in = new Scanner(System.in);
        
        w = in.nextDouble();
        l = in.nextDouble();
        h = in.nextDouble();
        System.out.println("Please enter the number of windows, width and height");
        
        numWin = in.nextDouble();
        winWidth = in.nextDouble();
        winHeight = in.nextDouble();
        System.out.println("Please enter the number of doors, width and height");
        
        numDoors = in.nextDouble();
        doorWidth = in.nextDouble();
        doorHeight = in.nextDouble();
        surfaceArea = (w * h * 2 + l * h * 2) - (numWin * winWidth * winHeight + numDoors * doorWidth * doorHeight);
        System.out.println("The total paintable surface area is: "+ surfaceArea);
    }

}
