package com.careerdevs.muzick.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.careerdevs.muzick.models.Listener;

public interface ListenerRepo extends JpaRepository<Listener, Long> {
    List<Listener> findAllByAge(Integer age);
}
