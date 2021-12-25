Tìm kiếm việc làm ở vị trí lập trình viên Java không phải là quá khó. Tuy nhiên, nếu không có sự chuẩn bị tốt dù bạn là người mới vào nghề hay là một lập trình viên có nhiều kinh nghiệm, việc vượt qua vòng phỏng vấn về lập trình Java cũng không hề dễ dàng.  
Dưới đây là danh sách hơn 100 câu hỏi phòng vấn Java bạn nên tham khảo trước khi các cuộc phỏng vấn để chắc chắn bạn không bị bỏ lại phía sau so với những ứng viên khác.  
Trong phần 1 này, chúng ta hãy bắt đầu bằng cách xem qua một số câu hỏi phỏng vấn Java thường gặp nhất

### 1, JDK, JRE và JVM là gì?


| JDK | JRE | JVM |
|---|---|---|
| Java Development Kit | Java Runtime Environment | Java Virtual Machine |
| Là công cụ cần thiết để compile (biên dịch), document và đóng gói các chương trình Java | JRE đề cập đến môi trường runtime trong đó Java bytecode có thể được thực thi | Là một cỗ máy trừu tượng. Nó cung cấp môi trường trong đó Java bytevode có thể thực thi  |
| Nó chứa JRE | Nó là một triển khai của JVM tồn tại trên thực tế | JVM tuân theo 3 quy ước: Đặc tả, Triển khai và runtime instace |


### 2, Giải thích phương thức main() trong chương trình Java
`main()` trong java là điểm đầu vào cho bát kỳ chương trình Java nào. Nó luôn được viết là `public static void main()`.  
- `public`: là phạm vi truy cập, được sử dụng để chỉ định ai có thể truy cập vào phương thức này. `public` có nghĩa là phương thức này có thể được truy cập bởi bất kỳ class nào.  
- `static`: một phương thức được khai báo là `static` thì phương thức đó được gọi là phương thức tĩnh,phương thức đó có thể được truy cập mà không cần tạo đối tượng. Trong trường hợp, `main()` không được khai báo với `static` thì trình biên dịch sẽ ném ra một lỗi vì hàm `main()` được gọi bởi JVM trước khi bất kỳ đối tượng nào được thực hiện.    
- `void`: Là kiểu trả về của phương thức. Voi định nghĩa phương thức sẽ không trả về bất kỳ giá trị nào.    
- `main`: Là tên của phương thức được JVM tìm kiếm như một điểm khởi đầu cho ứng dụng.  
- `String args[]`: Là tham số truyền cho phương thức `main()`  

### 3, Tại sao Java lại độc lập nền tảng?
Java được gọi là độc lập nền tảng vì các bytecode của nó có thể chạy trên bất kỳ hệ thống nào bất kể hệ điều hành cơ bản của nó  

### 4, Tại sao Java Không phải là hướng đối tượng 100%?
Java không phải hướng đối tượng 100% vì nó sử dụng 8 kiểu dữ liệu nguyên thủy là byte, short, int, long, float, double, char, boolean không phải là object  

### 5, Các lớp wrapper trong Java là gì? 
Các lớp wrapper trong Java cung cấp cơ chế chuyển đổi kiểu dữ liệu nguyên thủy thành kiểu đối tượng và ngược lại. 

### 6, Constructors trong Java là gì?  
Trong Java, constructor đề cập đến khối lệnh được sử dụng để khởi tạo đối tượng. Nó phải có cùng tên với tên lớp. Ngoài ra, nó không có kiểu trả về và nó được tự động gọi khi một đối tượng được tạo.  
Có hai loại constructor:  
- Constructor mặc định: Trong Java, một constructor mặc định là constructor không có tham số nào. Mục đích chính của nó là khởi taon biến instance với giá trị mặc định. Ngoài ra nó được sử dụng chủ yếu để tạo đối tượng.  
- Constructor có tham số: constructor được tham số hóa có khả năng khởi tạo các biến instance với các giá trị được cung cấp.  

### 7, Lớp Singleton trong Java là gì? Làm thế nào để một lớp Singleton
Singleton là 1 trong 6 Design Pattern của nhóm Creational Design Pattern, đảm bảo chỉ duy nhất một thể hiện (instance) được tạo ra và nó sẽ cung cấp cho bạn một method để có thể truy xuất được thể hiện duy nhất đó mọi lúc mọi nơi trong chương trình.  
Một lớp có thể được tạo singleton bằng cách đặt constructor của nó là private.