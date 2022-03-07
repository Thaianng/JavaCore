## Từ khóa break
Từ khóa `break` thường được sử dụng để dừng vòng lặp hoặc mệnh đề `switch` tại điều kiện đã được chỉ định.  
Đối với vòng lặp bên trong vòng lặp khác, nó chỉ dừng vòng lặp bên trong đó.  

Ví dụ:
```java
for(int i = 0; i < 10; i++){
    if(i == 5)
        break;
    System.out.print(i+"\t");
}
```

Kết quả nhận được: 
```
0  1  2  3  4
```

## Từ khóa continue
Từ khóa continue được sử dụng để tiếp tục vòng lặp tại điều kiện đã được xác định. Với điều kiện đó, khối lệnh phía sau từ khóa continue sẽ không được thực thi.  
Đối với vòng lặp bên trong vòng lặp khác, continue chỉ có tác dụng với vòng lặp bên trong đó.  

Ví dụ:
```java
for (int  i = 2; i < 10; i++){
     if(i%2 == 0){
          continue;
     }
     System.out.println(i);
} 
```

Kết quả trả về: 
```
3   5   7   9
```