package f4.domain.persist.repository;

import f4.domain.persist.entity.HistoryEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<HistoryEntity,Long> {

  List<HistoryEntity> findByUserId(long userId);
}
