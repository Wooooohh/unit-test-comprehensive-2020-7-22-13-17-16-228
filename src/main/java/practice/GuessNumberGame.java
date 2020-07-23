package practice;

public class GuessNumberGame {

    AnswerGenerator answerGenerator;

    NumberValidator numberValidator;

    ProcessController processController;

    int times = 6;

    GuessNumberGame(AnswerGenerator answerGenerator){
        this.answerGenerator = answerGenerator;
        numberValidator = new NumberValidator();
        processController = new ProcessController();
    }

    public String playGame(int[][] number){
        StringBuilder stringBuilder = new StringBuilder();
        int[] answer = new FixedAnswerGenerator().generateAnswer();
//        numberValidator.checkNumber(number);
        numberValidator.checkNumber(answer);
        for(int i = 0; i < times-1; i++) {

//            if(!numberValidator.checkNumber(number[i]))
//                stringBuilder.append("Wrong Input，Input again");
//            if (processController.isExit(generateResult(number[times], answer), times))
//                return stringBuilder.toString();
            stringBuilder.append(generateResult(number[i], answer)+"\n");
        }
        stringBuilder.append(generateResult(number[5], answer));
        return stringBuilder.toString();
    }


    public String generateResult(int[] number, int[] answer) {
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
