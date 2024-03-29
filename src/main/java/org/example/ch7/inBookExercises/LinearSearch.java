package org.example.ch7.inBookExercises;

public class LinearSearch {
    public static void main(String[] args) {

    }

    public static int linearSearch(double[] list, int key){
        for(int i = 0; i < list.length; i++){
            if(key == list[i]){
                return i;
            }
        }
        return -1;
    }

//    public static int binarySearch(int[] list, int key){
//        int low = 0;
//        int high = list.length - 1;
//        int mid = (low + high) / 2;
//
//        if(key < list[mid]){
//            high = mid -1;
//        } else if (key == list[mid]){
//            return mid;
//        } else {
//            low = mid + 1;
//        }
//
//    }

    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        while(high >= low){
            int mid = (low + high) / 2;
            if (key < list[mid]){
                high = mid - 1;
            } else if (key == list[mid]){
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
