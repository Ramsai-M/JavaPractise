//Program to make addition of two numbers
import java.util.Scanner;	

public class AddNum{
public static void main(String[] args){
Scanner reader=new Scanner(System.in);
System.out.println("Enter First Number: ");
int num1=reader.nextInt();
System.out.println("Enter Second Number: ");
int num2=reader.nextInt();
int add=num1+num2;
System.out.println("Addition of two numbers: "+add);
}
}