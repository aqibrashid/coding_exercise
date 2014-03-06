/*

Problem Statement
You decide to earn some extra bucks by working part time in shoe shop. The shop receives a shipment of N left shoes and N right shoes. However, these shoes are of different colours. A left and a right shoes make a pair if and only if they are of same colour. You have been assigned the task of finding the minimum number of shoes to be replaced so as to have N pairs of shoes to sell. You being a computer science student at IIT Delhi decide to write a program for the same and save yourself some time to party.

Input Format
First line contains the number of test cases T. For every test case there will be exactly two lines of N space separated integers. The first line contains colours of left shoes and second contains that of right shoes.

Output Format
For each test case, output one line containing the answer.

Constraints
0 < T <= 50
0 < N <= 50
0 < Each integer in the input <= 1000 

*/



import java.io.BufferedReader;
import java.io.InputStreamReader;


class PartTime{
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
          */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int cases = Integer.parseInt(line);
        for (int i = 0; i < cases; i++) {
        	 String[] left_shoes=(br.readLine()).split(" ");
        	 String[] right_shoes=(br.readLine()).split(" ");
        	 int l1=left_shoes.length;
        	 int l2=right_shoes.length;
        	 if(l1!=l2)return;
        	 
        	 //on match mark  by X
        	 for(int j=0;j<l1;j++){
        	      for(int k=0;k<l1;k++){ 
        	         if(left_shoes[j].equals(right_shoes[k])){
        	          left_shoes[j]="x";
        	          right_shoes[k]="x";
        	          break;
        	         }
        	      }
        	 }
        	 //elements of array not marked by X counts to number of shoes you have replace at minimum
        	 int output=0; 
        	for(int j=0;j<l1;j++){
        	  if(!left_shoes[j].equals("x"))
        	  output++;
        	
        	}
        	System.out.println(output);
   
        }//end of for loop
        

        
    }//end of main method 
}//end of PartTime class

