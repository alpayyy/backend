package com.filmmania.domain.authentication.api;

import com.filmmania.domain.authentication.impl.AuthenticationRequest;
import com.filmmania.domain.authentication.impl.AuthenticationResponse;
import com.filmmania.domain.user.api.UserDto;
import com.filmmania.domain.user.api.UserRegisterDto;

public interface AuthenticationService {

    AuthenticationResponse login(AuthenticationRequest request);
    UserDto register(UserRegisterDto dto);

}
