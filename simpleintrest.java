import java.util.Scanner;
public class simpleintrest {
	 public static void main(String[] args) 
	 {
		 
		 Scanner s = new Scanner(System.in);
		  int p = s.nextInt();
			int r= s.nextInt();
			int t =s.nextInt();
			
			int si = p*r*t/100;
			
			System.out.println(si);
			
		double d = s.nextDouble();
				float f =s.nextFloat();
				
				double y = d+f;
				System.out.println(y);
		 
	 }
	 

}