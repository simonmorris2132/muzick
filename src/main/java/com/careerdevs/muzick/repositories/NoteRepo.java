package com.careerdevs.muzick.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.careerdevs.muzick.models.Note;

public interface NoteRepo extends JpaRepository<Note, Long> {
    List<Note> findAllByListener_id(Long listener_id);
}
