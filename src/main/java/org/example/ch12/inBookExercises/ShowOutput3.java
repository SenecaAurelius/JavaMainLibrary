package org.example.ch12.inBookExercises;

public class ShowOutput3 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 2; i++){
                System.out.println(i + " ");
                System.out.println(1 / 0);
            }
        }
        catch (Exception ex){

        }
    }
}
