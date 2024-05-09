package com.hoangtien2k3.profileservice.repository;

import com.hoangtien2k3.profileservice.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<UserProfile, String> {

}
