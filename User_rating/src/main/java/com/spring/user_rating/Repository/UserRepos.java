package com.spring.user_rating.Repository;

import com.spring.user_rating.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepos extends JpaRepository<UserModel,Long> {
    
}
