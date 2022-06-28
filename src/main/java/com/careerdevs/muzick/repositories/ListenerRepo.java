package com.careerdevs.muzick.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.careerdevs.muzick.models.Listener;

public interface ListenerRepo extends JpaRepository<Listener, Long> {
    //generates query: "SELECT * FROM listener WHERE age = ?1"
    List<Listener> findAllByAge(Integer age);

    /* @Query("Select * FROM listener WHERE name LIKE '%?1%'")
    List<Listener> findAllByPartialName(String query); */

}
