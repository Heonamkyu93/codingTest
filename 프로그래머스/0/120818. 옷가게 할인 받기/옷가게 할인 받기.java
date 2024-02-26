class Solution {
    public int solution(int price) {
        double answer = price;
        if(100000<=price && price<300000) answer=(double)price*0.95;
        if(300000<=price && price<500000) answer=(double)price*0.9;
        if(500000<=price) answer=(double)price*0.8;
        
        
        
        return (int)answer;
    }
}