package Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int balance = 100;

        System.out.println("Enter amount to withdrawal");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        try{
            if(amount > balance){
                throw new LowBalanceException("msg");
            }
            else{
                System.out.println("u can take ur cash");
                balance = balance - amount;
                System.out.println("Now ur balance is : " + balance);
            }
        }

        catch(LowBalanceException msg){
            System.out.println("u cant withdrawal bcoz: " + msg);
        }
    }
}
