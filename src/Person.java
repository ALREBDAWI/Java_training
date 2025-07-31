public class Person {
    String name;
    String gender;
    int age;

    public Person(){

    }
    public Person(String n, String g, int a){
        name = n;
        gender = g;
        age = a;
    }

    void display(){
        System.out.println("name : " + name);
        System.out.println("gender : " + gender);
        System.out.println("age : " + age);
    }
}
