package Person;

public class Person {
    String  name;
    String  address;

    //Constructor
    public Person() {
        name = "";
        address = "";
    }

    public Person( String pName,String pAddress ){
    this.name=pName;
    this.address=pAddress;
    }

    //getters
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    //setters
    public void setAddress(String pAddress){
        this.address=pAddress;
    }

    //message
    public String toString(){
        return "name : " + name + ", Address : " + address;
    }
}
