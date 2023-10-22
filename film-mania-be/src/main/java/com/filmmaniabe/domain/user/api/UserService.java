package com.filmmania.domain.user.api;

import java.util.List;

public interface UserService {
    UserDto getUserById(String id);
    UserDto updateUser(String id, UserDto dto);
    UserDto getAuthenticateUser();
    UserDto addFriend(String id);
    void removeFriend(String id);

    UserDto createUser(UserDto userDto);
    UserDto getUserByEmail(String email);
    List<UserFriendsDto> getMyFriends();
    UserDto addMoney(String id, Double money);
    List<UserFriendsDto> getAllUser();
}
