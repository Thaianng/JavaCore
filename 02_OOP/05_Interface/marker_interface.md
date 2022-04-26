## Marker interface
Marker interface (Tagging interface) là một interface không có bất kỳ phương thức và thuộc tính nào bên trong nó. Nó cung cấp thông tin runtime type về object, vì vậy compiler và JVM có thêm thông tin về đối tượng để thực hiện một số hoạt động hữu ích.  

## Một số marker interface  
Một số marker interface hiện có trong (built-in) Java: `java.io.Serializable`, `java.lang.Cloneable`, `java.rmi.Remote`, `java.util.RandomAccess`, `java.util.EventListener`, …  

- `java.io.Serializable` được sử dụng để đánh dấu đối tượng Serialize. Khi chúng ta gọi phương thức `ObjectOutputStream.writeObject()`, JVM sẽ kiểm tra đối tượng có implement một marker interface `Serializable` hay không. Nếu không, sẽ throw một exception `NotSerializableException`. Vì vậy đối tượng sẽ không được Serialize sang output stream object.

- `java.lang.Cloneable` là một marker interface để nói với JVM rằng, đối tượng có thể call `Object.clone()` method. Nếu chúng ta thực hiện clone một object mà không được implement một marker interface `Clonable`, thì sẽ gặp một exception `CloneNotSupportedException`.  

## Khi nào nên sử dụng marker interface  
Có hai mục đích thiết kế chủ yếu của marker interface là:  
- Tạo một cha chung: Như với `EventListener` interface, mà được kế thừa bởi hàng tá các interface khác trong Java API, bạn có thể sử dụng một tagging interface để tạo một cha chung cho một nhóm interface. Ví dụ, khi một interface kế thừa `EventListener`, thì JVM biết rằng interface cụ thể này đang được sử dụng trong một event.
- Thêm một kiểu dữ liệu tới một class: Đó là khái niệm tagging. Một class mà triển khai một tagging interface không cần định nghĩa bất kỳ phương thức nào, nhưng class trở thành một kiểu interface thông qua tính đa hình (polymorphism).
- Thực hiện một số pre-processing trên các class, đặc biệt hữu dụng để phát triển các API và Framework giống như Sping, Struts.
- Giúp cho code coverage và build tools để find bug dựa trên một behavior cụ thể của marker interface.