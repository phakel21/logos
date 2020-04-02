package com.Rpg.repository;

import com.Rpg.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByNickName(String userName);

    Integer countByNickName(String nickName);

}
