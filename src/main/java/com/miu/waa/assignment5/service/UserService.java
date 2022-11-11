package com.miu.waa.assignment5.service;



import com.miu.waa.assignment5.domain.Post;
import com.miu.waa.assignment5.domain.User;
import com.miu.waa.assignment5.domain.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAll();
    UserDto getById(long id);
    void save(User user);
    List<Post> getAllPostByPostId(long id);
    List<UserDto> getUserWithMorePostThanNum(int num);
    void deleteById(long id);
}
