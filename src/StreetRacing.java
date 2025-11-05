import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class StreetRacing {
    public void participateInRace(){
        System.out.println("עלות השתתפות היא 3000 דולר האם אתה רוצה להשתתף?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(Objects.equals(input, "כן")){
            if(MoneyManager.getInstance().getTotalMoney()>=3000){
                MoneyManager.getInstance().withdrawMoney(3000);
                Random random = new Random();
                int money = random.nextInt(100);
                if(money<85){
                    MoneyManager.getInstance().addMoney(6000);
                    System.out.println(MoneyManager.getInstance().getTotalMoney());
                }
            }
            else{
                System.out.println("אין לך את הסכום הנדרש");
            }
        }
        else{
            System.out.println("בחרת לא להשתתף במרוץ רחוב");
        }
    }
}
