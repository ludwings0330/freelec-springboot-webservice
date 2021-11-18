package com.ludwings.book.springboot.config.auth.dto;

import com.ludwings.book.springboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(String name, String email, String picture) {
        this.name = name;
        this.email = email;
        this.picture = picture;
    }

    public SessionUser(User user) {
        this(user.getName(), user.getEmail(), user.getPicture());
    }
}
