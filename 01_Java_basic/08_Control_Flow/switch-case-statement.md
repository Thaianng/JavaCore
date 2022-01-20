## switch-case statement
Câu lệnh `switch case` hỗ trợ cho câu điều kiện có nhiều điều kiện. Nó giống như câu lệnh `if else if` bậc thang.  
Khác với `if else`, `switch` sẽ kiểm tra giá trị của biến (nằm trong ngoặc đơn sau `switch`) và so sánh biến với từng giá trị khác nhau, lần lượt từ trên xuống dưới, mỗi giá trị cần so sánh gọi là một `case`.  
Nếu tất cả các `case` đều sai (tức là các value ở case không bằng với biến), thì khối lệnh ở trong `default` sẽ được thực thi.  
Lưu ý là khối `default` là không bắt buộc có ở cấu trúc `switch case` trong Java, tức là bạn có thể viết cũng được mà không viết cũng không bị lỗi.  
Trong một `switch` có thể có rất nhiều `case`, bao nhiêu cũng được. Khi một `case` đúng, khối lệnh trong `case` đó sẽ được chạy.  
Nếu không gặp lệnh `break` trong khối lệnh `case` thì chương trình sẽ thực hiện tiếp các `case` bên dưới cho tới khi nó gặp lệnh `break` thì thoát khỏi `switch`   

Cú pháp:  
```java
switch(<Biến>){
    case <Giá trị 1>:
        <Khối lệnh 1>;
        break;
    case <Giá trị 2>:
        <Khối lệnh 2>;
        break;
    case <Giá trị 3>:
        <Khối lệnh 3>;
        break;
        .
        .
        .
    case <Giá trị n>:
        <Khối lệnh n>;
        break;
    default:
        <Khối lệnh trong default>;
}
```

Ví dụ:  

```java
int number = 2;
switch(number){
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
        break;
    case 3:
        System.out.println("Three");
        break;
    case 4:
        System.out.println("Four");
        break;
    case 5:
        System.out.println("Five");
        break;
    default:
        System.out.println("Không có lựa chọn này");
}
```