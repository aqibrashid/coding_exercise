/*
Roy and Alfi reside in two different cities, Roy in city A and Alfi in city B. Roy wishes to meet her in city B.

There are two trains available from city A to city B. Roy is on his way to station A (Railway station of city A). It will take T0 time (in minutes) for Roy to reach station A. The two trains departs in T1 and T2 minutes respectively. Average velocities (in km/hr) of trains are V1 and V2 respectively. We know the distance D (in km) between city A and city B. Roy wants to know the minimum time (in minutes) to reach city B, if he chooses train optimally.

If its not possible to reach city B, print "-1" instead (without quotes).

Note: If the minimum time is not integral, round the value to the least integer greater than minimum time.

Input:

First line will contain integer T, number of test cases.

Second line will contain integers T0, T1, T2, V1, V2, D (their meanings are mentioned in problem statement)

Output:

Print the integral result, minimum time (in minutes) to reach city B in a new line.

Constraints:

1<=T<=10000

1<=T0,T1,T1<=1000

1<=V1,V2<=500

1<=D<=5000

*/



/*
 * uncomment this if you want to read input.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;


class RoyTrain{
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int test_cases = Integer.parseInt(line);
         if (test_cases<1 && test_cases>10000)return;
        int[] test_results=new int[test_cases];
          for (int i = 0; i < test_cases; i++) {
            line=br.readLine();
            int T0=Integer.parseInt((line.split(" "))[0]);
            int T1=Integer.parseInt((line.split(" "))[1]);
            int T2=Integer.parseInt((line.split(" "))[2]);
            int V1=Integer.parseInt((line.split(" "))[3]);
            int V2=Integer.parseInt((line.split(" "))[4]);
            int D = Integer.parseInt((line.split(" "))[5]);
            if(T0<1 || T0>1000 || T1<1 || T1>1000 || T2<1 || T2>1000 || V1<1 || V1>500 || V2<1 || V2 >500 || D<1 || D>5000)return; 
            if(T0>T1 && T0>T2)
            test_results[i]=-1;
            else{
            	
               if(T0>T1 && T0<T2){
               	test_results[i]=(int)Math.ceil( ((double)D/V2)*60 ) +T2;
               }
               else if(T0>T2 && T0<T1){
               	test_results[i]=(int)Math.ceil( ((double)D/V1)*60 ) +T1;
               }
               else{	
                   int t1_A=(int)Math.ceil( ((double)D/V1)*60 ) +T1;
                   int t1_B=(int)Math.ceil( ((double)D/V2)*60 ) +T2;
                   if(t1_A>t1_B)
                       test_results[i]=t1_B;
                   else
                      test_results[i]=t1_A;
               }
            }      
         }//for loop
        
          for(int i=0;i<test_cases;i++)
          System.out.println(test_results[i]);
        
    }
}
