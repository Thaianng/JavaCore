public class Person {
    public String name;
    public int age;

    //Constructor mặc định
    public Person() {
    }

    //Constructor có tham số
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Method eat() is called!!!");
    }

    public void study(String subject){
        System.out.println("Method study() is called!!!");
        System.out.println(subject);
    }
}
