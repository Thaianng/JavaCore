## Enum là gì?  
Enum là một từ khóa trong Java, nó là kiểu dữ liệu đặc biệt được sử dụng để đại diện cho hằng số cố định.  
Một Enum có thể chứa các thuộc tính, phương thức và constructor (hàm tạo - sẽ được tìm hiểu trong các bài sau)  
Nởi vi các giá trị của enum là hằng số nên tên của các trường thường là các chữ cái in hoa    
Ví dụ:  
Tạo enum `Season` chứa 4 mùa trong năm: 
```java
public enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;
}
```

Tại `Main` :
```java
public class Main {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        System.out.println(season);
    }
}
```

Kết quả trả về:  
```
AUTUMN
```

## Khai báo enum  
Trong Java, enum có thể được định nghĩa bên trong class hoặc bên ngoài một class ví nó tương tự như lớp trong Java  

### Enum bên trong một class
```java
public class EnumExample {
  enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;
  }

  public static void main(String[] args) {
    Season season = Season.WINTER;
    System.out.println(season);
  }
}
```  
Kết quả thực thi:  
```
WINTER
```
<br>

### Enum bên ngoài một class  

```java
enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;
}
public class EnumExample {
  public static void main(String[] args) {
    Season season = Season.WINTER;
    System.out.println(season)
  }
}
```  

Kết quả thực thi:  
```
WINTER
```
<br>

### Enum với switch case
```java
enum Season {
  SPRING, SUMMER, AUTUMN, WINTER;
}

public class Main {
  public static void main(String[] args) {
    Season season = Season.WINTER;

    switch(season) {
      case SPRING:
        System.out.println("Spring");
        break;
      case SUMMER:
         System.out.println("Summer");
        break;
      case AUTUMN:
        System.out.println("Autumn");
        break;
      case WINTER:
        System.out.println("Winter");
        break;
    }
  }
}
```

Kết quả thực thi:  
```
WINTER
```  

<br>

### Enum với For Each  
Enum có phương thức `values()`, phương thức này trả về một mảng gồm tất cả cá hằng số enum. Phương thức này được sử dụng khi bạn muốn lặp các hằng số của một enum.  

```java
for (Season season : Season.values()) {
  System.out.println(season);
}
```

Kết quả thực thi:  
```
SPRING
SUMMER
AUTUMN
WINTER
```
<br>

### So sánh các phần tử Java enum  
Enum là một đối tượng tham chiếu giống như class, interface nhưng nó cũng có thể sử dụng toán tử so sánh `==` hoặc phương thức `equals()` để so sánh các phần tử trong enum  
```java
public class EnumExample {
  enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;
  }

  public static void main(String[] args) {
    Season season = Season.WINTER;

    // use equal() method
    if (season.equals(Season.WINTER)) {
        System.out.println("Winter");
    } else {
        System.out.println("Other season");
    }

    // use == operator
    if (season == Season.WINTER) {
        System.out.println("Winter");
    } else {
        System.out.println("Other season");
    }
  }
}
```

Kết quả thực thi:

```
Winter
Winter
```