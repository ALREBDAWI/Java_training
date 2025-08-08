package City;

public class Capital extends City {
    private String country;

    //constructor
    public Capital(){
        country = "";
    }

    public Capital(String pCountry, String pCityName){
        super(pCityName);
        this.country = pCountry;
    }

    public Capital(String pCityName, int pNumHab, String pCountry){
        super(pCityName);
        this.numHab = pNumHab;
        this.country = pCountry;
    }

    //getter and setter
    public String getCountry() {
        return country;
    }

    public void setCountry(String pCountry) {
        this.country = pCountry;
    }

    //message
    @Override
    public void cityDetails(){
        System.out.println("City name : " + super.getCityName() + ", Number of inhabitants : " + (numHab >= 0 ? numHab : "unknown")
                + ", Capital of : " + country);
    }

    public static void main(String[] args) { //test
        Capital capital = new Capital();
        capital.setCountry("Egypt");
        capital.setNumHab(20000000);
        capital.cityDetails();
    }
}
