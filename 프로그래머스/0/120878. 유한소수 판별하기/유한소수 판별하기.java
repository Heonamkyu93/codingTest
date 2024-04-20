import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int last = b / fun(a, b);
        
        while( last != 1) {
            if(last % 2 == 0) {
                last /= 2;
            }else if (last % 5 == 0) {
                last /= 5;
            }else {
                return 2;
            }
        }
        
        return 1;
    }
  
     int fun(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return fun(b, a % b);
        }
    }
}