package demo;
import java.util.*;
public class Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Number :");
int a=sc.nextInt();
for(int i=0;i<=a;i++) {
	System.out.println("Enter two numbers :");
	System.out.println("Enter 1st number :");
	int b =sc.nextInt();
	System.out.println("Enter 2nd number");
	int c=sc.nextInt();
	if(i%2==0)
		System.out.println("sum = "+ (a+b));
	else
		System.out.println("multiple = "+ (a*b));
}
	}

}
