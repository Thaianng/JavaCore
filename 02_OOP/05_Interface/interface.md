## Interface là gì?
Interface là kiểu dữ liệu tham chiếu trong Java. Nó là tập hợp các phương thức trừu tượng. Khi một class kế thừa interface, thì nó sẽ kế thừa toàn bộ các phương thức trừu tượng của interface đó.    


## Một số quy tắc khi sử dụng interface  
- Interface không có constructor, không thể tạo đối tượng từ interface  
- Tất cả các phương thức của interface đều là abstract  
- Một interface có thể kế thừa từ một interface khác
- Một interface không thể kế thừa từ một lớp
- Sử dụng từ khóa implement để triển khai interface  

## Tạo interface  
**Cú pháp:**  
```java
interface <Tên Interface>{
 //Các thành phần bên trong interface
}
```

**Ví dụ:**  
```java
interface Animal {
    void eat(); 
}
```

```java
public class Cats implements Animal{
    @Override
    public void eat() {
        System.out.println(“Fish"); 
    } 
}
```