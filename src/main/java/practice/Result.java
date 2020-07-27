package practice;

public class Result {
    int numA;
    int numB;
    Result(int numA, int numB){
        this.numA = numA;
        this.numB = numB;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public void addA(){
        numA++;
    }

    public void addB(){
        numB++;
    }

    public String formatResult() {
        return numA + "A" + numB + "B";
    }
}
