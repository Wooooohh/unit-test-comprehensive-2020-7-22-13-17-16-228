package practice;

public class NumberValidator {

    boolean checkNumber(int[] number){
        int[] cache = new int[10];
        if(number.length != 4)
            return false;
        for(int i = 0; i < 4; i++){
            if(number[i] < 0 || number[i] > 9){
                return false;
            }
        }
        for(int i = 0; i < 4; i++){
            if(cache[number[i]] !=1)
                cache[number[i]] = 1;
            else
                return false;
        }
        return true;
    }
}
