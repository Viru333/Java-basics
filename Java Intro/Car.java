import java.awt.*;

public class Car {
    // camelCase
    //Datatypes:
    // int -> 1,2,3
    // double -> decimal 32.5, 32.1
    // String -> "a1a2" or " Hello World"
    // Color -> from awt library
    // boolean -> true or false

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor; // inbuilt datatype for color
    boolean areTailLightsWorking;


    public Car(double averageMilesPerGallon, String licensePlate, Color paintColor, boolean areTailLightsWorking){
        this.averageMilesPerGallon = averageMilesPerGallon;
        this.licensePlate = licensePlate;
        this.paintColor = paintColor;
        this.areTailLightsWorking = areTailLightsWorking;
    }

    public void changePaintColor(Color newPaintColor){
        this.paintColor = newPaintColor;
    }
    public double speedingUp(double currentSpeed){
        currentSpeed += 100;
        return currentSpeed;
    }
}
