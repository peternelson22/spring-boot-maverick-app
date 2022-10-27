package com.nelson.springbootmaverick.repository;

import com.nelson.springbootmaverick.model.Post;
import com.nelson.springbootmaverick.model.Maverick;
import com.nelson.springbootmaverick.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllBySubreddit(Maverick maverick);

    List<Post> findByUser(User user);
}
