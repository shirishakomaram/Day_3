package demo;

import java.util.Scanner;

public class Demo_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number :");
int a=sc.nextInt();
for(int i=1;i<=a;i++) {
	if(i%2==0)
		System.out.print(i+ " ");
}
	}

}
