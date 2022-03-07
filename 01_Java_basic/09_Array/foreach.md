## for each 
Vòng lặp `for each` hay còn được gọi là `enhanced for`, xuất hiện từ phiên bản Java 5  
Nó chủ yếu được sử dụng để duyệt mảng hoặc collection. Nó giúp chúng ta duyệt các phần tử trong mảng hay collection mà không cần tới chỉ số của các phần tử đó

Ví dụ:
```java
String[] names = {"Chris", "Emma", "John", "Robert"};
for(String name: names){
    System.out.println(name);
}
```

Kết quả:
```
Chris
Emma
John
Robert
```

## Ưu điểm và nhược điểm của for each
Mỗi vòng lặp trong Java được thiết kế với mục đích riêng và nó có ưu nhược điểm khác nhau trong từng trường hợp  
**Ưu điểm**   
- Làm cho code dễ đọc hơn
- Giảm bớt khả năng lỗi khi lập trình  

**Nhược điểm**
- Không thể sử dụng `for each` để chỉnh sửa mảng, mà chỉ dùng để duyệt qua tất cả các phần tử trong mảng  
- Không thể tìm được vị trí phần tử trong mảng
- Chỉ có thể duyệt xuôi  
