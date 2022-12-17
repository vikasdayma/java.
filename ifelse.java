import java.util.Scanner;
public class ifelse { 
public static void main(String[]args)
{Scanner s =new Scanner(System.in);
//int age = s.nextInt();
//if (age>18)    {System.out.println("Adult");
//	
//}                                                                                                                                                                                                                                          
//
//else {System.out.println("Not Adult");}
//int oddeven=s.nextInt();
//if (oddeven%2==0) {
//	System.out.println("EVEN");
//}
//else {
//	System.out.println("Odd");
//}

char c = s.next().charAt(0);
int all;
if (c==65) {		
	all=1700;
} 
else if (c==66) {
all=1500;

}

else {all=1300;
}
int a=s.nextInt();
int total = a+all+a*20/100+a*50/100-a*11/100 ;
System.out.println(total);


}

}