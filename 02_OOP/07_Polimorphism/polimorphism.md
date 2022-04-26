## Tính đa hình  
Đa hình có nghĩa là nhiều dạng, nó xảy ra khi chúng ta có nhiều lớp có liên quan với nhau theo kế thừa.  
Đa hình là một đặc điểm của lập trình hướng đối tượng. Tính đa hình là một tính năng cho phép một giao diện được sử dụng cho một lớp hành động chung.   
Trong java, chúng ta có thể chỉ định một tập hợp các quy trình ngăn xếp chung mà tất cả đều có chung tên. Khái niệm đa hình thường được thể hiện bằng cụm từ - một giao diện, nhiều phương thức. Điều này có nghĩa là có thể thiết kế một giao diện chung cho một nhóm các hoạt động liên quan. Điều này giúp giảm độ phức tạp bằng cách cho phép cùng một giao diện chỉ định một loại hành động chung.  
Tính đa hình cho phép chúng tôi tạo ra một mã sạch, hợp lý, dễ đọc và linh hoạt  
Trong java, có hai loại đa hình:  
- Đa hình lúc compile-time (liên kết tĩnh)
- Đa hình lúc runtime (liên kết động)

Nạp chồng phương thức là một ví dụ về đa hình tĩnh, còn ghi đè phương thức là một ví dụ về đa hình động

## Đa hình lúc compile-time
Đa hình lúc complile-time còn được gọi là đa hình tĩnh. Trong đa hình lúc compile-time, bất cứ điều gì lúc nó thực hiện đều được thực hiện tại thời điểm biên dịch  
Đa hình lúc compile-time được thực hiện bằng cách nạp chồng toán tử và nạp chồng hàm. Trong đa hình tĩnh, một trong những cách triển khai phổ biến nhất là nạp chồng phương thức  

## Đa hình lúc runtime  
Đa hình lúc runtime còn được gọi là đa hình động. Trong java, đa hình động được giải quyết bằng sử dụng ghi đè phương thức.  
Trong ghi đè phương thức, phương thức trong lớp cha có thể xác định lại hoặc ghi đè trong lớp con. Khi phương thức bị ghi đè trong lớp con thì kỹ thuật điều phối phương thức động có thể xác định lệnh gọi phương thức bị ghi đè tại thời gian chạy


  