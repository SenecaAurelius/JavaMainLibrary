package org.example.ch4.inBookExercises;

public class FormatDemo {
    public static void main(String[] args) {
        //Display the header of the table
        System.out.printf("%−10s%−10s%−10s%−10s%−10s%n", "Degrees",
                "Radians", "Sine", "Cosine", "Tangent");

        //display values for 30 degrees
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("\"%−10d%−10.4f%−10.4f%−10.4f%−10.4f%n",
                radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

        //display values for 60 degrees
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%−10d%−10.4f%−10.4f%−10.4f%−10.4f%n",
                radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
    }
}
