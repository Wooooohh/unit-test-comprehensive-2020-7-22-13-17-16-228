package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberValidatorTest {

    @Test
    public void should_return_false_when_check_number_given_1_f1_2_13(){
//        given
        NumberValidator numberValidator = new NumberValidator();
        int[] number = {1,-1,2,9};
//        when
        boolean result = numberValidator.checkNumber(number);
//        then
        assertEquals(false, result);
    }
}
