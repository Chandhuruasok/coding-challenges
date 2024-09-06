import java.io.*;
import java.util.*;

public class Solution {
    // Static variables for breadth and height
    static int B;
    static int H;
    static boolean flag = true; // A flag to check if inputs are valid
    
    // Static block to initialize and validate the input
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();  // Read breadth
        H = sc.nextInt();  // Read height
        
        // Validate the inputs
        if (B <= 0 || H <= 0) {
            flag = false; // Set flag to false if inputs are invalid
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
    public static void main(String[] args) {
        // If the flag is true, calculate and print the area
        if (flag) {
            int area = B * H;  // Calculate area of the parallelogram
            System.out.println(area);
        }
    }
}
