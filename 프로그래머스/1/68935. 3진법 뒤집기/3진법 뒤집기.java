public class Solution {
    public int solution(int n) {
        int answer = 0;
        String th = "";

       
        while (n > 0) {
            th += n % 3;
            n = n / 3;
        }

       
        StringBuilder sb = new StringBuilder(th);
        
      
        answer = Integer.parseInt(th, 3);

        return answer;
    }
}
