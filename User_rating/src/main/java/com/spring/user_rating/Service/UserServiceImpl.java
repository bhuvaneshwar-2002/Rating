package com.spring.user_rating.Service;

import com.spring.user_rating.Dto.Userdto;
import com.spring.user_rating.Repository.UserRepos;
import com.spring.user_rating.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
   private UserRepos userRepos;
    @Override
    public UserModel save(Userdto userdto) {
        UserModel userModel = new UserModel(userdto.getMovieName(), userdto.getRating());
        return userRepos.save(userModel);
    }
}
