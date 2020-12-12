package com.panda.repository;

import com.panda.domain.OverheardComment;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data  repository for the OverheardComment entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OverheardCommentRepository extends JpaRepository<OverheardComment, Long>, JpaSpecificationExecutor<OverheardComment> {

    @Query("select overheardComment from OverheardComment overheardComment where overheardComment.user.login = ?#{principal.preferredUsername}")
    List<OverheardComment> findByUserIsCurrentUser();
}
