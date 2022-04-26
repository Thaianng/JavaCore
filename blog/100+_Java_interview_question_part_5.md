Trong quá trình học tập, nghiên cứu hoặc trong một bài phỏng vấn về ngôn ngữ Java. Xử lý ngoại lệ và đa luồng là một vấn đề quan trọng giúp chúng ta có thể hoàn thiện, tối ưu một chương trình Java. Trong bài viết này chúng ta sẽ cùng tìm hiểu một số câu hỏi phỏng vấn Java về phần **Exception** & **Thread**  

## 1. Sự khác biệt giữa Error và Exception  
Error là lỗi không thể cứu chữa được, xảy ra trong runtime. Chẳng hạn như OutOfMemory. Mặc dù có thể gặp lỗi này trong khối `catch` nhưng quá trình thực thi ứng dụng sẽ bị tạm dừng và không thể khôi phục được.  

Trong khi đó các trường hợp exception sảy ra chủ yếu là do đầu vào không tốt hoặc do lỗi của con người,... Ví dụ: FileNotFoundException sẽ được ném ra nếu không tìm thấy file, hay NullPointerException xảy ra khi sử dụng tham chiếu null. Trong hầu hết các trường hợp, có thể khôi phục từ một ngoại lệ (Có thể bằng cách cung cấp cho người dùng phản hồi để nhập các giá trị thích hợp)  

## 2. Có thể xử lý exception bằng những cách nào? 
Có 5 từ khóa được sử dụng để xử lý ngoại lệ:  
- `try`
- `catch`
- `finally`
- `throw`
- `throws`

## 3. Sự khác biệt giữa Checked Exception và Unchecked Exception  
**Checked Exception**  
- Các lớp kế thừa `Throwable` ngoại trừ `RuntimeException` và `Error` là các checked exception  
- Được kiểm tra tại thời điểm Compile time  
- Ví dụ: IOException, SQLException,...  

**Unchecked Exception**  
- Các lớp kế thừa `RuntimeException` được gọi là unchecked exception
- Uncecked exception không được kiểm tra lúc compile-time  
- Một số ví dụ: ArithmeticException, NullPointerException,...  

## 4. Các cách để sử dụng Thread
Có 2 cách để tạo Thread:  
- Kế thừa từ class Thread  
- Implements từ interface Runnable

## 5. Khối finally có được thực thi khi câu lệnh return được viết ở cuối khối try và khối catch không?  

Khối finally luôn được thực thi ngay cả khi câu lệnh return được viết ở cuối khối try và khối catch. Nó luôn được thực thi cho du ngoại lệ có xảy ra hay không. Chỉ có một số tình huống mà khối finally không được thực thi như: sự cố JVM, sự cố phần mềm,... Nếu bạn không muốn thực thi khối finally, chỉ cần gọi `System.exit()`  

## 6. Làm thế nào để lan truyền một ngoại lệ trong code?
Trong java khi một method ném ra một unchecked exception hệ thống sẽ cố gắng tìm khối try-catch gần nhất để xử lý chúng. Nếu method hiện tại không xử lý exception, thì hệ thống sẽ xem xét đến method nằm bên dưới nó trong stack nếu vẫn không tìm thấy khối try-catch thì hệ thống sẽ tiếp tục tìm cho đến cuối stack hoặc dừng lại khi tìm thấy khối try-catch để xử lý.  
Danh sách các method trong stack được gọi là call stack và quá trình tìm kiếm khối try-catch để xử lý exception gọi là quá trình lan truyền exception.  

## 7. Giải thích về vòng đời của thread
Một thread có thể rơi vào một trong năm trạng thái. Vòng đời của thread trong Java được kiểm soát bởi JVM. Các trạng thái đó là:  
- New: Thread ở trạng thái new nếu bạn tạo một instance của lớp nhưng trước khi gọi tới phương thức start()  
- Runnable: Thread ở trạng thái này sau khi gọi tới phương thức start(), nhưng trình lập lịch của thread đã không chọn nó là thread đang chạy.  
- Running: Khi trình lập lịch của thread đã chọn nó  
- Non-Runnable: Đây là trạng thái khi thread vẫn còn sống, nhưng hiện tại không được chọn để chạy.  
- Terminated: Khi phương thức run của nó bị thoát  

