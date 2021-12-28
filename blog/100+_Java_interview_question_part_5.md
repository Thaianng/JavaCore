Trong quá trình học tập, nghiên cứu hoặc trong một bài phỏng vấn về ngôn ngữ Java. Xử lý ngoại lệ và đa luồng là một vấn đề quan trọng giúp chúng ta có thể hoàn thiện, tối ưu một chương trình Java. Trong bài viết này chúng ta sẽ cùng tìm hiểu một số câu hỏi phỏng vấn Java về phần **Exception** và **Thread**  

## 1. Sự khác biệt giữa Error và Exception  
Error là lỗi không thể cứu chữa được, xảy ra trong runtime. Chẳng hạn như OutOfMemory. Mặc dù có thể gặp lỗi này trong khối `catch` nhưng quá trình thực thi ứng dụng sẽ bị tạm dừng và không thể khôi phục được.  

Trong khi đó các trường hợp exception sảy ra chủ yếu là do đầu vào không tốt hoặc do lỗi của con người,... Ví dụ: FileNotFoundException sẽ được ném ra nếu không tìm thấy file, hay NullPointerException xảy ra khi sử dụng tham chiếu null. Trong hầu hết các trường hợp, có thể khôi phục từ một ngoại lệ (Có thể bằng cách cung cấp cho người dùng phản hồi để nhập các giá trị thích hợp)  

## 2. Có thể xử lý exception bằng những cách nào  
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

## 