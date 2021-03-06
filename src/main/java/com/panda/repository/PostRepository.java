package com.panda.repository;

import com.panda.domain.Post;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data  repository for the Post entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PostRepository extends JpaRepository<Post, Long>, JpaSpecificationExecutor<Post> {

    @Query("select post from Post post where post.user.login = ?#{principal.preferredUsername}")
    List<Post> findByUserIsCurrentUser();
}
