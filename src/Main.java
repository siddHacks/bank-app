public class Main {
    public static void main(String[] args) {
       HDFCAccount siddAcc = new HDFCAccount("Sidd","sidd123",3000);
       System.out.println(siddAcc);
       //fetch balance
        System.out.println(siddAcc.fetchBalance("sidd123"));
        //add money
        System.out.println(siddAcc.addMoney(5000));
        //withdraw
        System.out.println(siddAcc.withdrawMoney(2156,"sidd23"));
        System.out.println(siddAcc.withdrawMoney(2156,"sidd123"));
        //change password
        System.out.println(siddAcc.changePassword("sidd123","sid1234"));
        System.out.println(siddAcc.fetchBalance("sid1234"));
        //calculate intrest
        System.out.println(siddAcc.calculateInterest(10));
    }
}