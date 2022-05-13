package pass;

import java.util.Scanner;

public class Time_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter timing :");
int time=sc.nextInt();

if(time<12) {
	System.out.println("good morning.");
}
else if(time<=16) {
	System.out.println("good afternoon.");
}
else if(time<=20) {
	System.out.println("good evening.");
}
else {
	System.out.println("good night.");
}
	}

}
