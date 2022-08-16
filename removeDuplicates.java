/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int removeDuplicates(int [] nums){
        
        int n= nums.length;
        if(n==0|| n==1) 
            return n;
            //two pointers right and left ;
            // left keeps the track of unique elements;
            //right iterate throughout the array
       int left=1, right=1, ans=1, c=nums[0];
        while(right<n)
        {
            if(c==nums[right])
                right++;
            else
            {
                c=nums[right];
                nums[left++]=nums[right++];
                ans++;
            }
        }
        return ans;
    }

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[]= new int [n];
	    
	    for(int i=0; i<n; i++){// talking input from the User
	        arr[i] = sc.nextInt();
	    }
	    // printing the Output
	    System.out.print(removeDuplicates(arr)); 
	    
	    // Time- Complexcity - O(N);
	    // Space - Complexcity - O(1);
	}
}
