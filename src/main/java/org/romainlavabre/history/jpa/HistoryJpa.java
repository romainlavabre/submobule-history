package org.romainlavabre.history.jpa;


import org.romainlavabre.history.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Romain Lavabre <romainlavabre98@gmail.com>
 */
@Repository
public interface HistoryJpa extends JpaRepository< History, Long > {

    @Query( value = "SELECT * FROM history WHERE subject_type = ?1 AND subject_id = ?2 AND subject_property = ?3 ORDER BY id DESC LIMIT 1", nativeQuery = true )
    Optional< History > findLastByEntityAndIdAndProperty( String entity, Long id, String property );


    @Query( value = "SELECT * FROM history WHERE subject_type = ?1 AND subject_id = ?2 AND subject_property = ?3 ORDER BY id DESC LIMIT ?4", nativeQuery = true )
    List< History > findAllByEntityAndIdAndPropertyLimit( String entity, Long id, String property, long limit );


    List< History > findAllBySubjectTypeAndSubjectId( String subjectType, int subjectId );
}