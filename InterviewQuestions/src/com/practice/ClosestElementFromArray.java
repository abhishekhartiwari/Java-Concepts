package com.practice;

public class ClosestElementFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 9, 11, 19, 15};
        int target = 15;
        int closest = arr[0]; // assume first is closest
        int minDiff = Math.abs(target - arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(target - arr[i]);
            if (diff < minDiff) {
                minDiff = diff;
                closest = arr[i];
            }
        }

        System.out.println("Closest value to " + target + " is: " + closest);

    }
}