package Person;

public class Staff extends Person {
    String school;
    double pay;

    //getters and setters
    public String getSchool() {
        return school;
    }

    public void setSchool(String pSchool) {
        this.school = pSchool;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pPay) {
        this.pay = pPay;
    }

    //message
    public String toString(){
        return "name : " + name + ", Address : " + address + "school : " + school + ", pay : " + pay;
    }
}
