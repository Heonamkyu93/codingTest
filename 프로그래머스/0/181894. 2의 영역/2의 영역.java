class Solution {
    public int[] solution(int[] arr) {
        
        boolean a=false;
        
        int start =0;
        int end= 0;
        for(int i=0;i<arr.length;i++){
            if(a && arr[i]==2) end=i;
            if(arr[i]==2 && start==0 && a==false) {a=true; start=i;}
            
        }
        if(!a){
            int[] answer = {-1};
            return answer;
        }
        if(end==0){
            int[] answer = {2};
            return answer;
        }
        int[] answer = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            answer[i - start] = arr[i];
        }
        
        
        return answer;
    }
}