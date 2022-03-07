package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Post {
    private int id;
    private String title;
    private String description;
    private String thumbnail;
    private Date createAt;

    @Override
    public String toString() {
        return id + " - " + title + " - " + description + " - " + thumbnail + " - " + createAt;
    }
}
