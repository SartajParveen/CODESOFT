import java.time.LocalDateTime;
public class MachineFeature {
    
    public static ATM createAtm(Location location,CurrencyComposition composition){
        return new ATM("",location,composition);
    }
    public static void updateAtmLocation(ATM atm,Location location){
        atm.setLocation(location);
    }

    public static void updateAtmComposition(ATM atm,CurrencyComposition composition){
        atm.setComposition(composition);
    }

    public static void seeComposition(CurrencyComposition composition){
        System.out.println("ATM composition:");
        System.out.println("________________________");
        System.out.println("1.500 notes: "+composition.getFiveHundred());
        System.out.println("2.200 notes: "+composition.getTwoHundred());
        System.out.println("3.100 notes: "+composition.getOneHundred());
        System.out.println("4.50 notes: "+composition.getFifty());
        System.out.println("5.10 notes: "+composition.getTen());
        System.out.println("________________________");



    }
    public static void checkUserBalance(User user){
        System.out.println(user.getBalance());
    }
    public static void withdraw(User u,int amount,ATM a){
        if(u.getBalance()<amount){
            Transaction t = new Transaction(12344L,LocalDateTime.now(),amount,Verdict.FAILURE,TransactionType.FAILED,a.getLocation());
            a.getTransaction().add(t);
            System.out.println("Insufficient Balance");
            return;
        }
        if(amount>a.getBalance()){
            Transaction t = new Transaction(12345L,LocalDateTime.now(),amount,Verdict.OUT_OF_MONEY,TransactionType.FAILED,a.getLocation());
            a.getTransaction().add(t);
            System.out.println("We are out of fund");
            return;
        }
        Transaction t = new Transaction(12346L,LocalDateTime.now(),amount,Verdict.SUCCESS,TransactionType.DEBIT,a.getLocation());

            a.getTransaction().add(t);
            updateCompositionNotes(a,amount);
            System.out.println("Account is credited with :"+amount);
            u.setBalance(u.getBalance()-amount);
            checkUserBalance(u);
        
        
    }
    public void deposit(ATM a,int amt,User u){
        u.setBalance(u.getBalance()+amt);
        System.out.println("Balance after Depositing: "+u.getBalance());
    
    }
    public static void updateCompositionNotes(ATM a,int amt){
        CurrencyComposition composition = a.getComposition();
        int fivehunNotes=amt/500;
        if(fivehunNotes<=composition.getFiveHundred()){
            amt-=(500*fivehunNotes);
            composition.setFiveHundred(fivehunNotes);
        }
        int twohunNotes=amt/200;
        if(twohunNotes<=composition.getTwoHundred()){
            amt-=(200*twohunNotes);
            composition.setTwoHundred(twohunNotes);
        }
        int onehunNotes=amt/200;
        if(onehunNotes<=composition.getOneHundred()){
            amt-=(100*onehunNotes);
            composition.setOneHundred(onehunNotes);
        }
        int fiftyNotes=amt/200;
        if(fiftyNotes<=composition.getFifty()){
            amt-=(50*fiftyNotes);
            composition.setFifty(fiftyNotes);
        }
        int tenNotes=amt/200;
        if(tenNotes<=composition.getTen()){
            amt-=(10*twohunNotes);
            composition.setTen(tenNotes);
        }
        updateAtmComposition(a,composition);
        seeComposition(composition);
    }
}
