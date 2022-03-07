package level01;

public class test07 {
//	public static int[] numbers = {1,2,3,4,6,7,8,0};
	public static int[] numbers = {5,8,4,0,6,7,9,105}; // -=> 39
	public static int n = 99;
	
	public static void main(String[] args) {
		int tmp = solution(numbers, n);
		System.err.println(tmp);
	}
	
	public static int solution(int[] numbers, int n) {
        int answer = (numbers.length != 0) ? 0 : -1;
        if(numbers.length != 0) {
        	for(int i = 0; i < n; i++) {
        		answer += i; 
        	}
        }
        
        for (int i : numbers) {
        	if(i > n) {
        		continue;
        	}
        	
        	answer -= i;
		}
        
        return answer;
    }
}
