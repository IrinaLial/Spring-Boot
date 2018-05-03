package com.miracleit.miracle.service;

import com.miracleit.miracle.model.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserService {
    /**
     *
     * @return instance of {@link User}
     */

     User getOne(Long id);
     User create(User user);
     User update(User user);
     void delete(User user);
     void delete(Long id);

    /**
     *
     * @return list of users;
     */

    public List<User> getAll();

}
