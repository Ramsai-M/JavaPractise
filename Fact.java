//Factorial of a number

import java.util.Scanner;

public class Fact{
public static void main(String[] args){
Scanner reader=new Scanner(System.in);
int n=1;
int mult=1;
System.out.println("Enter number to perform factorial: ");
int N=reader.nextInt();
for(int i=n;i<=N;i++){
mult*=i;
}
System.out.println("Factorial of "+N+" is: "+mult);
}
}