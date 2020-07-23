package practice;

public class NumberValidator {

    boolean checkNumber(int[] number){
        for(int i = 0; i < number.length; i++){
            if(number[i] < 0){
                return false;
            }
        }
        return true;
    }
}
