package practice;

public class GuessNumberGame {

    AnswerGenerator answerGenerator;

    NumberValidator numberValidator;

    GuessNumberGame(AnswerGenerator answerGenerator){
        this.answerGenerator = answerGenerator;
        numberValidator = new NumberValidator();
    }

    public String generateResult(int[] number, int[] answer) {
        numberValidator.checkNumber(number);
        numberValidator.checkNumber(answer);
        int A = 0;
        int B = 0;
        int[] cache = new int[10];
        for (int i = 0; i < 4; i++) {
            cache[answer[i]] = 1;
        }
        for (int i = 0; i < 4; i++) {
            if (number[i] == answer[i])
                A++;
            else if(cache[number[i]] == 1 )
                B++;
        }
        return A + "A" + B + "B";
    }

    public int[] generateAnswer(){
        return answerGenerator.generateAnswer();
    }

}
