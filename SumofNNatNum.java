//Calculate the sum of N natural numbers

public class SumofNNatNum{
public static void main(String[] args){
Scanner reader =new Scanner(System.in);
int n=1;
int sum=0;
System.out.println("Enter last number for to calculate the of N Natural numbers: ");
int N=reader.nextInt();
for(int i=n;i<=N;i++){
sum+=i;
}
System.out.println("Sum of "+N+" natural numbers is: "+sum);
}
}