import java.util.*;
class Solution {
    public int solution(int[][] dots) {
       
        int lx = dots[0][0];
        int sx = dots[0][0];
        int ly = dots[0][1];
        int sy = dots[0][1];

        for(int i=0;i<dots.length;i++){
            lx=Math.max(lx,dots[i][0]);
            sx=Math.min(sx,dots[i][0]);
            ly=Math.max(ly,dots[i][1]);
            sy=Math.min(sy,dots[i][1]);
            
        }
        return (lx-sx)*(ly-sy);
    }
}