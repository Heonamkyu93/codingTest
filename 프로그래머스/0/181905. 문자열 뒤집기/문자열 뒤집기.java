class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        String re = new StringBuilder(my_string.substring(s, e + 1)).reverse().toString();
        return sb.replace(s, e + 1, re).toString();
    }
}
