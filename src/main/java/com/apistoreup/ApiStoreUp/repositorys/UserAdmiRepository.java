package com.apistoreup.ApiStoreUp.repositorys;


import com.apistoreup.ApiStoreUp.models.UserAdmiModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAdmiRepository extends JpaRepository<UserAdmiModel,Long> {
    UserAdmiModel findByEmail(String email);
}
