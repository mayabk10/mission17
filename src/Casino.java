import java.util.Random;
import java.util.Scanner;

public class Casino{
    public void gamble(MoneyManager moneyManager){
        System.out.println("על כמה אתה רוצה להמר");
        Scanner scanner = new Scanner(System.in);
        int gamble = scanner.nextInt();
        if(moneyManager.getTotalMoney()>= gamble){
            moneyManager.withdrawMoney(gamble);
            Random random = new Random();
            int number = random.nextInt(100);
            if(number<65){
                System.out.println("ההימור הצליח");
                MoneyManager.getInstance().addMoney(gamble*2);
                System.out.println("כמות הכסף של היא : " + MoneyManager.getInstance().getTotalMoney());
            }
            else{
                System.out.println("ההימור נכשל , הפסדת");
                System.out.println("כמות הכסף של היא : " + MoneyManager.getInstance().getTotalMoney());
            }

        }
        else {
            System.out.println("אין מספיק כסף");
            System.out.println("כמות הכסף של היא : " + MoneyManager.getInstance().getTotalMoney());
        }
    }
}
