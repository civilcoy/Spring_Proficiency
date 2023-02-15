package com.example.spring_proficiency.repository;

import com.example.spring_proficiency.dto.PostResponseDto;
import com.example.spring_proficiency.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
//    Optional<Post> findByIdAndUserId(Long id, Long userId);
    List<PostResponseDto> findAllByOrderByModifiedAtDesc();
}
