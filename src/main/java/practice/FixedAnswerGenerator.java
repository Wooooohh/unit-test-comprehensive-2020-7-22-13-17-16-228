package practice;

public class FixedAnswerGenerator implements AnswerGenerator{
    @Override
    public int[] generateAnswer() {
        int[] ret = {1,2,3,4};
        return ret;
    }
}
