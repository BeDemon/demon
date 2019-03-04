package com.example.mappers;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User getById(String userId);

    public int insertUser(User user);

    public List<User> getUsersByOrder();

    public List<User> getUsersByLevel(int userLevel);

    public int updateUser(User user);

    public int deleteUser(String userId);

    public int deleteAllUsers();
}