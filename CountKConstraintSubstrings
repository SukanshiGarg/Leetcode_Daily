package Leetcode;

import java.util.Scanner;

public class leetcode3258_CountKConstraintSubstrings {
    public int CountKConstraint(String s, int k){
        int n=s.length();
        int subStringsCount=0;

        for(int i=0;i<n;i++){
            //intialize for every starting point of substrings count as zero 
            int zeroCount=0;
            int oneCount=0;

            for(int j=i;j<n;j++){
                if(s.charAt(j)=='0'){
                    zeroCount++;
                }
                if(s.charAt(j)=='1'){
                    oneCount++;
                }

                //check if the substring satisfies the k constraint conditon using or codition
                if(zeroCount <=k || oneCount<=k){
                    subStringsCount++;
                }
                else{
                    break; 
                    //dont check for that substring any further 
                }

            }
        }
        return subStringsCount;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        leetcode3258_CountKConstraintSubstrings obj = new leetcode3258_CountKConstraintSubstrings();
        String s=sc.nextLine();
        int k=sc.nextInt();
        int ans=obj.CountKConstraint(s,k);
        System.out.println(ans);
    }
    
}
