
public class Datatype {
	public static void main(String[] args)
	{char c = 'a' ;
	
	System.out.println(c
			+3);
	 int i= c + 10;	
	 System.out.println(i);
	long l = i ;
	System.out.println(l);
	i = (int) l;
	// here we forced to print l into i  that is why it is not showing any error
	// but if we took a very long number then it will only copy some data
	float f = 1.4f;

	
	// (1.23f)--->  treat float not double  
	System.out.println(f);
	int k = 'c';
	System.out.println(k);
	
	
	
	}
	
}
