package com.nelson.springbootmaverick.repository;

import com.nelson.springbootmaverick.model.Post;
import com.nelson.springbootmaverick.model.User;
import com.nelson.springbootmaverick.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {

    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
