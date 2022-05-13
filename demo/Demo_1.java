package demo;
import java.util.*;

public class Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Even number :");
int a=sc.nextInt();
int b =0;
for(int i=1;i<a;i++) {
	for(int j=1;j<a;j++) {
		if((i+j)%2==0)
		System.out.print(i+" "+j);
		b++;
	}
}
System.out.println(b);
	}

}
