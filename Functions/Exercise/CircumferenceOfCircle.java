package Functions.Exercise;

import java.util.*;

public class CircumferenceOfCircle {

    public static Double getCircumference(Double radius){
        return 2*3.14*radius;
    } 
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Radius : ");
        Double radius = sc.nextDouble();
        
        System.out.print(getCircumference(radius));
        sc.close();
    }
}
