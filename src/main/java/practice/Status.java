package practice;

public enum Status {

    CONTINUE(2), RUN_OUT(1), WIN(0);

    private int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
