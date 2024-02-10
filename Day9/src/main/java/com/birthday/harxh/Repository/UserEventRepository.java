package com.birthday.harxh.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.birthday.harxh.models.UserEvent;

@SuppressWarnings("null")
public interface UserEventRepository extends JpaRepository<UserEvent,String> {
    Optional<UserEvent> findById(String eventid);
}