package Person;

public class Student extends Person {
    String program;
    int year;
    double fee;

    //setters and getters

    public String getProgram() {
        return program;
    }

    public void setProgram(String pProgram) {
        this.program = pProgram;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int pYear) {
        this.year = pYear;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double pFee) {
        this.fee = pFee;
    }

    //message

    public String toString(){
        return "name : " + name + ", address : " + address + ", program : " + program + ", year : " + year + ", fee : " + fee;
    }
}
