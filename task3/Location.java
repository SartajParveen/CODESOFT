public class Location {
   private String country;
   private String zipcode;
   private String state;
   private String city;
   private String zone;
   private String address;
    public Location(String country,String zipcode,String state,String city,String zone,String address){
        this.country=country;
        this.zipcode=zipcode;
        this.state=state;
        this.city=city;
        this.zone=zone;
        this.address=address;
    }
    public String getCountry() {
        return country;
    }
    public String getZipcode() {
        return zipcode;
    }
    public String getState() {
        return state;
    }
    public String getCity() {
        return city;
    }
    public String getZone() {
        return zone;
    }
    public String getAddress() {
        return address;
    }


}
