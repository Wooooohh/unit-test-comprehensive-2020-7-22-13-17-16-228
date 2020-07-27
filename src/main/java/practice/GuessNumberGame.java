package practice;

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
        int[] answer = answerGenerator.generateAnswer();
        int times = 1;
        for (int[] number : numbers) {
            if (!numberValidator.checkNumber(number)) {
                if (times == TOTAL_TIMES)
                    result.append(ERROR_INPUT_INFO);
                else
                    result.append(ERROR_INPUT_INFO + "\n");
            } else {
                String xAxB = generateResult(number, answer);
                int statusCode = processController.isExit(generateResult(number, answer), times++);
                if (statusCode == Status.WIN.getCode()) {
                    result.append(xAxB);
                    break;
                } else if (statusCode == Status.RUN_OUT.getCode()) {
                    result.append(xAxB);
                    break;
                } else if (statusCode == Status.CONTINUE.getCode()) {
                    result.append(xAxB + "\n");
                }
            }
        }
        return result.toString();
    }

    public String generateResult(int[] number, int[] answer) {
        Result result = new Result(0, 0);
        int[] appearArr = calculateAppear(answer);

        for (int i = 0; i < 4; i++) {
            if (number[i] == answer[i])
                result.addA();
            else if (appearArr[number[i]] == 1)
                result.addB();
        }
        return result.formatResult();
    }

    public int[] calculateAppear(int[] answer) {
        int[] appearArr = new int[10];
        for (int i = 0; i < 4; i++) {
            appearArr[answer[i]] = 1;
        }
        return appearArr;
    }
}
