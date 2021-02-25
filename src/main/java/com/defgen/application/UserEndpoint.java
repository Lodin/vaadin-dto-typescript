package com.defgen.application;

import com.vaadin.flow.server.connect.Endpoint;
import com.vaadin.flow.server.connect.auth.AnonymousAllowed;

@Endpoint
@AnonymousAllowed
public class UserEndpoint {
    private final UserDTO user;

    public UserEndpoint() {
        this.user = new UserDTO(new User("test", "test"));
    }

    public UserDTO find() {
        return user;
    }
}