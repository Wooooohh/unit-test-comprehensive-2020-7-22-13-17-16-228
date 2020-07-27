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

//    public String playGame(int[][] number){
//        StringBuilder stringBuilder = new StringBuilder();
//        int[] answer = answerGenerator.generateAnswer();
//        for(int i = 0; i < times-1; i++) {
//            if(!numberValidator.checkNumber(number[i]))
//                stringBuilder.append("Wrong Input，Input again\n");
//            if (processController.isExit(generateResult(number[i], answer), i) == 0) {
//                stringBuilder.append("4A0B");
//                return stringBuilder.toString();
//            }
//            String result = generateResult(number[i], answer);
//            if(result.equals("4A0B")){
//                stringBuilder.append(result);
//                return stringBuilder.toString();
//            }
//            stringBuilder.append(result+"\n");
//
//        }
//        if(!numberValidator.checkNumber(number[times-1]))
//            stringBuilder.append("Wrong Input，Input again");
//        else
//            stringBuilder.append(generateResult(number[times-1], answer));
//        return stringBuilder.toString();
//    }
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
                int status = processController.isExit(generateResult(number, answer), times++);
                if(status == 0){
                    result.append(xAxB);
                    break;
                }else if(status == 1){
                    result.append(xAxB);
                    break;
                }else if(status ==2){
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
