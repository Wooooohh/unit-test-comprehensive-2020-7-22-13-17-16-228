package practice;

public class NumberValidator {

    boolean checkNumber(int[] number){
        return isLengthInBorder(number) && isValueInRange(number) && isDuplicate(number);
    }

    public boolean isLengthInBorder(int[] number){
        if(number.length != 4)
            return false;
        return true;
    }

    public boolean isValueInRange(int[] number){
        for(int i = 0; i < 4; i++){
            if(number[i] < 0 || number[i] > 9){
                return false;
            }
        }
        return true;
    }

    public boolean isDuplicate(int[] number){
        int[] AppearArr = new int[10];
        for(int i = 0; i < 4; i++){
            if(AppearArr[number[i]] !=1)
                AppearArr[number[i]] = 1;
            else
                return false;
        }
        return true;
    }
}
