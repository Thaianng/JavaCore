package controller;

import model.User;
import service.UserService;
import util.Menu;
import util.Validate;

import java.util.ArrayList;
import java.util.Scanner;

public class UserController {
    Scanner sc;
    UserService service;
    ArrayList<User> users;

    public UserController() {
        service = new UserService();
        sc = new Scanner(System.in);
        users =  service.getAllUser();
    }

    public void home(){
        boolean isCheck = true;
        while (isCheck){
            Menu.mainMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    login();
                    break;
                case 2:
                    createNewAccount();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }

    }

    public void login(){
        System.out.println("Nhập username: ");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();

        boolean isValidUsername = false;
        while (!isValidUsername){
            for(User u: users){
                if (u.getUsername().equals(username)){
                    isValidUsername = true;
                    if (u.getPassword().equals(password)){
                        loginSuccess(u);
                    }else {
                        System.out.println("Mật khẩu không chính xác");
                        loginFail();
                    }
                }
            }
            if(!isValidUsername){
                System.out.println("Kiểm tra lại tên đăng nhập");
            }
        }


    }

    public void loginSuccess(User user){
        System.out.println("Chào mừng " + user.getUsername() + ", bạn có thể thực hiện các công việc sau");
        boolean isCheck =true;
        while (isCheck){
            Menu.loginSuccessMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    changeUserName(user);
                    break;
                case 2:
                    changeEmail(user);
                    break;
                case 3:
                    changePassword(user);
                    break;
                case 4:
                    isCheck = false;
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }



    }

    public void changeUserName(User user){

        user.setUsername(inputUsername());
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

    public void changeEmail(User user){
        user.setEmail(inputEmail());
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

    public void changePassword(User user){
        user.setPassword(inputPassword());
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

    public void loginFail(){
        while (true){
            Menu.loginFail();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    login();
                    break;
                case 2:
                    handleForgotPassword();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");

            }
        }
    }

    public void handleForgotPassword(){
        boolean isRightEmail = false;
        while (!isRightEmail){
            System.out.println("Nhập email của bạn: ");
            String email = sc.nextLine();
            User user = service.checkEmail(users, email);
            if(user != null){
                isRightEmail = true;
                user.setPassword(inputPassword());
            }
        }
        System.out.println("Cập nhật mật khẩu thành công");
        login();
    }


    public void createNewAccount(){
        String username = inputUsername();
        String email = inputEmail();
        String password = inputPassword();

        users.add(new User(username, email, password));
        System.out.println("Đăng ký thành công");

    }

    public String inputUsername(){
        boolean isValidUsername = false;
        String username = null;
        while (!isValidUsername){
            System.out.println("Nhập username: ");
            username = sc.nextLine();
            for(User user: users){
                if(user.getUsername().equals(username)){
                    System.out.println("Username đã tồn tại");
                }else{
                    isValidUsername = true;
                }
            }
        }
        return username;

    }

    public String inputEmail(){
        boolean isValidEmail = false;
        String email = null;
        while (!isValidEmail){
            System.out.println("Nhập email: ");
            email = sc.nextLine();
            if(!Validate.validateEmail(email)){
                System.out.println("Email không hợp lệ");
            }else{
                for(User user : users){
                    if(user.getEmail().equals(email)){
                        System.out.println("Email đã tồn tại");
                    }else{
                        isValidEmail = true;
                    }
                }
            }

        }
        return email;
    }

    public String inputPassword(){
        boolean isValidPassword = false;
        String password = null;
        while (!isValidPassword){
            System.out.println("Nhập mật khẩu: ");
            password = sc.nextLine();

            if(!Validate.validatePassword(password)){
                System.out.println("Mật khẩu không hợp lệ");
            }else{
                isValidPassword = true;
            }
        }
        return password;
    }

}


