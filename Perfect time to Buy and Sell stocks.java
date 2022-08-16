/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
     public static int maxProfit(int[] prices) {

        int minValue = Integer.MAX_VALUE;
        int maxProfit= 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<minValue){
                minValue= prices[i];
            }
            else if(prices[i]-minValue>maxProfit){
                maxProfit =  prices[i]-minValue;
            }
        }
        return maxProfit;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[]= new int [n];
	    
	    for(int i=0; i<n; i++){// talking input from the User
	        arr[i] = sc.nextInt();
	    }
	    // printing the Output
	    System.out.print(maxProfit(arr)); 
	    
	    // Time- Complexcity - O(N);
	    // Space - Complexcity - O(1);
	}
}
