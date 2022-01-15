# Phạm vi truy cập  
Phạm vi truy cập (Access modifiers) là xác định độ truy cập phạm vi vào dữ liệu của các thuộc tính, phương thức hoặc class.  
 
# Các loại phạm vi truy cập  
Có 4 loại phạm vi truy cập:  
- `private`
- `default`
- `protected`
- `public`


![image](../image/access_modifiers.png)  

![image](../image/access_modifiers-_1.png)

## private  

Private xác định phạm vi truy cập nội bộ một class. Chỉ có thể sử dụng `private` với constructor, biến và phương thức.  

Ví dụ: Cho thuộc tính `name` của class Animal có phạm vi truy cập là `private`, thì chỉ có thể truy cập `name` trong class `Animal`. Nhưng nếu truy cập vào biến `name` từ class `Main` thì ngay lập tức bị lỗi

![image](../image/private.png)


## protected

Protected là phạm vi truy cập có thể từ trong và ngoài `package`, nhưng phải thông qua tính kế thừa