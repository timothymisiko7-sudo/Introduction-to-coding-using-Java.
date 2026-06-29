import java.util.Scanner;

public class ExerciseC {
  
    public static void main(String[]args){

 //THIS A CALCULATOR


double width = 0;
double length = 0;
double area = 0 ;

Scanner scanner = new Scanner(System.in);

System.out.print("Enter length :");
length = scanner.nextDouble();

System.out.print("Enter width :");
width = scanner.nextDouble();

area =length*width;

System.out.println("The area is :" + area + "cm^2");

scanner.close();

    }

}
