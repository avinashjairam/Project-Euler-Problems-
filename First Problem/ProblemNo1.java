/************************
Multiples of 3 and 5
Problem 1
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

My Approach:

I made two generic functions which can find the sum of all the multiples of any 2 numbers, within any limit.

The 'findSum' function takes 3 parameters, the two numbers and the limit
It then finds the lower of the two numbers and passes this number along with the two other numbers and the limit
to 'helperFunction'

'helperFunction' uses the lower of the two numbers to calculate the sum recursively. 


**************************/


public class ProblemNo1 {  
	
	public static void main(String [] args){
		System.out.println(findSum(3,5,1000));		
	}
	
    	
	public static int findSum(int a, int b, int limit){
		return helperFunction(a,b,Math.min(a,b),limit);		
	}
	
	public static int helperFunction(int a, int b, int startingValue, int limit){
	
		//base case
		if(startingValue>=limit){			
			return 0;
		}
		//working towards the base case
		else if(startingValue%a==0 || startingValue%b==0){			
			return startingValue + helperFunction(a,b, startingValue+1,limit);
		}
		//Recursive call
		else{		
			 return helperFunction(a,b,startingValue+1,limit);
		}
	}
	
}
