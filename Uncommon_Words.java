/* Enter two strings and print the uncommon characters
      
*/

/**
 * @author Gautam Goyal
 * 
 * Email: gautamgoyal24012001@gmail.com
 * 
 * Date: 13-09-2021
 * 
 * Version: 1.1
 * 
 */

// import java.util.ArrayList;  // for array-list only

import java.util.Scanner;

public class Uncommon_Words {
	
	public static int count = 1; // can be used anywhere
	
	public static void main(String[] args) {
				
        System.out.println("\n\n\n\t\t\tX<<<<<<<<<<<< Find Uncommon Words >>>>>>>>>>>>");
	    
		// Variables
				
		String str1, str2;
				
		// SCANNER
		
		Scanner sc = new Scanner(System.in);      // Using Scanner for user inputs

	    System.out.print("\nEnter First sentence: "); // Asking for user input
	       
	    str1 = sc.nextLine();                      // Return User Input
	    
	    String first[] = words(str1); // array
	    
	    System.out.print("\n\nEnter Second sentence: "); // Asking for user input
	       
	    str2 = sc.nextLine();                      // Return User Input

	    String second[] = words(str2); // array
			
        // used methods so need to re-write the code again
	    
        System.out.println("\n\nFirst Sentence: " + str1);
        
        System.out.println("\nSecond Sentence: " + str2);
        
        uncommonWords(first, second);
 
        uncommonWords(second, first);
        
     
       } // void loop end
	
	// Methods	
	
	/**
	 * Method to manually remove space and add words in an array
	 * 
	 * @param str
	 * @return array
	 */
	
	public static String[] words(String str) {
		
        // Variables 
        
		int i,j,k; 
 
	    k = str.length();                         // Length of the sentence
	       
		int p = 0, c = 0, m = 0;
		 
        char letter = 0;      
        
        String q=""; // To add each letter and create a word
        
        String[] word = new String[k]; // new array to store each word, no spaces are stored
        
        
    	for(i = m; i < k; i++) {  // m = 0;
        	
           
        	for(j=m; j < k; j++) { // m = 0;
                
            	 letter = str.charAt(j); // single letter  sentence used from above and the first letter be 'f'
                    
                if(j == k-1) {       // if last element which is in our case 'r'
                
                	m = j + 1;        
                	
                	q = q + str.charAt(j);   // it will add string and make it one word     th + e = the         	
                	
                	break;                // will break the loop 
                }
                
                else if(' '== letter) {           // if space
                   
                		m = j + 1;   // add 1 and goes to the next word
                    	
                		break;
                }
           
                else {            // it will count
                
                	q = q + str.charAt(j);   // t + h = th
                }
            	
            } // inner loop of j ends
        	
        	word[i] = q;  // store values in array 
        	q = "";      // value is none
        	
        } // outter loop of i ends
    	
    	return word;
		
	} // end method
	
	
	/**
	 * method to print uncommon words
	 * 
	 * @param first    array
	 * @param second   array
	 * 
	 * @return nothing because its a void method
	 */
	public static void uncommonWords(String[] first, String[] second) {
		
		// Variables
		
		int i, j; 

		String word;

		boolean match = false;

        for(i = 0; i < first.length; i++) {    	 // array length
        	
        	word = first[i];
         
        	match = true;
        	
        	for (j = 0; j < second.length; j++) {
				
        		if (word.equals(second[j])) {  // if word match break the loop and search for next word
        			match = true;
        			break;       // break the for loop of only j
        		}
        		else {
        			match = false;
        		}
   
			} // for loop of j ends ( inner loop )
        	
        	if(match == false) { // not match print
        		
               System.out.println("\n" + count + ". " + first[i]); // PRINTING every longest string
        		
        		count++;
        	} // else nothing
        	
        } // outter loop ends
		
	} // method loop end

	
}

