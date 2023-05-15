package com.apistoreup.ApiStoreUp.repositorys;

import com.apistoreup.ApiStoreUp.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {
    UserModel findByEmail(String email);
}
