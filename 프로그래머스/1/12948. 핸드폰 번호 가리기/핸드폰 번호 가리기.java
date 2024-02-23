class Solution {
    public String solution(String phone_number) {
        String answer ="";
        int idx =phone_number.length()-4;
        String back = phone_number.substring(idx);
        answer=phone_number.substring(0,idx).replaceAll(".","*")+back;
        return answer;
    }
}