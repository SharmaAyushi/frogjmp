package codility.timecomplexity.frogjmp;

public class Solution {
	
	int solution(int X, int Y, int D) {
	    int distance = Y-X;
	    
	    if(distance == 0){
	    	return 0;
	    }
	    return (distance%D == 0) ? (distance/D) : ((distance/D)+1);
	}
}
