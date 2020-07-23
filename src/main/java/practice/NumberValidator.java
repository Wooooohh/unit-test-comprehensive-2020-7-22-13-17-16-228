package practice;

public class NumberValidator {

    boolean checkNumber(int[] number){
        if(number.length < 4)
            return false;
        for(int i = 0; i < number.length; i++){
            if(number[i] < 0 || number[i] > 9){
                return false;
            }
        }
        return true;
    }
}
