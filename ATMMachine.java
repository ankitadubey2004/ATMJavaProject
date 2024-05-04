import java.util.*;

class ATM {
    float Balance;
    int PIN = 5674;

    public void checkpin() {
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
        }
    }

    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();


        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            withdrawMoney();
        }
        else if(opt == 3 ){
            depositMoney();
        }
        else if(opt == 4){
            break;
        }
        else{
            System.out.println('Enter a valid choice');
        }
    }
}