package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            int number = 9;
            int zero = 0;
            int result = number/zero;  //ArithmeticException
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.toString());
        }
//        int age = getAge();
//        if(age >= 18){
//            System.out.println("Bạn đã đủ tuổi bầu cử");
//        }else{
//            System.out.println("Từ từ rồi sẽ đủ tuổi");
//        }

        //int[] arr = new int[-5];

    }

    public static int getAge(){
        Scanner sc = new Scanner(System.in);
        int age = 0;

        boolean isContinue = true;

        while(isContinue){ //Sử dụng vòng lặp để môi khi nhập sai sẽ yêu cầu nhập lại cho đến khi đúng
            try {
                System.out.println("Nhập tuổi của bạn:");
                age = Integer.parseInt(sc.nextLine());
                //Tuổi không hợp lệ khi nhập số âm hoặc lớn hơn 200
                if(age < 0 || age > 200)
                    throw new ArithmeticException("Tuổi không hợp lệ"); //sử dụng throw để ném ra ngoại lệ
                isContinue = false;  //gán lại isContinue để dùng vòng lặp
            }catch (NumberFormatException e){ //Do có hai ngoại lệ có thể sảy ra nên sử dụng 2 khối catch để xử lý
                System.out.println("Tuổi phải là số");
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
        return age;
    }
}
