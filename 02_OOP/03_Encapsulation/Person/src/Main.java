import java.sql.Time;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ngọc", 26);
        System.out.println("Kết quả ban đầu:");
        System.out.println(person.getName() + " - " + person.getAge());

        //Cập nhật lại thông tin
        person.setName("Linh");
        person.setAge(20);
        System.out.println("Sau khi cập nhật: ");
        System.out.println(person.getName() + " - " + person.getAge());
    }
}
