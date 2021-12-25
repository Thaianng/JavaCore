public class Main {
    public static void main(String[] args) {
        //Tạo đối tượng với constructor mặc định
        Person ngoc = new Person();
        ngoc.name = "Ngọc";
        ngoc.age = 25;

        //Tạo đối tượng với constructor có tham số
        Person linh = new Person("Linh", 21);

        System.out.println(ngoc.name + " - " + ngoc.age);

        ngoc.eat();
        ngoc.study("Java");
    }
}
