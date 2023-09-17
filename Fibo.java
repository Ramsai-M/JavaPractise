//Fibonacci series

import java.util.Scanner;

public class Fibo{
public static void main(String[] args){
Scanner reader=new Scanner(System.in);
System.out.println("Enter a first number to calculate the fibonacci series: ");
int first=reader.nextInt();
System.out.println("Enter a second number to calculate the fibonacci serirs: ");
int second=reader.nextInt();
System.out.println("Enter maximum number to calculate for fibonacci series: ");
int N=reader.nextInt();
int sum=0;
System.out.print(first+" "+second);
for(int i=0;i<=N;i++){
sum=first+second;
System.out.print(" "+sum);
first=second;
second=sum;
}
}
}