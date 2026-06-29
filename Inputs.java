import java.util.Scanner;

public class ExerciseB {
public static void main(String[]args){

// HOW TO USE USER INPUTS

Scanner scanner = new Scanner(System.in);

System.out.print("Enter your name :");
String name = scanner.nextLine();

System.out.print("Enter your age :");
int age = scanner.nextInt();

System.out.print("What is your gpa :");
double gpa = scanner.nextDouble();

System.out.print("Are you a student? (true/false): ");
boolean isStudent = scanner.nextBoolean();

System.out.println("Hello " + name);
System.out.println("You are " + age + " years old");
System.out.println("Your gpa is: "+gpa);
System.out.println("You are enrolled");


scanner.close();
}   
}