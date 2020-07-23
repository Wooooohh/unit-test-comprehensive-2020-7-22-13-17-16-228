package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomAnswerGeneratorTest {

    @Test
    public void should_return_legal_number_when_generate_number(){
//        given
        NumberValidator numberValidator = new NumberValidator();
        RandomAnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();
//        when
        int[] result = randomAnswerGenerator.generateAnswer();
//        then
        assertEquals(true, numberValidator.checkNumber(result));
    }

}
