package practice;

public class GuessNumberGame {

    AnswerGenerator answerGenerator;

    NumberValidator numberValidator;

    ProcessController processController;

    final int TOTAL_TIMES = 6;

    GuessNumberGame(AnswerGenerator answerGenerator){
        this.answerGenerator = answerGenerator;
        numberValidator = new NumberValidator();
        processController = new ProcessController();
    }

    public String playGame(int[][] numbers){
        StringBuilder result = new StringBuilder();
        int[] answer = answerGenerator.generateAnswer();
        int times=1;
        for(int[] number : numbers) {
            if(!numberValidator.checkNumber(number)) {
                if(times == TOTAL_TIMES)
                    result.append("Wrong Input，Input again");
                else
                    result.append("Wrong Input，Input again\n");
            } else{
                String xAxB = generateResult(number, answer);
                int statusCode = processController.isExit(generateResult(number, answer), times++);
                if(statusCode == Status.WIN.getCode()){
                    result.append(xAxB);
                    break;
                }else if(statusCode == Status.RUN_OUT.getCode()){
                    result.append(xAxB);
                    break;
                }else if(statusCode == Status.CONTINUE.getCode()){
                    result.append(xAxB + "\n");
                }
            }
        }
        return result.toString();
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
