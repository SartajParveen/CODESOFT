public class CurrencyComposition {
    int fiveHundred;
    int twoHundred;
    int oneHundred;
    int fifty;
    int ten;
    public CurrencyComposition(int fiveHundred,int twoHundred,int oneHundred,int fifty,int ten){
        this.fiveHundred=fiveHundred;
        this.twoHundred=twoHundred;
        this.oneHundred=oneHundred;
        this.fifty=fifty;
        this.ten=ten;
    }
    public int getFiveHundred(){
        return this.fiveHundred;
    }
    public int getTwoHundred(){
        return this.twoHundred;
    }
    public int getOneHundred(){
        return this.oneHundred;
    }
    public int getFifty(){
        return this.fifty;
    }
    public int getTen(){
        return this.ten;
    }
    public void setFiveHundred(int notes){
        this.fiveHundred-=notes;
    }
    public void setTwoHundred(int notes){
        this.twoHundred-=notes;
    }
    public void setOneHundred(int notes){
        this.oneHundred-=notes;
    }
    public void setFifty(int notes){
        this.fifty-=notes;
    }
    public void setTen(int notes){
        this.ten-=notes;
    }
    
}
