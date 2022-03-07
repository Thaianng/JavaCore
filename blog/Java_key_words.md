# Java Keywords
Trong Java có khoảng 50 keywords, đây là những từ có mục đích sử dụng được xác định trước trong Java. Giống như *hoa đã có chủ* chúng ta không thể tùy ý sử dụng nó để đặt tên cho các đối tượng khác trong chương trình.  
Dưới đây mình sẽ liệt kê danh sách các keywords trong Java:  

| Keywords | Description |
| --- | --- |
| abstract | Được sử dụng cho lớp và phương thức. Một lớp trừu tượng không thể sử dụng để tạo đối tượng mà phải thông qua một lớp kế thừa nó. Một phương thức trừu tượng chỉ có thể được sử dụng trong một lớp trừu tượng và nó không có phần thân. Phần thân được cung cấp bởi lớp con. |
| assert | Kiểm tra điều kiện là đúng hay sai (Thường sử dụng trong `Unit Test`) |
| boolean | Kiểu dữ liệu logic, chỉ nhận một trong hai giá trị `true` hoặc `false` |
| break | Sử dụng để thoát khỏi vòng lặp hoặc sử dụng trong `switch case`|
| byte | Kiểu dữ liệu có thể lưu trữ các số nguyên từ -128 đến 127 |
| case | Sử dụng với câu lệnh `switch`, đánh dấu một khối lệnh |
| catch | Dùng để bắt ngoại lệ được tạo bởi khối `try`, sử dụng kèm với `try` để xử lý các ngoại lệ trong chương trình |
| char | Kiểu ký tự dùng để biểu diễn các ký tự trong bộ mã Unicode |
| class | Dùng để định nghĩa một class | 
| continue | Sử dụng để tiếp tục một vòng lặp tại điều kiện đã được xác định | 
| const | Sử dụng để xác định một hằng số. Tuy nhiên trong Java không sử dụng từ này mà sử dụng `final` | 
| default | Mặc định được thực thi nếu không có `case` nào trả về `true`. Được sử dụng trong `switch case` | 
| do | Sử dụng cùng với `while` để tạo vòng lặp `do while` | 
| double | Là kiểu dữ liệu lưu trữ các số thực |
| else | Sử dụng trong câu điều kiện. Rẽ nhánh điều kiện ngược với `if` | 
| enum | Kiểu dữ liệu đặc biệt, đại diện cho hằng số cố định |  
| exports | Exports một package với một module |
| extends | Kế thừa một lớp (Chỉ ra rằng một lớp được kế thừa từ một lớp khác) |
| final |  Dùng để chỉ ra các biến, phương thức không thay đổi sau khi đã được định nghĩa. Những phương thức final không được kế thừa và override. | 
| finally | Được xử dụng với các ngoại lệ, khối finally luôn được thực thi dù có ngoại lệ sảy ra hay không |
| float | Là kiểu dữ liệu lưu trữ các số thực |
| for | Dùng để tạo vòng lặp `for` | 
| if | Sử dụng để tạo câu điều kiện | 
| implements | implements một interface |
| import | Sử dụng để import package, class hoặc interface | 
| instanceof | Kiểm tra một đối tượng là một thể hiện của một lớp cụ thể hay một interface |
| int | Kiểu dữ liệu dùng để lưu trữ các số nguyên từ -2147483648 to 2147483647 |
| interface | Sử dụng để định nghĩa interface | 
| long |Kiểu dữ liệu dùng để lưu trữ các số nguyên từ -2^63^ đến 2^63^-1|
| module | Khai báo một module |
| native | Sử dụng để chỉ định một hàm được triển khai bởi các ngôn ngữ khác | 
| new | Tạo một đối tượng mới |
| package | Khai báo một package |
| private | Phạm vi truy cập sử dụng cho các biến, phương thức và constructor, làm cho chúng chỉ có thể được truy cập trong lớp đã khai báo |
| protected | Phạm vi truy cập sử dụng cho các biến, phương thức và constructor, làm cho chúng chỉ có thể được truy cập nếu trong cùng package hoặc thông qua tính kế thừa |
| public | Phạm vi truy cập có thể sử dụng cho lớp, biến, phương thức và constructor, làm cho chúng có thể được truy cập ở khắp mọi nơi trong chương trình |
| requires | Chỉ định các thư viện bắt buộc bên trong một module |
| return | Sử dụng để trả về một giá trị từ một phương thức | 
| short | Kiểu dữ liệu dùng để lưu trữ các số nguyên từ -32768 đến 32767 |
| static | Định nghĩa biến, phương thức của một lớp có thể được truy cập trực tiếp từ lớp mà không thông qua khởi tạo đối tượng của lớp |
| strictft | Hạn chế độ chính xác và làm tròn của các phép tính số thực |
| super | Đề cập tới các đối tượng lớp cha |
| switch | Sử dụng trong mệnh đề `switch case` |
synchronized | Chỉ ra là ở mõi thời điểm chỉ có 1 đối tượng hay 1 lớp có thể truy nhập đến biến dữ liệu hoặc phương thức loại đó – Thường được sử dụng trong lập trình đa luồng (multithreading) |
| this | Tham chiếu đến đối tượng hiện tại trong một phương thức hoặc hàm tạo |
| throw | Ném ra ngoại lệ |
| throws | Khai báo một ngoại lệ |
| transient | Chỉ định rằng nếu một đối tượng được Serialized, giá trị của biến sẽ không cần được lưu trữ |
| try | Dùng để tạo mệnh đề `try catch` |
| var | Khai báo biến |
| void | Cho biết một phương thức không có giá trị trả về | 
| volatile | Báo cho chương trình dịch biết là biến khai báo volatile có thể thay đổi tùy ý trong các luồng (thread) | 
| while | Tạo vòng lặp while |


*Lưu ý:* `true`, `false` và `null` không phải là keywords, nhưng không thể sử dụng chúng để định danh
