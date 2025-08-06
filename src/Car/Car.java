package Car;

public class Car {

    String brand;
    double price;

    public Car(){   //default constructor
        brand = "";
        price = 0;
    }

    public void setBrand(String pBrand){ //brand setter
        this.brand = pBrand;
    }

    public String getBrand(){  //brand getter
        return brand;
    }

    public void setPrice(double pPrice){  //price setter
        if(pPrice > 0){
            this.price = pPrice;
        }else {
            System.out.println("Invalid price");
        }
    }

    public double getPrice(){
        return price;
    }

    public void carDetails(){
        System.out.println("This car is a " + brand + " brand and its price is : " + price);
    }
}
