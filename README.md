# Day_3
package unlike;

import java.util.*;

public class Day_3 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter even number :");
		int sc1=sc.nextInt();
		        int y=0;
		for(int i=1;i<sc1;i++) {
			for(int j=1;j<sc1;j++) {
		        if((i+j)%2==0)
				System.out.print(i+" "+j);
		        y++;
			}
		}
		        System.out.println(y);
		    }
		}
