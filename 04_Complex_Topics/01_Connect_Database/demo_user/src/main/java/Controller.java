import database.ConnectJDBC;
import model.Gender;
import model.User;
import service.UserService;
import util.Menu;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Controller {

    private ConnectJDBC connect;
    private UserService service;
    private ArrayList<User> listUser;
    Connection conn;
    Scanner sc;

    public Controller() {
        connect = new ConnectJDBC();
        conn = connect.connect();
        service = new UserService();
        listUser = service.getListUser(conn);
        sc = new Scanner(System.in);
    }

    public void showAllUser(){
        for(User u: listUser){
            System.out.println(u);
        }
    }

    public void createNewUser(){
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Mobile: ");
        String mobile = sc.nextLine();
        System.out.println("Gender: ");
        Gender gender = inputGender();
//        System.out.println("Avatar: ");
        String avatar = "https://drive.google.com/file/d/1EahHjI947g8CMHj5KkkniRl3fg6OJIyx/view?usp=sharing";

        service.addNewUser(conn, username, password, email, mobile, gender, avatar);
    }

    public Gender inputGender(){
        Gender gender = null;
        while (gender == null){
            Menu.menuGender();
            int choice = Integer.parseInt(sc.next());
            switch (choice){
                case 1:
                    gender = Gender.female;
                    break;
                case 2:
                    gender = Gender.male;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }

            if(gender == null){
                System.out.println("Vui lòng chọn lại: ");
            }
        }
        return gender;
    }

    public void getUserById(){
        System.out.println(service.getUserById(conn));
    }

    public void deleteUser(){
        User deleteUser = service.getUserById(conn);

        service.deleteUser(conn, deleteUser);
    }

    public void updateUsername(){
        User updateUser = service.getUserById(conn);
        System.out.println("Nhập username mới: ");
        String username = sc.nextLine();
        service.updateUsername(conn, updateUser, username);
    }

    public void sortByName(){
//        listUser.sort(new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getUsername().compareTo(o2.getUsername());
//            }
//        });

        listUser.stream()
                .sorted((o1, o2) -> o1.getUsername().compareTo(o2.getUsername()))
                .forEach(user -> System.out.println(user));
    }
}
