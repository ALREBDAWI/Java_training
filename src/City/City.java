package City;

public class City {
    private final String cityName;
    protected int numHab;  //we can enter only from subclasses

    //constructors

    public City(){
        cityName = "Cairo";
        numHab = -1;
    }

    public City(String pCityName, int pNumHab){
        this.cityName = pCityName;
        if (pNumHab >= 0){
            this.numHab = pNumHab;

        }else {
            System.out.println("Error: Number of Hab cant be less than 0");
            numHab = -1;
        }
    }

    public City(String pCityName){
        this.cityName = pCityName;
        numHab = -1; //indicates that it is unknown
    }

    //getters and setters
    public String getCityName(){
        return cityName;
    }

    public int getNumHab(){
        return numHab;
    }

    public void setNumHab(int pNumHab){
        if (pNumHab >= 0){
            this.numHab = pNumHab;
        }else  {
            System.out.println("Error: Number of inhabitants cant be less than 0, your change is not valid");
        }
    }

    //message
    public void cityDetails(){
        System.out.println("City name : " + cityName + ", Number of inhabitants : " + (numHab >= 0 ? numHab : "unknown"));
    }

    public static void main(String[] args) { //test
        City c1 = new City("Damascus", 6000000);
        c1.cityDetails();
        City c2 = new City("Mars", -5); //test invalid inhabitants number
        c2.cityDetails();
    }

}
