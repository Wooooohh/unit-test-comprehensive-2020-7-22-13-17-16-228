package practice;

public class GuessNumberGame {
    public String generateResult(int[] number, int[] answer) {
        for(int i = 0; i <4; i++){
            if(number[i] != answer[i])
                return null;
        }
        return "4A0B";
    }
}
