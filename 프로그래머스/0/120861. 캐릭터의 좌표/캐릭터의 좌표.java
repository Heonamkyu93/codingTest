class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int maxX = (board[0] - 1) / 2; 
        int maxY = (board[1] - 1) / 2; 

        for (String direction : keyinput) {
            switch (direction) {
                case "up":
                    if (answer[1] < maxY) answer[1] += 1;
                    break;
                case "down":
                    if (answer[1] > -maxY) answer[1] -= 1;
                    break;
                case "left":
                    if (answer[0] > -maxX) answer[0] -= 1;
                    break;
                case "right":
                    if (answer[0] < maxX) answer[0] += 1;
                    break;
            }
        }

        return answer;
    }
}
