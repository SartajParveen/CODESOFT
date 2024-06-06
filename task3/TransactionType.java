public enum TransactionType {
    CREDIT("credit"),
    DEBIT("debit"),
    FAILED("failed");
    
    private String val;

    private TransactionType(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
    


}
