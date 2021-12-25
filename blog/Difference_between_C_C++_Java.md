các ngôn ngữ lập trình C, C++ và Java là những ngôn ngữ lập trình phổ biến và được sử dụng rộng rãi nhất trên thị trường. Trong bài viết này, chúng ta sẽ cùng thảo luận sự khác biệt giữa C, C++ và Java. 
|  | C | c++ | Java | 
|---|---|---|---|
| Mô hình lập trình| Lập trình hướng thủ tục | Lập trình hướng đối tượng | Lập trình hướng đối tượng|
| Nguồn gốc | Dựa trên assembly | Dựa trên ngôn ngữ C  | Dựa trên C và C++ |
| Developer | Dennis Ritchie vào năm 1972 | Bjarne Stroustrup vào năm 1979 | James Gosling vào năm 1991 |
| Biên dịch | Compiler only | Compiler only | Compiler + interpreter |
| Sự phụ thuộc vào platform | Phụ thuộc nền tảng | Phụ thuộc nền tảng | Độc lập nền tảng |
| Thực thi code | Trực tiếp | Trực tiếp | Thực thi bởi JVM |
| Cách tiếp cận | Top-down | Bottom-up | Bottom-up |
| File generation | .exe | .exe | .class |
| Các chỉ thị tiền xử lý | Hỗ trợ tệp tiêu đề (#include, # define) | Được hỗ trợ (#header, #define) | Sử dụng package (import) |
| Keywords | Hỗ trợ 32 keywords | Hỗ trợ 63 keywords | 50 keywords |
| Datatypes (union, structure) | Được hỗ trợ | Được hỗ trợ | Không được hỗ trợ |
| Kế thừa | Không hỗ trợ | Được hỗ trợ | Được hỗ trợ ngoại trừ đa kế thừa |
| Overloading | Không được hỗ trợ | Hỗ trợ nạp chồng phương thức (đa hình) | Hỗ trợ nạp chồng phương thức (đa hình) | 
| Con trỏ | Được hỗ trợ | Được hỗ trọ | Không được hỗ trợ |
| Allocation | sử dụng malloc, calloc | Sử dụng new, delete | Garbage collector |
| Xử lý ngoại lệ | KHông hỗ trợ | Được hỗ trợ | Được hỗ trợ |
|Templates | Không hỗ trợ | Hỗ trợ | Không hỗ trợ |
| Destructors | Không có constructor và destructor | Được hỗ trợ | Chỉ có constructor |
| Multithreading/ Interfaces | Không hỗ trợ | Không hỗ trợ | Được hỗ trợ |
| Kết nối database | Không hỗ trợ | Không hỗ trợ | Được hỗ trợ | 
| Storage Classes | Được hỗ trợ | Được hỗ trợ | Không được hỗ trợ | 

Đó là tất cả sự khác biệt giữa C, C ++ và Java. Tôi hy vọng bạn đã hiểu rõ các khái niệm cơ bản về các ngôn ngữ lập trình tuyệt vời này và giúp bạn thêm giá trị vào kiến ​​thức của mình.  
Tiếp theo, chúng ta hãy xem một số chương trình mẫu để hiển thị sự khác biệt giữa C, C ++ và Java.

**Hello Word Program in C**  
```c
#include<stdio.h> //header file for standard input output
 
main() //main method
{
    clrscr(); //clears screen
    printf(“hello world”); //print statement
    getch(); //get the character
}
```

*Giải thích:* Trong đoạn mã trên, tệp tiêu đề `<stdio.h>` được sử dụng để thực hiện các lệnh như `printf`, `getch`.  

**Hello World Program in C++**   
```c
#include<iostream.h> // header file for input output
#include<conio.h>
main() // header file for console inout output
{
    clrscr(); // clears screen
    cout<<”hello world”; //print statement
    getch(); // get the character
}
```
*Giải thích:* Trong C++, tệp tiêu đề `<iostream.h>`, `<conio.h>` được sử dụng cho đầu ra đầu vào và đầu ra đầu vào bảng điều khiển để có thể thực hiện các lệnh như `cout` và `cin`. Nó tương tự như `printf` và `scanf` trong ngôn ngữ lập trình C.  

**Hello World Program in Java**  
```java
class App // create class
{
    public static void main(String args[]) //main method
    {
        System.out.print(“Hello World”); //print statement
    }
}
```
*Giải thích:* Trong Java, các lớp và đối tượng được sử dụng vì nó là một ngôn ngữ lập trình hướng đối tượng thuần túy.