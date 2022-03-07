package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    @Override
    public String toString() {
        return id + " - " + username + " - " + password + " - " + email;
    }
}
