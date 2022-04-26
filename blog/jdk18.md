# Có gì mới trong JDK 18
Java Development Kit (JDK) 18 hiện đã có sẵn dưới dạng bản phát hành sản xuất chính thức được ra mắt ngày 22/3/2022. Hãy cũng khám phá xem có gì mới trong phiên bản này.  

## 1. Không chấp nhận Finalization cho quá trình removal

`Finalizer` có các sai sót gây ra các vấn đê nghiệm trọng trong thế giơi thực về bảo mật, hiệu suất, độ tin cây và khả năng bảo trì. Nó cũng là một mô hình lập trình khó. `Finalization` được bật theo mặc định ngay bây giờ nhưng có thể bị tắt để tạo điều kiện cho quá trình thử nghiệm sớm. Nó sẽ bị tắt theo mặc định trong bản phát hành tính năng và bị xóa hoàn toàn trong bản phát hành sau.  

Đề xuất yêu cầu một tùy chọn dòng lệnh để vô hiệu hóa `finalization` và ngừng sử dụng tất cả các `finalizers` và phương thức `finalization` trong Java API tiêu chuẩn. Các mục tiêu của đề xuất bao gồm giúp các nhà phát triển hiểu được sự nguy hiểm của `finalization`, chuẩn bị cho các nhà phát triển trước việc loại bỏ cuối cùng của nó và cung cấp các công cụ đơn giản để giúp phát hiện sự phụ thuộc vào  `finalization`

Được giới thiệu trong Java 1.0, việc hoàn thiện nhằm giúp tránh rò rỉ tài nguyên. Một lớp có thể khai báo một `finalizer` - phương thức `protected void finalize()`- cơ quan giải phóng bất kỳ tài nguyên cơ bản nào. Bộ thu gom rác sẽ lên lịch `finalizer` của một đối tượng không thể truy cập được sẽ được gọi trước khi nó lấy lại bộ nhớ đối tượng; Đến lượt nó, phương thức `finalize()` có thể thực hiện các hành động chẳng hạn như gọi đối tượng của `close`. 

Do các vấn đề với quá trình hoàn thiện, các nhà phát triển nên sử dụng các kỹ thuật thay thế để tránh rò rỉ tài nguyên, cụ thể là các câu lệnh thử với tài nguyên và trình dọn dẹp.  

## 2. Internet Address Resolution  

Đối với `Internet-address resolution SPI`, đề xuất là xác định SPI cho độ phân giải địa chỉ máy chủ và tên để Inet. Address có thể sử dụng các bộ phân giải khác với bộ phân giải tích hợp sẵn của nền tảng. Động lực cho nỗ lực này bao gồm việc kích hoạt tốt hơn Project Loom, cho các mô hình lập trình hiện thời và mới trong Java, cùng với việc tích hợp các giao thức mạng mới, tùy chỉnh và cho phép thử nghiệm. Đề xuất không liên quan đến việc phát triển một trình phân giải thay thế cho JDK.  

## 3. Pattern Matching for Switch  

Trong bản preview thứ hai của Pattern Matching for Switch, trong đó ngôn ngữ Java sẽ được cải tiến với đối sánh mẫu cho các switch biểu thức và câu lệnh, cùng với các phần mở rộng cho ngôn ngữ của các mẫu. Điều này đã được xem trước trong JDK 17 . Mở rộng đối sánh mẫu để switch cho phép một biểu thức được kiểm tra dựa trên một số mẫu, mỗi mẫu có một hành động cụ thể, do đó, các truy vấn hướng dữ liệu phức tạp có thể được thể hiện một cách ngắn gọn và an toàn.

## 4. Reimplementation of core reflection with method handles 

Việc thực hiện lại phản xạ lõi với các chốt phương thức sẽ thực hiện lại `lang.reflect.Method` và `Constructor` và `Field` trên đầu các phương thức xử lý `java.lang.invoke`. Có các phương thức xử lý đóng vai trò là cơ chế cơ bản để phản ánh sẽ giảm chi phí bảo trì và phát triển của cả API `java.lang.reflect` và `java.lang.invoke`.

## 5. Simple web server proposal
Với đề xuất máy chủ web đơn giản, một command-line sẽ được cung cấp để khởi động một máy chủ web tối thiểu chỉ phục vụ các tệp tĩnh. Không có CGI hoặc chức năng giống như servlet nào. Công cụ này sẽ hữu ích cho việc tạo mẫu, mã hóa đặc biệt và thử nghiệm, đặc biệt là trong các bối cảnh giáo dục. 

Các mục tiêu của kế hoạch bao gồm cung cấp máy chủ tệp HTTP tĩnh ngoài hộp với thiết lập dễ dàng và chức năng tối thiểu, giảm năng lượng kích hoạt của nhà phát triển và làm cho JDK dễ tiếp cận hơn và cung cấp triển khai mặc định thông qua dòng lệnh cùng với một API nhỏ để tạo và tùy chỉnh có lập trình.  