## 8. Các từ khóa `final`, `finally`, `finalize` có mục đích gì?  
- `final`: dùng để hạn chế sự kế thừa các biến, phương thức và lớp. Không thể kế thừa một lớp final, không thể ghi đè một phương thức final, và không thể thay đổi giá trị của một biến final.  
- `finally`: Được sử dụng với các ngoại lệ, khối finally luôn được thực thi dù ngoại lệ có sảy ra hay không  
- `finalize`: Được sử dụng để thực hiện xử lý dọn dẹp ngay trước khi đối tượng được thu gom rác.

## 9. Sự khác biệt giữa `throw` và `throws`

| throw | throws | 
| --- | --- |
| `throw` được sử dụng để ném ra ngoại lệ | Sử dụng để khai báo ngoại lệ |
| Checked exception không được truyền ra nến chỉ sử dụng `throw` | Checked exception được truyền ra ngay cả khi chỉ sử dụng từ khóa `throws` |
| Sau `throw` là một instance | Sau `throws` là một hoặc nhiều class |  
| `throw` được sử dụng trông phương thức có thể quăng ra exception ở bất kỳ dòng nào trong phương thức (sau đó dùng `try-catch` để bắt hoặc khai báo cho thằng khác xử lý) | `throws` được khai báo ngay sau dấu đóng ngoặc đơn của phương thức. Khi một phương thức có `throw` bên trong mà không bắt lại thì phải ném đi cho thằng khác xử lý |
| Không thể `throw` nhiều exception | Có thể khai báo nhiều exceptions |  

## 10. Phân cấp ngoại lệ trong Java?  
thống phân cấp ngoại lệ. Nó được kế thừa bởi 2 lớp con là `Exception` và `Error`. Xem hình dưới đây:  
![image](image/hierarchy-of-exception-handling.png)   

## 11. Cách tạo custom exception 
Custom exception là ngoại lệ do người dùng tự định nghĩa. Nó được sử dụng để tùy biến ngoại lệ theo yêu cầu của người dùng.   
Thông thường, để tạo custom exception thuộc loại checked sẽ kế thừa từ lớp `Exception`. Để tạo custom exception thuộc loại unchecked sẽ kế thừa từ lớp `RuntimeException`    
Ví dụ:  
```java
class CustomException extends Exception { } //tạo checked exception
```
```java
class CustomException extends RuntimeException{ } //Tạo unchecked exception
```

## 12. Các phương thức quan trọng của lớp Exception
Exception và tất cả các lớp con của nó không cung cấp bất kỳ phương thức cụ thể nào và tất cả các phương thức được xác định trong lớp cơ sở `Throwable`  
- `String getMessage()`: Trả về một message cụ thể về exception 
- `String getLocalizedMessage()`: Phương thức này được cung cấp để các lớp con có thể ghi đè nó để cung cấp thông báo ngôn ngữ cụ thể cho chương trình gọi. Việc triển khai lớp `Throwable` của phương thức này chỉ cần sử dụng phương thức getMessage() để trả về thông báo ngoại lệ
- `Synchronized Throwable getCause()`: Phương thức này trả về nguyên nhân của ngoại lệ hoặc id null mà nguyên nhân là không xác định  
- `String toString()`: Trả về tên của lớp và kết hợp với kết quả từ phương thức `getMessage()`
- `void printStackTrace()`: In ra kết quả của phương thức `toString()` cùng với stack trace đến `System.err`  


## 13. Khối finally là gì? Có cách nào để không thực thi khối này không?  
Khối `finally` trong Java được sử dụng để thực thi các lệnh quan trọng như đóng kết nối, đóng các `stream`,...  
Khối lệnh `finally` luôn được thực thi cho dù có ngoại lệ sảy ra hay không.  

Khối `finally` sẽ không được thực thi nếu chương trình bị thoát bằng cách gọi `System.exit()` hoặc xảy ra một lỗi không thể tránh khiến chương trình bị chết    

