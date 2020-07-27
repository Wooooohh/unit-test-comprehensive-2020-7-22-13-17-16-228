package practice;

public class ProcessController {

    public int isExit(String result, int times) {
        if (times > 0 && times < 6)
            if (result.equals("4A0B"))
                return 0;
        return -1;
    }

}
