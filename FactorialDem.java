package Loop;

public class FactorialDem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int n = 0;
	        int mult = 1;

	        if (n!=0) {
	            for (int i = n; i >= 1; i--) {
	                mult = mult * i;
	            }
	        }
	        else if(n==0)
	            mult = 1;

	        System.out.println("factorial="+mult);
	    }
	}

	


