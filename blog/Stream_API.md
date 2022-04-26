Trong bài viết này, chúng ta sẽ tìm hiểu về một trong những chức năng được thêm vào từ phiên bản Java 8 - Stream. Tuy nhiên trước khi tìm hiểu về Stream bạn cần phải có kiến thức về lambda expression, method reference, functional interface  

## Stream API  
Một trong những tính năng mới trong Java 8 chính là Stream - Giúp cho việc thao tác trên collection và array trở nên dễ dàng và tối ưu hóa hơn  

### Tạo Stream  
Stream có thể tạo từ collection hoặc mảng bằng các sử dụng các phương thức `stream()` hoặc `of()`  
Ví dụ:  

***Tạo Stream từ array bằng cách sử dụng `Arrays.stream()` hoặc `Stream.of()`***
```java
String[] arr= {"a", "b","c"};
Stream<String> stream = Arrays.stream(arr);
```

Hoặc
```java
String[] arr= {"a", "b","c"};
Stream<String> stream = Stream.of(arr);
```

***Tạo Stream từ collection***
```java
List<String> list = Arrays.asList("a","b","c");
Stream<String> stream = list.stream();
```

### Multi-threading với Stream
Stream API cũng đơn giản hóa multi-threading bằng cách sử dụng phương thức `parallelStream()`  

```java
list.parallelStream().forEach(element -> element.doSomeThing());
```

## Thực hành với Stream
Có nhiều toán tử hữu ích có thể được sử dụng với Stream. Chúng được chia thành **intermediate operations** (trả về Stream<T>) và **terminal operations** (trả về kết quả của kiểu xác định)  
Lưu ý: CÁc hoạt động mà chúng ta thực hiện trên Collection, mảng hay bất kỳ nguồn dữ liệu nào khác sẽ không làm thay đổi dữ liệu ban đầu, chúng chỉ trả stream mới.  

Ví dụ:  
```java
long count = list.stream().distinct().count();
```
Phương thức `distinct()` sẽ tạo ra một stream mới với các phần tử là duy nhất (unique) của luồng trước đó. Phương thức `count()` sẽ trả về kích thước của luồng  

### Thay thế cho vòng lặp  
Stream API giúp thay thế các vòng lặp `for`, `for each` và `while`. Xem ví dụ dưới đây: 

```java
for (String string : list) {
    if (string.contains("a")) {
        return true;
    }
}
```
Đoạn code trên có thể được thay đổi khi sử dụng Stream API như sau:  
```java
boolean isExist = list.stream().anyMatch(element -> element.contains("a"));
```

### Lọc dữ liệu với `filter()`
Với phương thức `filter()` giúp loaih bỏ các phần tử dựa theo tiêu chí nhất định:  

```java
List<String> list = Arrays.asList("Java", "JS", "HTML","PHP", "C");
list.stream().filter(e -> e.contains("J")).forEach(System.out::println);
```  
Với ví dụ trên, mình đang thực hiện tìm các phần tử có chưa *"J"* 


### Ánh xạ với `map()`
Stream cung cấp phương thức `map()` giúp ánh xạ phần tử tới các kết quả tương ứng  

```java
list.stream().map(String::toLowerCase).forEach(System.out::println);
```


### `anyMatch()`, `allMatch()` và `noneMatch()`
Stream API cung cấp các phương thức `anyMatch()`, `allMatch()` và `noneMatch()` sẽ trả về giá trị kiểu `boolean`. Ngay cái tên của 3 phương thức này đã cho chúng ta thấy chức năng của nó.  
```java
boolean anyMatch = list.stream().anyMatch(element -> element.contains("a")); // true
boolean allMatch = list.stream().allMatch(element -> element.contains("a")); // false
boolean noneMatch = list.stream().noneMatch(element -> element.contains("a")); // false
```

### `reduce()`  
Phương thức `reduce()` kết hợp các phần tử luồng thành một bằng cách sử dụng một BinaryOperator  
Ví dụ:  
```java
List<Integer> integers = Arrays.asList(1, 1, 1);
Integer reduced = integers.stream().reduce(23, (a, b) -> a + b); //26
``` 
Với ví dụ trên mình muốn tính tổng tất cả các phần tử với 1 số nguyên ban đầu (số 23). Vì vậy đoạn code trên sẽ trả về kết quả là 26  

### Thu thập kết quả Stream sang một Collection với `collect()`  
`collect()` rất tiện dụng trong trường hợp cần chuyển đổi Stream thành Collection và biểu diễn stream dưới dạng `String`  

```java
Stream<String> stream = Stream.of("Java", "JS", "HTML","PHP", "C");
List<String> resultList = stream.map(String::toLowerCase).collect(Collectors.toList());
```


Mục tiêu của bài viết nay chỉ là giới thiệu nhanh về Stream. 
Ngoài các phương thức trên Stream còn cung cấp rất nhiều phương thức khác như `min()`, `max()`, `skip()`, `limit()`,... mà chúng ta sẽ tìm hiểu trong các bài viết sau.    





