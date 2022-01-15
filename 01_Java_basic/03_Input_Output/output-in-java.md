## Xuất dữ liệu  
Trong Java có tới 3 cách để in dữ liệu ra màn hình:  
- `print`: In kết quả ra màn hình nhưng con trỏ chuột không xuống dòng  
- `println`: In kết quả ra màn hình đồng thời con trỏ chuột tự động xuống dòng tiếp theo  
- `printf`: In kết quả ra màn hình đồng thời có thể định dạng được kết quả đó nhờ vào các đối số thích hợp  

Ví dụ:  
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();

        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();

        //Sử dụng print
        System.out.print("Xin chào tôi tên là " + name);
        System.out.print(" Tôi đến từ " + address);
        System.out.print(" Năm nay tôi " + age + " tuổi");

        System.out.println("---------------------");

        //Sử dụng println
        System.out.println("Xin chào tôi tên là " + name);
        System.out.println("Tôi đến từ " + address);
        System.out.println("Năm nay tôi " + age + " tuổi");

        System.out.println("---------------------");

        //Sử dụng printf
        System.out.printf("Xin chào tôi tên là %s, tôi đến từ %s, năm nay tôi %d", name, address, age);

    }
}
```

## Bộ định dạng có sẵn trong prinf

- `%c` : Ký tự
- `%d` : Số thập phân (số nguyên) (cơ số 10)
- `%e` : Dấu phẩy động theo cấp số nhân
- `%f` : Dấu phẩy động
- `%i` : Số nguyên (cơ sở 10)
- `%o` : Số bát phân (cơ sở 8)
- `%s` : Chuỗi
- `%u` : Số thập phân (số nguyên) không dấu
- `%x` : Số trong hệ thập lục phân (cơ sở 16)
- `%%`: Dấu phần trăm
- `\%` : Dấu phần trăm