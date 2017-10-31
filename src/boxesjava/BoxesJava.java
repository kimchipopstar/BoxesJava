/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxesjava;
import java.util.Scanner;
/**
 *
 * @author j.k.
 */
public class BoxesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter height, width, and length for first box");
        Box firstBox;
        firstBox = new Box (userInput.nextFloat(), userInput.nextFloat(), userInput.nextFloat());
        System.out.println("your first box has volume of: " + firstBox.calculateVolume());
        System.out.println("Enter height, width, and length for second box");
        Box secondBox;
        secondBox = new Box (userInput.nextFloat(), userInput.nextFloat(), userInput.nextFloat());
        System.out.println("your second box has volume of: " + secondBox.calculateVolume());
        float fits = firstBox.fitTimes(firstBox, secondBox);
        System.out.println("second box fits " + fits + " times");
        
        
        
    }
    
}
