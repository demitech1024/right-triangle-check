import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import java.lang.Math;

public class CheckRightTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double base;
        double height;
        double hypotenuse;
        String output = "";

        System.out.println();
        System.out.print("Enter base: ");
        base = in.nextDouble();
        in.nextLine();
        System.out.print("Enter height: ");
        height = in.nextDouble();
        in.nextLine();
        System.out.print("Enter hypotenuse: ");
        hypotenuse = in.nextDouble();
        in.nextLine();

        output = ((Math.pow(base, 2) + Math.pow(height, 2)) == Math.pow(hypotenuse, 2)) ? "Yes, that's a right triangle!" : "Nope...not a right triangle.";
        System.out.println("\n" + output);

        in.close();
    }
}