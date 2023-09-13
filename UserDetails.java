//User details enter by end user

import java.util.Scanner;

public class UserDetails{
public static void main(String []args){
Scanner reader = new Scanner(System.in);
System.out.println("Enter your name: ");
String name=reader.nextLine();
System.out.println("Enter your age: ");
int age=reader.nextInt();
System.out.println("Enter your gender: ");
char gen=reader.next().charAt(0);
System.out.println("Enter your mobile number: ");
long mobNum=reader.nextLong();
System.out.println("Enter your height: ");
float hgt=reader.nextFloat();
System.out.println("Enter Product cost: ");
double prdtCst=reader.nextDouble();
System.out.println("-------------------------");
System.out.println("User name is: "+name+"\nAge is: "+age+"\nGender is: "+gen+"\nMobile number is: "+mobNum+"\nUser Height is: "+hgt+"\nUser bought product cost is: "+prdtCst);
}
}