import java.time.LocalDateTime;
public class Transaction {
    private long transactionId;
    private LocalDateTime dateOfTransaction;
    private int transactionAmount;
    private Verdict verdict;
    private TransactionType transactiontype;
    private Location location;
    public Transaction(long transactionId, LocalDateTime dateOfTransaction, int transactionAmount, Verdict verdict,
            TransactionType transactiontype, Location location) {
        this.transactionId = transactionId;
        this.dateOfTransaction = dateOfTransaction;
        this.transactionAmount = transactionAmount;
        this.verdict = verdict;
        this.transactiontype = transactiontype;
        this.location = location;
    }
    public long getTransactionId() {
        return transactionId;
    }
    public LocalDateTime getDateOfTransaction() {
        return dateOfTransaction;
    }
    public int getTransactionAmount() {
        return transactionAmount;
    }
    public Verdict getVerdict() {
        return verdict;
    }
    public TransactionType getTransactiontype() {
        return transactiontype;
    }
    public Location getLocation() {
        return location;
    }
     
    

}
