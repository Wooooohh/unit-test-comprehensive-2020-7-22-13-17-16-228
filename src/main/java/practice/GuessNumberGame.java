package practice;

//import java.util.Arrays;
//import java.util.Scanner;

import static practice.ConstantPool.ERROR_INPUT_INFO;

public class GuessNumberGame {

    AnswerGenerator answerGenerator;

    NumberValidator numberValidator;

    ProcessController processController;

    final int TOTAL_TIMES = 6;

    GuessNumberGame(AnswerGenerator answerGenerator) {
        this.answerGenerator = answerGenerator;
        numberValidator = new NumberValidator();
        processController = new ProcessController();
    }

    public String playGame(int[][] numbers) {
        StringBuilder result = new StringBuilder();
        int[] answer = generateAnswer();
        int times = 1;
        for (int[] number : numbers) {
            if (!numberValidator.checkNumber(number)) {
                appendErrorMessage(result, times);
            } else {
                String xAxB = generateResult(number, answer);
                int statusCode = processController.isExit(generateResult(number, answer), times++);
                if (statusCode == Status.WIN.getCode() || statusCode == Status.RUN_OUT.getCode()) {
                    result.append(xAxB);
                    break;
                } else if (statusCode == Status.CONTINUE.getCode()) {
                    result.append(xAxB + "\n");
                }
            }
        }
        return result.toString();
    }
        // plan 2 code in and out with console
//    public void playGame() {
//        int[] answer = generateAnswer();
//        Scanner scanner = new Scanner(System.in);
//        int times = 1;
//        int[] number;
//        while (scanner.hasNext()) {
//            number = covertIntArray(scanner.nextLine().split(" "));
//            if (!numberValidator.checkNumber(number)) {
//                outErrorMessage(times);
//            } else {
//                String xAxB = generateResult(number, answer);
//                int statusCode = processController.isExit(generateResult(number, answer), times++);
//                if (statusCode == Status.WIN.getCode()) {
//                    System.out.println(xAxB);
//                    break;
//                } else if (statusCode == Status.RUN_OUT.getCode()) {
//                    System.out.println(xAxB);
//                    break;
//                } else if (statusCode == Status.CONTINUE.getCode()) {
//                    System.out.println(xAxB + "\n");
//                }
//            }
//        }
//    }
//
//    private void outErrorMessage(int times) {
//        if (times == TOTAL_TIMES)
//            System.out.println(ERROR_INPUT_INFO);
//        else
//            System.out.println(ERROR_INPUT_INFO + "\n");
//    }
//
//    private int[] covertIntArray(String[] numberStringArr) {
//        int[] number = new int[numberStringArr.length];
//        for( int i =0; i < numberStringArr.length; i++){
//            number[i] = Integer.valueOf(numberStringArr[i]);
//        }
//        return number;
//    }

    private void appendErrorMessage(StringBuilder result, int times) {
        if (times == TOTAL_TIMES)
            result.append(ERROR_INPUT_INFO);
        else
            result.append(ERROR_INPUT_INFO + "\n");
    }

    public int[] generateAnswer(){
        return answerGenerator.generateAnswer();
    }

    public String generateResult(int[] number, int[] answer) {
        return countResult(calculateAppear(answer), number, new Result(0, 0),answer).formatResult();
    }

    private Result countResult(int[] appearArr, int[] number, Result result, int[] answer) {
        for (int i = 0; i < 4; i++) {
            if (number[i] == answer[i])
                result.addA();
            else if (appearArr[number[i]] == 1)
                result.addB();
        }
        return result;
    }

    public int[] calculateAppear(int[] answer) {
        int[] appearArr = new int[10];
        for (int i = 0; i < 4; i++) {
            appearArr[answer[i]] = 1;
        }
        return appearArr;
    }
}
