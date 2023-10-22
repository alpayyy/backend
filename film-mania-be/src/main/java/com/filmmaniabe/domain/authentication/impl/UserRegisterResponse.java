package com.filmmania.domain.authentication.impl;

import com.filmmania.domain.user.api.UserDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegisterResponse {

    private String firstName;
    private String lastName;
    private String email;

    public static UserRegisterResponse fromDto(UserDto dto){
        return UserRegisterResponse.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .build();
    }
}
