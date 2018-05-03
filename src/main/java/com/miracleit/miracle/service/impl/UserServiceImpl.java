package com.miracleit.miracle.service.impl;

import com.miracleit.miracle.model.User;
import com.miracleit.miracle.repository.UserRepository;
import com.miracleit.miracle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    /**
     * {@inheritDoc}
     */

    public User create(User user) {
        return userRepository.save(user);
    }

    public User update(User user) {
        return userRepository.saveAndFlush(user);
    }


    public void delete(User user) {
        userRepository.delete(user);
    }

    public void delete(Long id) {
        userRepository.delete(1L);
    }

    @Override
    public User getOne(Long id) {
        return userRepository.findOne(1L);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}






//        final User user = new User();
//        user.setName("Alex");
//        user.setAge(22);


