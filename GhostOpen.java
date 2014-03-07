/*
PandeyG, a brilliant tennis player, decided to start a tournament in his colony. Now, since PandeyG is overly optimistic and ambitious - he tries to lure in as many people as he can from his colony for them to participate in his very own knockout type tennis tournament. What he fails to realize that, to have a knockout tournament, you need to have number of players, in the form of 2^a, where a is any number - what it simply means is that, if there are only 7 people to take part in the tournament, a knockout version cannot be held.

Because: 1 vs. 2 | 3 vs. 4 | 5 vs. 6 | 7 vs. ? |
So, he comes with a brilliant algorithm of adding ghost opponent, to make his tournament more popular. So, for every player who is short of an opponent, he will face a ghost - matches between the ghosts, and matches between ghosts and players are not counted, of course. So, basically, the player who gets the ghost opponent gets a free bye to the next round, i.e., he qualifies for the next round, without even facing an opponent. If there are no players, there will obviously be no matches.

So, given the number of players willing to take part, can you help PandeyG figure out the number of matches he will have to make arrangements for?

Input Format: On the first line, the number of test cases are given, then following every line, the number of players who want to participate n is given.

Output Format: For every n, output the number of matches which will be played for the tournament to be held, by our PandeyG.

Constraints:

    t <=10

    0<=n<=10^9
*/




import java.io.BufferedReader;
import java.io.InputStreamReader;


class  GhostOpen{
	
	//this method will calculate numbers of matches between different numbers of  players 
	public static int calculate_matches(int players){
	  
	  //for even numbers  of players
	  if(players%2!=0){
		
		  //Now there can be two types of even numbers
		  
		  // 1: even numbers of the form 2^a e.g 8,16,32 etc
			 if(Math.log(players)%Math.log(2)==0)
                {   
                 	 return (int)(Math.pow(2,(int)(Math.log(players)/Math.log(2)))-1);
                }
			
			//2:even numbers not in the   form 2^a e.g 10,20,6 etc
	        //return players-1; outside if
	  }
	  else{//for odd number of players
		 
		 //if on adding 1 to the odd number if odd numbers becomes of the form 2^a do this
		   	 if(Math.log(players+1)%Math.log(2)==0)
                {   
                	 return (int)(Math.pow(2,(int)(Math.log(players+1)/Math.log(2)))-1);
                }
                
           //if on adding 1 to the odd number if odd numbers DOES NOT becomes of the form 2^a do this
	       //return players-1; outside if
		    
	  }
	  //if on adding 1 to the odd number if odd numbers DOES NOT becomes of the form 2^a do this
	  return players-1;
		
   }//calculatee method ends here
	
	
	
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int test_cases = Integer.parseInt(line);//enter the test cases
        line=null;//no need for this now
        //int[] results=new int[test_cases];//array that will hold the result of all test cases
        
        for(int i=0;i<test_cases;i++)
           System.out.println( calculate_matches(Integer.parseInt(br.readLine()))); //calculates numbers of    
        	                                                             //matches for each different
        	                                                              // number of player
      
    }
}
