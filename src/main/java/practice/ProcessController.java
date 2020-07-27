package practice;

import static practice.ConstantPool.WIN_RESULT;

public class ProcessController {

    public int isExit(String result, int times) {
        if (times > 0 && times < 6) {
            if (result.equals(WIN_RESULT))
                return Status.WIN.getCode();
        }
        if(times == 6)
            return Status.RUN_OUT.getCode();
        return Status.CONTINUE.getCode();
    }

}
