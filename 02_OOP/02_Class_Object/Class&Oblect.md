# Lớp và đối tượng
Java là ngôn ngữ lập trình hướng đối tượng vì vậy, Java hỗ trợ những khái niệm cơ bản của hướng đối tượng như: lớp, đối tượng, thuộc tính, phương thức,… và có những đặc điểm đặc trưng của lập trình hướng đối tượng (4 nguyên lý cơ bản). 

## Đối tượng (Object)
Đối tượng là khái niệm cơ sở, quan trọng nhất của cách tiếp cận hướng đối tượng. Đối tượng là thực thể của hệ thống, của CSDL và được xác định thông qua định danh ID của chúng 
Đối tượng là một thực thể mang tính vật lý. Nó bao gồm các đặc trưng sau:
![image.png](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/N3tJpg5X)

Trong đó:  
- **Trạng thái**: Là những thông tin của đối tượng, như: Con người có tên, tuổi, địa chỉ,...  
- **Hành vi**: Là các thao tác, hoạt động của một đối tượng, như: Con người có thể đi học, đi làm, ăn uống,...

## Lớp (Class)
Lớp là tập hợp các đối tượng có cùng trạng thái, hành vi hay là một nhóm các đối tượng có các thuộc tính chung  

![image.png](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/gtcZbMnV)  

Một lớp trong Java có thể chứa:  
- Thành viên dữ liệu 
- Constructor
- Phương thức
- khối lệnh
- Lớp và interface

## So sánh lớp và đối tượng
| Đối tượng | Lớp |
| --- | --- |
| Đối tượng là thực thể trong thế giới thực: Con người, xe cộ, nhà cửa,... | Lớp gồm một nhóm các đối tượng tương tự nhau |
| Mang tính vật lý | Mang tính logic |
| Có thể tạo nhiều lần | Được khai báo một lần duy nhất |
| Đối tượng được cấp bộ nhớ khi nó được tạo ra | Lớp không được cấp bộ nhớ khi nó được tạo ra |  
| Có nhiều cách để tạo ra một đối tượng trong Java | Chỉ có một cách để định nghĩa lớp trong Java là sử dụng từ khóa class |

## Tạo lớp và đối tượng
**Cú pháp tạo lớp trong Java:**    
```java
<access modifies> class <Tên class>{

}
```

Ví dụ: Tạo lớp liên quan tới con người, gồm 2 thuộc tính là tên, tuổi và có 2 phương thức `eat()`  và `study()`    
```java
public class Person {
    public String name;
    public int age;
    
    public void eat(){
        System.out.println("Method eat() is called!!!");
    }
    
    public void study(String subject){
        System.out.println("Method study() is called!!!");
        System.out.println(subject);
    }
}
```


**Cú pháp tạo đối tượng:**  
```java
<Tên class> <Tên biến tham chiếu> = new <Tên Class>();  
```

Gán giá trị cho thuộc tính:  
```java
<Tên biến tham chiếu>.<Thuộc tính> = <Giá trị>;  
```

Gọi phương thức:  
```java
<Tên biến tham chiếu>.<Tên phương thức>(<Các tham số>);
```

Ví dụ: Thực hiện tạo đối tượng với class Person đã tạo trong phần **Tạo lớp**  

```java
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Ngọc";
        person.age = 25;

        System.out.println(person.name + " - " + person.age);

        person.eat();
        person.study("Java");
    }
}
```

# Constructor
Constructor trong Java là một phương thức đặc biệt được sử dụng để khởi tạo các đối tượng. Constructor được gọi khi mộ đối tượng của một lớp được tạo. Nó có thể được sử dụng để đặt các giá trị ban đầu cho các thuộc tính của đối tượng  
Quy tắc chính của các constructor là chúng có cùng tên như lớp đó  

Có 2 loại constructor:  
- **Constructor mặc định**: Là constructor không có tham số, nhằm mục đích cung cấp giá trị mặc định cho các đối tượng như 0, null,... tùy thuộc vào kiểu dữ liệu  

- **Constructor có tham số**: Được sử dụng để cung cấp các giá trị khác nhau cho các đối tượng riêng biệt  


Cú pháp tạo constructor:
```java  
<Access modifiers> <Tên lớp> (<Tham số truyền vào>){

}
```

Ví dụ: Vẫn với class Person, mình thực hiện tạo 2 constructor  
```java
public class Person {
    public String name;
    public int age;

    //Constructor mặc định
    public Person() {
    }

    //Constructor có tham số
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```
Sử dụng constructor:  
```java
public class Main {
    public static void main(String[] args) {
        //Tạo đối tượng với constructor mặc định
        Person ngoc = new Person(); 
        ngoc.name = "Ngọc";
        ngoc.age = 25;
        
        //Tạo đối tượng với constructor có tham số
        Person linh = new Person("Linh", 21);
    }
}
```

# Từ khóa static
Từ khoá `static` trong java được sử dụng để quản lý bộ nhớ. Chúng ta có thể áp dụng từ khoá `static` với các biến, các phương thức, khối và các lớp được lặp

**Biến static trong java**

Khi khai báo một biến là `static`, thì biến đó là biến tĩnh hay biến `static`. Ta có thể sử dụng biến này mà không cầ khởi tạo đối tượng.  

Biến `static` được sử dụng để tham chiếu thuộc tính chung của tất cả đối tượng. 

Ví dụ: Tên trường học của các sinh viên
```java
public static String school = "TechMaster";
```

Sử dụng biến static giúp tiết kiệm bộ nhớ hơn

**Phương thức static trong java**

Nếu bạn áp dụng từ khoá `static` với bất cứ phương thức nào, thì phương thức đó được gọi là phương thức `static`

Một phương thức `static` thuộc lớp chứ không phải đối tượng của lớp.

Một phương thức `static` có thể được triệu hồi mà không cần tạo một instance của một lớp.

Phương thức `static` có thể truy cập thành viên dữ liệu `static` và có thể thay đổi giá trị của nó.

Tuy nhiên, phương thức `static` không thể sử dụng biến `non-static` hoặc gọi trực tiếp phương thức `non-static`. Từ khoá `this` và `super` không thể sử dụng trong ngữ cảnh `static`

Ví dụ:  
```java
public static void change(){
    school = "CNTT";
}
```
Khi gọi phương thức `static`:  
```java
Person.change();
```


**Khối static trong java**

Khối `static` trong java được sử dụng để khởi tạo thành viên dữ liệu `static`. Nó được thực thi trước phương thức main tại lúc tải lớp

```java
static{
    System.out.println("Khối static");
}
```

# Từ khóa this  

Từ khóa `this` đề cập tới một đối tượng hiện tại trong một phương thức hoặc constructor  
Thông thường, từ khóa `this` nhằm loại bỏ sự nhầm lẫn giữa các thuộc tính và các tham số có cùng tên. Ngoài ra từ khóa `this` còn được sử dụng để:  
- Gọi constructor của lớp hiện tại  
- Gọi phương thức của lớp hiện tại  
- Trả về đối tượng của lớp hiện tại  
- Truyền một đối số trong lệnh gọi phương thức
- Truyền một đối số trong lời gọi constructor