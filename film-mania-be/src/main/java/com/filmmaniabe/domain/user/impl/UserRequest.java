package com.filmmania.domain.user.impl;

import com.filmmania.domain.user.api.UserDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequest {

    private String firstName;
    private String lastName;
    private String email;

    public UserDto toDto(){
        return UserDto.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .build();
    }

}
