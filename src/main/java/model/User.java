package model;

import java.time.LocalDateTime;

public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private LocalDateTime registered;
    private Role role;
}
