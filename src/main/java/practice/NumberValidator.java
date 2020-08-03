package practice;

public class NumberValidator {

    boolean checkNumber(int[] number){
        return isLengthInBorder(number) && isValuesInRange(number) && isValueDuplicate(number);
    }

    public boolean isLengthInBorder(int[] number){
        if(number.length != 4)
            return false;
        return true;
    }

    public boolean isValuesInRange(int[] number){
        for(int i = 0; i < 4; i++){
            if(!isValueInRange(number[i])){
                return false;
            }
        }
        return true;
    }

    private boolean isValueInRange(int value) {
        return value >= 0 && value < 10;
    }

    public boolean isValueDuplicate(int[] number){
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
