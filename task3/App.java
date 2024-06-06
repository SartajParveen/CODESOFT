public class App {
    @SuppressWarnings("static-access")
    public static void main(String[] args) throws Exception {

        MachineFeature mf = new MachineFeature();
        Location l=new Location("India","5330048","AP","vizag","south","asr nagar");
        CurrencyComposition cc = new CurrencyComposition(200, 100, 500, 300, 200);
        ATM a = new ATM("123",l,cc);
        User u = new User("Sartaj",113,"3423545465654",432,500000,12,2050);
        mf.checkUserBalance(u);
        mf.seeComposition(cc);
        mf.createAtm(l, cc);
        cc = new CurrencyComposition(300, 150, 115, 300, 200);
        mf.updateAtmComposition(a,cc);
        mf.withdraw(u, 500,a);
        mf.deposit(a,1200,u);
    }
}
