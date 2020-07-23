package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberValidatorTest {

    @Test
    public void should_return_false_when_check_number_given_1_f1_2_9(){
//        given
        NumberValidator numberValidator = new NumberValidator();
        int[] number = {1,-1,2,9};
//        when
        boolean result = numberValidator.checkNumber(number);
//        then
        assertEquals(false, result);
    }

    @Test
    public void should_return_false_when_check_number_given_1_3_2_11(){
//        given
        NumberValidator numberValidator = new NumberValidator();
        int[] number = {1,3,2,11};
//        when
        boolean result = numberValidator.checkNumber(number);
//        then
        assertEquals(false, result);
    }

    @Test
    public void should_return_false_when_check_number_given_1_3_2(){
//        given
        NumberValidator numberValidator = new NumberValidator();
        int[] number = {1,3,2};
//        when
        boolean result = numberValidator.checkNumber(number);
//        then
        assertEquals(false, result);
    }

    @Test
    public void should_return_false_when_check_number_given_1_3_2_4_5(){
//        given
        NumberValidator numberValidator = new NumberValidator();
        int[] number = {1,3,2,4,5};
//        when
        boolean result = numberValidator.checkNumber(number);
//        then
        assertEquals(false, result);
    }

    @Test
    public void should_return_true_when_check_number_given_1_3_2_4(){
//        given
        NumberValidator numberValidator = new NumberValidator();
        int[] number = {1,3,2,4};
//        when
        boolean result = numberValidator.checkNumber(number);
//        then
        assertEquals(true, result);
    }
}
