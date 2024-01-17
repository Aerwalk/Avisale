package com.aero.aviasale.repository;

import com.aero.aviasale.domain.entity.UserProfiles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfilesRepository extends JpaRepository<UserProfiles, Long> {

}
