package searchengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import searchengine.model.Site;
import searchengine.model.StatusType;

import java.util.Optional;
import java.util.Set;

public interface SiteRepository extends JpaRepository<Site, Integer> {
    Set<Site> findAllByStatus(StatusType status);
    boolean existsByStatus(StatusType status);
    boolean existsByIdAndStatus(Integer id, StatusType status);
    Optional<Site> findByUrlIgnoreCase(String url);
    boolean existsByStatusNot(StatusType status);
}
