import java.util.Scanner;

public class ATM {

    public static void main(String[] args){

        int balance = 0, withdraw, deposit;

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("ATM Machine");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit ");
            System.out.println("Choose the operation: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Enter money to be withdrawn: ");

                    withdraw = sc.nextInt();

                    if (balance >= withdraw) {

                        balance = balance - withdraw;
                        System.out.println(" Please collect your money ");

                    } else {

                        System.out.println("Insufficient Balance");
                    }

                case 2:

                    System.out.println("Enter money to be deposited: ");

                    deposit = sc.nextInt();

                    balance = balance + deposit;

                    System.out.println("Your money has been successfully deposited");

                    System.out.println(" ");

                    break;

                case 3:

                    System.out.println("Balance: " + balance);

                    System.out.println("");

                    break;

                case 4:
                    System.exit(0);

            }

        }
    }

}
