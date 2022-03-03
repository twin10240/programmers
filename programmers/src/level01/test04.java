package level01;

public class test04 {
	public static String[] dic = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	public static String s = "one4seveneight";
	
	public static void main(String[] args) {
		int result = solution(s);
		System.err.println(result);
	}
	
    public static int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i< dic.length; i++) {
			if(s.indexOf(dic[i]) != -1) {
				s = s.replaceAll(dic[i], i + "");
			}
		}
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}