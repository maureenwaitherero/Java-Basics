import java.util.*;

public class Function {

	
		  static int adds_n(int num) { 
			int sum=0,i=0;
			
			  for(i=0;i<=num;i++){
				  sum=sum+i;
				  
			  }
			  return sum;
		  }
		  
		  
		public static void main (String[] args) {  
		    // keep this function call here     
		    Scanner  s = new Scanner(System.in);
		    System.out.println("Enter number:");
		    System.out.print(adds_n(s.nextInt())); 
		  }   
		  
		}

	
