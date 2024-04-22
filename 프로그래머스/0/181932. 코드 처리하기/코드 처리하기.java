class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        boolean mode = true;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = !mode;
            } else {
                if (mode == (i % 2 == 0)) {
                    sb.append(c);
                }
            }
        }
        String answer = sb.length() == 0 ? "EMPTY" : sb.toString();
        return answer;
    }
}