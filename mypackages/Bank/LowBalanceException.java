package Bank;

public class LowBalanceException extends Exception{
    public LowBalanceException(String msg) {
        super(msg);
    }
}
