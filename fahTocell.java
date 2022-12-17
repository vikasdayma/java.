import java.util.Scanner;
public class fahTocell {

	public static void main(String[] args ) {
		
		
		Scanner s=new Scanner(System.in);
		
		
		int f= s.nextInt();
		int cel = (5)*(f-32)/9;
		System.out.println(cel);
		
		// or we can do explicit typecasting 
		// for example--
		//int f= s.nextInt();
		//int cel = (double)((5/9)*(f-32));
		//System.out.println(cel);
			System.out.println('A'+1);
			System.out.println('a'+1);
			System.out.println(9.0/5);
			System.out.println(9%5);
			//   (%) remainder operator
			 char c = 'a' ;
			 char i = (char)(c+3) ;
			 System.out.println(i);
			
	}
}
