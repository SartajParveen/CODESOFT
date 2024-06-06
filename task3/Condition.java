public enum Condition {
    WORKING("working"),
    TECHNICAL_ERROR("Technical error"),
    OUT_OF_MONEY("out_of_money"),
    ABANDONED("abandoned");
    private String val;

    private Condition(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    
    
}
