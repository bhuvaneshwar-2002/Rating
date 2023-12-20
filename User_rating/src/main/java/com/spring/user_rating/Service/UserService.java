package com.spring.user_rating.Service;

import com.spring.user_rating.Dto.Userdto;
import com.spring.user_rating.model.UserModel;

public interface UserService {
    UserModel save(Userdto userdto);
}
