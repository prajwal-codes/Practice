package jarvis;
import java.util.*;
public class Resultout {
    public static void main(String[] args) {
        float TotalMarks = 500;
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained in Maths:");
        float a = sc.nextFloat();
        System.out.println("Enter marks obtained in English:");
        float b = sc.nextFloat();
        System.out.println("Enter marks obtained in SST:");
        float c = sc.nextFloat();
        System.out.println("Enter marks obtained in Science:");
        float d = sc.nextFloat();
        System.out.println("Enter marks obtained in Biology:");
        float e = sc.nextFloat();
        float Percentage = (a+b+c+d+e)/TotalMarks;
        System.out.println("The percentage obtained by student is :" +Percentage*100);


    }
}
