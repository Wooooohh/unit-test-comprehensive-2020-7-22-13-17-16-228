package practice;

import static practice.ConstantPool.TOTAL_TIMES;
import static practice.ConstantPool.WIN_RESULT;

public class ProcessController {

    public int isExit(String result, int times) {
        if (isTimesInRange(times)) {
            if (result.equals(WIN_RESULT))
                return Status.WIN.getCode();
        }
        if (isTimesOver(times))
            return Status.RUN_OUT.getCode();
        return Status.CONTINUE.getCode();
    }

    private boolean isTimesOver(int times) {
        return times == TOTAL_TIMES;
    }

    private boolean isTimesInRange(int times) {
        return times > 0 && times < TOTAL_TIMES;
    }

}
