public enum Verdict {
    SUCCESS("success"),
    FAILURE("failure"),
    OUT_OF_MONEY("out of money"),
    SOFTWARE_ERROR("software error"),
    HARDWARE_ERROR("hardware error"),
    MAX_LIMIT("exceed maximum withdrawal");
    private String val;

    private Verdict(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
    
    

}