## 6. Foreign function và memory API  
Một API được giới thiệu qua đó các chương trình Java có thể tương tác với mã và dữ liệu bên ngoài thời gian chạy Java. Bằng cách gọi các hàm ngoại - mã bên ngoài JVM - và bằng cách truy cập an toàn vào bộ nhớ ngoại - bộ nhớ không được quản lý bởi JVM - API cho phép các chương trình Java gọi các thư viện gốc và xử lý dữ liệu gốc mà không có sự nguy hiểm và dễ vỡ của JNI (Java Native Interface). 

Mục đích là thay thế JNI bằng một mô hình phát triển Java thuần túy, ưu việt hơn. API này được ấp ủ trong JDK 17. Đối với JDK 18, các cải tiến sẽ được kết hợp dựa trên phản hồi, chẳng hạn như hỗ trợ cho nhiều nhà cung cấp dịch vụ hơn như Boolean và MemoryAddress trong các chốt var truy cập bộ nhớ và một API mới để sao chép mảng Java vào và từ bộ nhớ các phân đoạn.  

## 7. API vector  
Đề xuất này sẽ thể hiện các phép tính vector biên dịch tại lúc runtime thành các lệnh vector tối ưu trên các kiến ​​trúc CPU được hỗ trợ, đạt được hiệu suất vượt trội so với các phép tính vô hướng tương đương. 

Các hoạt động vector thể hiện mức độ song song cho phép thực hiện nhiều công việc hơn trên một chu kỳ CPU, do đó tạo ra những cải tiến hiệu suất đáng kể. 

API vector bất khả trị nền tảng nhằm mục đích cung cấp cách viết các thuật toán phức tạp trong Java, sử dụng công cụ vẽ vector tự động HotSpot hiện có nhưng với mô hình người dùng giúp vector hóa dễ đoán hơn.

 JDK 18 cũng sẽ hỗ trợ thêm cho nền tảng ARM Scalar Vector Extension và cải thiện hiệu suất của các hoạt động vector chấp nhận mặt nạ trên các kiến ​​trúc hỗ trợ tạo mặt nạ trong phần cứng.  

 ## 8. Chỉ định UTF-8 làm bộ ký tự mặc định của các Java API tiêu chuẩn
UTF-8 là một mã hóa ký tự có độ rộng thay đổi cho giao tiếp điện tử và được coi là bộ ký tự tiêu chuẩn của web. Charset là mã hóa ký tự có khả năng mã hóa tất cả các ký tự trên web. 

Thông qua thay đổi này, các API phụ thuộc vào bộ ký tự mặc định sẽ hoạt động nhất quán trên tất cả các triển khai, hệ điều hành, ngôn ngữ và cấu hình. Đề xuất không nhằm xác định các API mới theo tiêu chuẩn Java hoặc JDK cụ thể. 

Những người ủng hộ đề xuất hy vọng rằng các ứng dụng trong nhiều môi trường sẽ không bị ảnh hưởng bởi sự lựa chọn UTF-8 của Java, vì MacOS, nhiều bản phân phối Linux và nhiều ứng dụng máy chủ đã hỗ trợ UTF-8. Tuy nhiên, có rủi ro trong các môi trường khác, rõ ràng nhất là các ứng dụng phụ thuộc vào bộ mã mặc định sẽ hoạt động không chính xác khi xử lý dữ liệu được tạo ra khi bộ mã mặc định không được chỉ định.  

## 9. Code Snippets 
Các đoạn mã trong tài liệu API Java , liên quan đến việc giới thiệu thẻ `@snippet` cho JavaDoc’s Standard Doclet, để đơn giản hóa việc đưa mã nguồn mẫu vào tài liệu API. 

Trong số các mục tiêu của kế hoạch là tạo điều kiện thuận lợi cho việc xác thực các đoạn mã nguồn bằng cách cung cấp quyền truy cập API vào các đoạn đó. Mặc dù tính đúng đắn là trách nhiệm của tác giả, hỗ trợ nâng cao trong JavaDoc và các công cụ liên quan có thể giúp bạn đạt được điều đó dễ dàng hơn.   

Mặc dù JDK 18 là một bản phát hành không phải LTS (Hỗ trợ dài hạn) chỉ được hỗ trợ sáu tháng, nhưng vẫn mang một số thay đổi chất lượng. Các bản phát hành LTS sẽ ra mắt hai năm một lần, với bản tiếp theo, JDK 21, sẽ ra mắt vào tháng 9 năm 2023. Tiếp theo JDK 18, JDK 19 sẽ ra mắt vào tháng 9 này. Hãy cùng chờ đợi có gì cập nhật trong bản JDK 19 nhé