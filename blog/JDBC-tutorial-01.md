Hiện nay hầu hết các ứng dụng Java hay các framework của nó đều dần chuyển sang các ORM(Object Relational Mapping) để làm việc với database, có thể kể đến là hibernate được sử dụng rộng rãi. Thế nên mọi người có xu hướng dần quên đi JDBC, thế nhưng các bạn có biết rằng bên dưới hibernate đang sử dụng JDBC để để kết nối đến database và thực thi các lệnh SQL được nó tạo ra.  
Trong loạt bài viết này, chúng ta sẽ cùng tìm hiểu về JDBC và cách sử dụng chúng.  

<br>


## JDBC là gì?
JDBC - Java Database Conectivity, là một API chuẩn để kết nối giữa ngôn ngữ lập trình Java và các database. Nó là một phần của JavaSE (Java Standard Edition). API JDBC sử dụng JDBC drivers để kết nối với cơ sở dữ liệu.  
Có 4 loại JDBC drivers:  
- JDBC - ODBC Bridge Driver
- Native Drive  
- Network Protocol Driver
- Thin driver

