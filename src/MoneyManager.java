public class MoneyManager {
    private static MoneyManager instance;
    private int totalMoney=0;
    private MoneyManager(){}

    public static MoneyManager getInstance(){
        if(instance==null){
            instance = new MoneyManager();
            return instance;
        }
        else{
            return instance;
        }
    }

    public void addMoney(int money){
        totalMoney += money;
    }

    public int withdrawMoney(int money){
        if(totalMoney>=money){
            return (totalMoney-money);
        }
        else{
            return 0;
        }
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }
}
