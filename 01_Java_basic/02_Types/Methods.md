## Java Methods  
Method (Phương thức) là một khối lệnh chỉ chạy khi được gọi.    
Ta có thể truyền tham số vào phương thức.   
Các phương thức được sử dụng để thực hiện hành động nhất định và chúng được gọi là functions (hàm)  
Việc sử dụng method giúp code ngắn gọn, dễ nhìn, tái sử dụng code, dễ dàng chỉnh sửa khi cần thiết   

## Tạo method
Method phải được khai báo trong một class. Method được định nghĩa bởi 1 tên và theo sau tên đó là cặp dấu ngoặc tròn `()`  

Java cung cấp một số phương thức có sẵn, ví dụ như: `System.out.println()`, nhưng chúng ta có thể tự tạo method để thực hiện các hành vi nhất định.  
Ví dụ:  
```java
public class Main{
    public void myMethod(){

    }
}
```  

Giải thích:  
- `myMethod()` tên của method  
- `public` phạm vi truy cập
- `void` kiểu trả về của phương thức. Do phương thức không có giá trị trả về nên sử dụng `void`

## Gọi phương thức  
