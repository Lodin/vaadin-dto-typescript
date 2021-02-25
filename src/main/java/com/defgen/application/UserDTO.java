package com.defgen.application;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDTO {
    @JsonIgnore
    private final User user;

    public UserDTO(User user) {
        this.user = user;
    }

    public String getName() {
        return user.getName();
    }
}