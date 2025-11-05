import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int activityCounter;

    public static void main(String[] args) {

        Casino casino = new Casino();
        BankRobbery bankRobbery = new BankRobbery();
        StreetRacing streetRacing = new StreetRacing();
        MoneyManager.getInstance().addMoney(15000);
        boolean isPlayerNeedMoreMoney = true;

        while (isPlayerNeedMoreMoney){
            if(MoneyManager.getInstance().getTotalMoney()>=100000){
                isPlayerNeedMoreMoney = false;
                System.out.println("מזל טוב הגעת ליעד");
                System.out.println("ביצעת " + activityCounter + " פעילויות");
            }
            else{
                System.out.println("עליך לבחור פעילות: 1 שוד, 2 קזינו , 3 מרוץ רחוב");
                Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                if(number==1){
                    bankRobbery.executeRobbery();
                    activityCounter++;
                }
                else if(number==2){
                    casino.gamble(MoneyManager.getInstance());
                    activityCounter++;
                }
                else if(number==3){
                    streetRacing.participateInRace();
                    activityCounter++;
                }
                else{
                    System.out.println("אופציה לא קיימת נא לנסות שוב");
                }
            }
        }

    }
}