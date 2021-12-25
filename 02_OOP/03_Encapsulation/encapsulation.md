# Tính đóng gói là gì? 

Sự đóng gói là cơ chế ràng buộc dữ liệu và thao tác trên dữ liệu đó thành một thể thống nhất, tránh được các tác động bất ngờ từ bên ngoài  

Trong Object Oriented Software Engineering của Ivar Jacibson, tất cả các thông tin của một hệ thống định hướng đối tượng được lưu trữ bên trong đối tượng của nó và chỉ có thể hành động khi các đối tượng đó được ra lệnh thực hiện các thao tác. Như vậy sự đóng gói không chỉ đơn thuận là sự gom chung dữ liệu và chương trình vào trong một khối, chúng còn được hiểu theo nghĩa là sự đồng nhất giữa dữ liệu và các thao tác tác động lên dữ liệu đó.  

Tính chất đóng gói là kỹ thuật tạo một trường của lớp private và cung cấp khả năng truy cập trường này qua các phương thức public. Nếu một trường được khai báo là private, nó không thể được truy cập bởi bên ngoài lớp, do đó có thể che dấu các trường có lớp này. Vì lý do này, tính đóng gói được ám chỉ như việc dấu dữ liệu (data hiding).  

Tính đóng gói có những đặc điểm như sau:
- Tạo ra cơ chế để ngăn ngừa việc gọi phương thức của lớp này tác động hay truy xuất dữ liệu của đối tượng thuộc về lớp khác.
- Dữ liệu riêng của mỗi đối tượng được bảo vệ khỏi sự truy xuất không hợp lệ từ bên ngoài.
- Người lập trình có thể dựa vào cơ chế này để ngăn ngừa việc gán giá trị không hợp lệ vào thành phần dữ liệu của mỗi đối tượng.
- Cho phép thay đổi cấu trúc bên trong của một lớp mà không làm ảnh hưởng đến những lớp bên ngoài có sử dụng lớp đó.

Để cài đặt tính đóng gói, chúng ta thực hiện như sau:
- Tạo các thành viên dữ liệu của lớp là private để các lớp khác không thể truy cập được.
- Sử dụng các phương thức `getter/setter` có phạm vi truy cập là public để truy cập và sửa đổi các giá trị của thuộc tính trong lớp.

# Getter & Setter

`Getter` và `Setter` là hai phương thức sử dụng để lấy ra hoặc cập nhật giá trị thuộc tính, đặc biệt dành cho thuộc tính ở phạm vi private.  

**Phương thức Getter** là phương thức truy cập vào thuộc tính của đối tượng và trả về các thuộc tính của đối tượng.  

Cú pháp phương thức `Getter`:  
```java
<Access modifiers> void set<Tên thuộc tính> (<Tham số giá trị mới>){
    this.<Tên thuộc tính> = <Tham số giá trị mới>;
}
```

**Phương thức Setter** là phương thức truy cập vào thuộc tính của đối tượng và gán giá trị cho các thuộc tính của đối tượng đó  

Cú pháp phương thức `Setter`: 
```java
<Access modifiers> <Kiểu dữ liệu thuộc tính> get<Tên thuộc tính>(){
    return this.<Tên thuộc tính>;
}
```  

# Ví dụ
```java
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
```

Tại class Person, các thuộc tính xác định phạm vi truy cập là `private`, sử dung các phương thức `setter` và `getter`  

Tại class Main
```java
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ngọc", 26);
        System.out.println("Kết quả ban đầu:");
        System.out.println(person.getName() + " - " + person.getAge());

        //Cập nhật lại thông tin
        person.setName("Linh");
        person.setAge(20);
        System.out.println("Sau khi cập nhật: ");
        System.out.println(person.getName() + " - " + person.getAge());
    }
}

```

Thay vì gán giá trị có đối tượng bằng các gọi tới tên thuộc tính thì mình sử dụng các phương thức `setter` để cập nhật lại tên và tuổi, và lấy ra dữ liệu bằng cách gọi tới các phương thức `getter`  

Kết quả trả về:  
```
Kết quả ban đầu:
Ngọc - 26
Sau khi cập nhật: 
Linh - 20
```


