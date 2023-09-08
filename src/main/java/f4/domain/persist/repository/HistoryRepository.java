package f4.domain.persist.repository;

import f4.domain.persist.entity.History;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<History,Long> {
  List<History> findByUserId(long userId);
}
