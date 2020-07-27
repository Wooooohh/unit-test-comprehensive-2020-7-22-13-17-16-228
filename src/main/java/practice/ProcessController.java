package practice;

public class ProcessController {

    public int isExit(String result, int times) {
        if (times > 0 && times < 6) {
            if (result.equals("4A0B"))
                return 0;
        }
        if(times == 6)
            return 1;
        return -1;
    }

}
