Đây là cơ chế được sử dụng để chuyển kiểu đối với kiểu dữ liệu tham chiếu  

## Upcasting
Đây là cơ chế được sử dụng để chuyển kiểu đối với kiểu dữ liệu tham chiếu   
*Ví dụ:*  
```java
Parent p = new Child();
```

Đối với upcasting, chúng ta hoàn toàn có thể sử dụng chuyển kiểu tường mình hoặc không tường minh, cả hai cách đều được chấp nhận.

## Downcasting   
Khác với upcasting, Downcasting là dạng chuyển kiểu chuyển 1 đối tượng là một thể hiện của lớp cha xuống thành đối tượng là thể hiện của lớp con trong quan hệ kế thừa. 
*Ví dụ:*  
```java
Parent p = new Child();
Child c = (Child) p;
```

***Lưu ý***: khi thực hiện downcasting có thể sẽ gặp lỗi ClassCastException nếu không thể thực hiện downcassting được. Để an toàn chúng ta nên kiểm tra một đối tượng có phải là thể hiện của một kiểu dữ liệu cụ thể không trước khi thực hiện downcasting.