package rdimplementationmethod;
import java.io.File;
/**
 * 
 * @author Ryan Deleon
 * @version 8/30/2022
 *
 */

public class rdimplementationmain {
		
	    /* this method returns the n as the fibonacci sequence variable. */
		
		/**
		 *
		 * @param n
		 * n is a variable or number entered by the user
		 * @return n
		 * public static int used as n
		 */
	
	    public static int rdfibonaccisequence(int n)
	    
	    {
	    	
	    /* if n is 1 or less then return n */
	    	
	    if (n <= 1)
	    	
	       return n;
	    
	    /* calls the function fibonacci as recursive method() */
	    
	    return rdfibonaccisequence(n-1) + rdfibonaccisequence(n-2);
	    
	    }
	    
	    /**
	     * @param args
    	 * public static void main as String.
    	 */
	    
	    	public static void main (String args[]) {
	    	
	     
	    /* Variable integer used is n */
	    	
	    int n;
	    
	    /* Creates class as Scanner, which is typically used for values. */
	    
	    Scanner javautilscan = new Scanner (System.in);
	    
	    /* Retrieves value of n from the user input. */
	    
	    System.out.println("Enter the variable of n: ");
	    
	    n = javautilscan.nextInt();
	    
	    /* print n-th number term in its sequence, which displays the final 
	     * output information towards its user. */
	    
	    System.out.println("The "+n+"th term used for the Fibonacci sequence is "+rdfibonaccisequence(n));
	    
	    }
	}
