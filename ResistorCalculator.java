package resistor.calculator;

import java.util.Scanner;

/**
 *
 * @author Alex Brandt
 */
public class ResistorCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        String color1, color2, color3, color4;
        String band1 = "";
        String band2 = "";
        String value = "";
        int bandValue;
        double tolerance = 0.0;
        double multiplier = 0.0;
        double finalValue = 0.0;
        
        System.out.println("What is the color of the first band?");
        color1 = reader.nextLine();
        
        System.out.println("What is the color of the second band?");
        color2 = reader.nextLine();
        
        System.out.println("What is the color of the third band?");
        color3 = reader.nextLine();
        
        System.out.println("What is the color of the fourth band?");
        color4 = reader.nextLine();
        
        //conditionals for first band/color
        if ("black".equals(color1)) {
            band1 = "0";
        } 
        else if ("brown".equals(color1)) {
            band1 = "1";
        }
        else if ("red".equals(color1)) {
            band1 = "2";
        }
        else if ("orange".equals(color1)) {
            band1 = "3";
        }
        else if ("yellow".equals(color1)) {
            band1 = "4";
        }
        else if ("green".equals(color1)) {
            band1 = "5";
        }
        else if ("blue".equals(color1)) {
            band1 = "6";
        }
        else if ("violet".equals(color1)) {
            band1 = "7";
        }
        else if ("gray".equals(color1)) {
            band1 = "8";
        }
        else if ("white".equals(color1)) {
            band1 = "9";
        }
        
        //conditionals for second band/color
        if ("black".equals(color2)) {
            band2 = "0";
        } 
        else if ("brown".equals(color2)) {
            band2 = "1";
        }
        else if ("red".equals(color2)) {
            band2 = "2";
        }
        else if ("orange".equals(color2)) {
            band2 = "3";
        }
        else if ("yellow".equals(color2)) {
            band2 = "4";
        }
        else if ("green".equals(color2)) {
            band2 = "5";
        }
        else if ("blue".equals(color2)) {
            band2 = "6";
        }
        else if ("violet".equals(color2)) {
            band2 = "7";
        }
        else if ("gray".equals(color2)) {
            band2 = "8";
        }
        else if ("white".equals(color2)) {
            band2 = "9";
        }
         
        //value of the multiplier
        if ("black".equals(color3)) {
            multiplier = 1;
        }
        else if ("brown".equals(color3)) {
            multiplier = 10;
        }
        else if ("red".equals(color3)) {
            multiplier = 100;
        }
        else if ("orange".equals(color3)) {
            multiplier = 1000;
        }
        else if ("yellow".equals(color3)){
            multiplier = 10000;
        }
        else if ("green".equals(color3)) {
            multiplier = 100000;
        }
        else if ("blue".equals(color3)) {
            multiplier = 1000000;
        }
        else if ("silver".equals(color3)) {
            multiplier = .01;
        }
        else if ("gold".equals(color3)) {
            multiplier = .1;
        }
        
        //tolerance value
        if ("silver".equals(color4)) {
            tolerance = 10;
        }
        else if ("gold".equals(color4)) {
            tolerance = 5;
        }
        else if ("brown".equals(color4)) {
            tolerance = 1;
        }
        else if ("red".equals(color4)) {
            tolerance = 2;
        }
        else if ("orange".equals(color4)) {
            tolerance = 3;
        }
        else if ("green".equals(color4)) {
            tolerance = .5;
        }
        else if ("blue".equals(color4)) {
            tolerance = .25;
        }
        else if ("violet".equals(color4)) {
            tolerance = .1;
        }
        //value of the first two bands combined
        value = band1 + band2;
        bandValue = Integer.parseInt(value);
        
        //the total value in ohms
        finalValue = bandValue * multiplier;
        
        System.out.println ("The resistor value is " + finalValue + "Ω±" + tolerance + "%.");
    }
    
}

//TO DO: make a GUI for the program
//TO DO: make in Ruby
//TO DO: make for 5 and 6 bar resistors
