import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class BankRobbery {

    public void executeRobbery(){
        System.out.println("אתה רוצה לבצע שוד");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(Objects.equals(input, "כן")){
            Random random = new Random();
            int number = random.nextInt(0,100);
            if(number<=80){
                System.out.println("השוד הצליח");
                MoneyManager.getInstance().addMoney(10000);
                System.out.println("כמות הכסף של היא : " + MoneyManager.getInstance().getTotalMoney());

            }
            else {
                System.out.println("השוד נכשל");
                MoneyManager.getInstance().withdrawMoney(5000);
                System.out.println("כמות הכסף של היא : " + MoneyManager.getInstance().getTotalMoney());
            }
        }
        else{
            System.out.println("בחרת לא לבצע שוד");
        }
    }

}
