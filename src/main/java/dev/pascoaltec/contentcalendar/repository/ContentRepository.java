package dev.pascoaltec.contentcalendar.repository;

import dev.pascoaltec.contentcalendar.model.Content;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import ch.qos.logback.core.status.Status;

import java.util.List;



public interface ContentRepository extends ListCrudRepository<Content,Integer> {
    
    List<Content> findAllByTitleContains(String keyword);

    @Query("""
            SELECT * FROM Content
            where STATUS = :status
            """)
            List<Content> listByStatus(@Param("status")Status status);
}
