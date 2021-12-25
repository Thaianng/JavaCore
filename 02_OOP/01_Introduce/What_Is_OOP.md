# Lập trình hướng đối tượng là gì?

Lập trình hướng đối tượng (Object Oriented Programming - OOP) là một mẫu hình lập trình dựa trên khái niệm "Công nghệ đối tượng", mà trong đó, đối tượng chứa đựng các dữ liệu, trên các trường, thường được gọi là các thuộc tính và mã nguồn, được tổ chức thành các phương thức - *Theo wikipedia*  

Về cơ bản, chỉ cần hiểu OOP là kỹ thuật lập trình cho phép lập trình viên tạo ra các đối tượng trong code trừu tượng hóa các đối tượng thực tế trong cuộc sống. Đối tượng ở đây có thể là con người, phương tiện giao thông, yasuo, leesin,...

Khi viết chương trình theo phương pháp OOP, ta phải trả lời các câu hỏi:  
- Chương trình liên quan tới những lớp đối tượng nào?  
- Mỗi đối tượng cần có những dữ liệu và thao tác nào?  
- Các đối tượng quan hệ với nhau như thế nào trong một chương trình?  

# Các nguyên lý cơ bản của OOP  

Lập trình hướng đối tượng gồm 4 nguyên lý cơ bản:  

![image](../image/oop.png)
## 1. Tính kế thừa (Inheritance)  
Nó cho phép xây dựng một lớp mới dựa trên các định nghĩa của lớp đã có. Có nghĩa là lớp cha có thể chia sẽ dữ liệu và phương thức cho các lớp con. Các lớp con khỏi phải định nghĩa lại, ngoài ra có thể mở rộng các thành phần kế thừa và bổ sung thêm các thành phần mới. Tái sử dụng mã nguồn 1 cách tối ưu, tận dụng được mã nguồn. Một số loại kế loại kế thừa thường gặp: đơn kế thừa, đa kế thừa, kế thừa đa cấp, kế thừa thứ bậc.

Khi bắt đầu xây dựng ứng dụng chúng ta sẽ bắt đầu thiết kế định nghĩa các lớp trước. Thông thường một số lớp có quan hệ với những lớp khác, chúng có những đặc tính giống nhau.

VD: 2 lớp Android, iPhone

Mỗi lớp đều đại diện cho một loại smartphone khác nhau nhưng lại có những thuộc tính giống nhau như gọi điện, nhắn tin, chụp hình. Thay vì sao chép những thuộc tính này, ta nên đặt chúng vào một lớp chung gọi là lớp cha. Chúng ta có thể định nghĩa lớp cha – trong trường hợp này là Smartphone và có những lớp con kế thừa từ nó, tạo ra một mối quan hệ cha/con.

## 2. Tính đa hình (Polymorphism)

Tính đa hình là một hành động có thể được thực hiện bằng nhiều cách khác nhau. Đây lại là một tính chất có thể nói là chứa đựng hầu hết sức mạnh của lập trình hướng đối tượng.

Hiểu một cách đơn giản hơn: Đa hình là khái niệm mà hai hoặc nhiều lớp có những phương thức giống nhau nhưng có thể thực thi theo những cách thức khác nhau.

Ví dụ như ở phần trên, mỗi một smartphone kế thừa từ lớp cha Smartphone nhưng có thể lưu trữ dữ liệu trên cloud theo những cách khác nhau. Android lưu trữ bằng Google Drive iPhone lưu trên iCloud.

Một ví dụ về đa hình trong thực tế. Ta có 2 con vật: chó, mèo. Cả 2 con vật này đều là lớp động vật. Nhưng khi ta bảo cả 2 động vật kêu thì con chó sẽ kêu gâu gâu, con mèo sẽ kêu meo meo.

Vậy trong ví dụ chó, mèo xem như là các đối tượng. 2 con vật có thể hiểu cùng kêu nhưng theo các cách khác nhau.

## 3. Tính trừu tượng  

Trừu tượng có nghĩ là tổng quát hóa một cái gì đó lên, không cần chú ý chi tiết bên trong. Nó không màng đến chi tiết bên trong là gì và người ta vẫn hiểu nó mỗi khi nghe về nó.

Ví dụ: Bạn chạy xe tay ga thì có hành động là tăng ga để tăng tốc, thì chức năng tăng ga là đại diện cho trừu tượng (abstraction). Người dùng chỉ cần biết là tăng ga thì xe tăng tốc, không cần biết bên trong nó làm thế nào.

Ở đây trong lập trình OOP, tính trừu tượng nghĩa là chọn ra các thuộc tính, phương thức của đối tượng cần cho việc giải quyết bài toán đang lập trình. Vì một đối tượng có rất nhiều thuộc tính phương thức, nhưng với bài toán cụ thể không nhất thiết phải chọn tất cả.

## Tính đóng gói  
Tính đóng gói cho phép che giấu thông tin và những tính chất xử lý bên trong của đối tượng. Các đối tượng khác không thể tác động trực tiếp đến dữ liệu bên trong và làm thay đổi trạng thái của đối tượng mà bắt buộc phải thông qua các phương thức công khai do đối tượng đó cung cấp.

Tính chất này giúp tăng tính bảo mật cho đối tượng và tránh tình trạng dữ liệu bị hư hỏng ngoài ý muốn.  


# Ưu điểm, nhược điểm của OOP  
## Ưu điểm
- Tính đóng gói là giới hạn phạm vi sử dụng các biến, nhờ đó việc quản lý giá trị của biến dễ dàng hơn, việc sử dụng mã an toàn hơn.  
- Phương pháp này làm cho tốc độ phát triển các chương trình mới nhanh hơn vì mã được tái sử dụng và cải tiến dễ dàng, uyển chuyển.  
- Phương pháp này tiến hành tiến trình phân tích, thiết kế chương trình thông qua việc xây dựng các đối tượng có sự tương hợp với các đối tượng thực tế.  

## Nhược điểm

- Các chương trình hướng đối tượng có xu hướng chậm hơn và sử dụng nhỉều bộ nhớ  
- Quá khái quát
- các chương trình được xây dựng theo mô hình này có thể mất nhiều thời gian hơn

# Lợi ích của lập trình hướng đối tượng
Lập trình hướng đối tượng ra đời để khắc phục tất cả những nhược điểm của những phương pháp lập trình trước đó.
Lập trình hướng đối tượng rất sát với đời thực, áp dụng thực tế với chương trình. Khi đã hình dung ra các đối tượng việc sử dụng phương thức cũng dễ dàng hơn. Điều này giúp lập trình viên có thể phát triển chương trình một cách tự nhiên, gần gũi với ngôn ngữ tự nhiên
OOP được thực hiện dựa trên nguyên lý kế thừa, trong quá trình thực hiện mô tả các lớp nó có thể phát hiện, loại bỏ đi những chương trình bị lặp lại, dư thừa. Bên cạnh đó thì OOP còn có khả năng sử dụng các lớp mà không cần phải thực hiện lại, nó có thể tự tối ưu code và sử dụng lại một cách có hiệu quả hơn.
OOP đảm bảo rút ngắn thời gian để xây dựng hệ thống, gia tăng năng suất thực hiện
Sự xuất hiện của lớp và đối tượng là đặc trưng tiêu biểu của phương pháp lập trình hướng đối tượng. Giúp giải quyết được các nhược điểm, hạn chế của phương pháp lập trình hướng cấu trúc.
Tính bảo mật cao, khả năng bảo trì, thay đổi chương trình hiệu quả và nhanh chóng hơn
