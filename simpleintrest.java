import java .util.Scanner;
public class simpleintrest{
	 public static void main(String [] args) {
		 
		 Scanner s = new Scanner(System.in);
		
		 //FOR STRING OR CHAR INPUT ( String str = s.next();System.out.println(str);)
	int m = s.nextInt();
	int n = s.nextInt();
    int o = s.nextInt();
	int k = m+n+o ; 
	
	System.out.println(k);
	int p = s.nextInt();
	int r = s.nextInt();
    int t = s.nextInt();
	int si = p*t*r/100 ;
	

	
	System.out.println(si);
	 }
	 
	 
}

 