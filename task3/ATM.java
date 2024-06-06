import java.util.*;
public class ATM {
  private String atmid;
  private Location location;
  private CurrencyComposition composition;
  private Long balance;
  private Condition condition;
  private List<Transaction> transactionList = new ArrayList<>();
  public ATM(String atmid,Location location,CurrencyComposition composition){
    this.composition=composition;
    this.atmid=atmid;
    this.location=location;
    condition=Condition.WORKING;
    this.balance=getBalance(composition);
  }
  private long getBalance(CurrencyComposition composition){
    return composition.getFiveHundred()*500+composition.getTwoHundred()*200+composition.getOneHundred()*100+composition.getFifty()*50+composition.getTen()*10;
  }
  public String getAtmId(){
    return atmid;

  }
  public Location getLocation(){
    return this.location;
  }
  public long getBalance(){
    return this.balance;

  }
  public Condition getCondition(){
    return this.condition;
  }
  public Long getbalance(){
    return this.balance;
  }
 
  public List<Transaction> getTransaction(){
    return this.transactionList;
  }
  public CurrencyComposition getComposition(){
    return this.composition;
  }
  public void setLocation(Location location) {
    this.location = location;
  }
  public void setComposition(CurrencyComposition composition) {
    this.composition = composition;
  }
  public void setBalance(Long balance) {
    this.balance = balance;
  }

}
