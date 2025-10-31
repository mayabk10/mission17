import java.util.Scanner;

public class Casino{
    public void gamble(MoneyManager moneyManager){
        System.out.println("על כמה אתה רוצה להמר");
        Scanner scanner = new Scanner(System.in);
        int ganble = scanner.nextInt();
        if(moneyManager.getTotalMoney()>= ganble){
            moneyManager.withdrawMoney(ganble);
        }
        else {
            System.out.println("אין מספיק כסף");
        }
    }
}
