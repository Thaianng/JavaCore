import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Tạo đối tượng Gson
        Gson gson = new Gson();
//        Person person = new Person("Ngọc", 5, "Hà Giang");
//
//        //Chuyển đổi từ Object sang JSON
//        String result = gson.toJson(person);
//        System.out.println(result);
//
//        //Chuyển đổi từ JSON sang Object
//        String json = "{\"name\":\"Linh\",\"age\":8,\"address\":\"Hà Nội\"}";
//        Person newPerson = gson.fromJson(json, Person.class);
//        System.out.println(newPerson);
//
//        //Chuyển đổi từ JSON sang mảng
//        Person[] persons = null;
//        try {
//            FileReader reader = new FileReader("person.json");
//            persons = gson.fromJson(reader, Person[].class);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        for (Person p : persons){
//            System.out.println(p);
//        }

        //Chuyển đổi từ mảng sang JSON
//        Person arr[] = new Person[5];
//        arr[0] = new Person("John", 25, "American");
//        arr[1] = new Person("Chris", 30, "France");
//        arr[2] = new Person("Madeline", 19, "Colombia");
//        arr[3] = new Person("Anna", 21, "Russia");
//        arr[4] = new Person("Hoàng", 27, "Việt Nam");
//
//        String rs = gson.toJson(arr);
//        System.out.println(rs);
//        ArrayList<Person> list = new ArrayList<>();
//        try {
//            FileReader reader = new FileReader("person.json");
//            Type type = new TypeToken<ArrayList<Person>>(){}.getType();
//            list = gson.fromJson(reader, type);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        for(Person p : list){
//            System.out.println(p);
//        }
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("John", 25, "American"));
        list.add(new Person("Chris", 30, "France"));
        list.add(new Person("Madeline", 19, "Colombia"));
        list.add(new Person("Anna", 21, "Russia"));
        list.add(new Person("Hoàng", 27, "Việt Nam"));

        String json = gson.toJson(list);
        System.out.println(json);
    }
}
