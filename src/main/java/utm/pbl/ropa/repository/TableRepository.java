package utm.pbl.ropa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utm.pbl.ropa.model.TableEntity;

@Repository
public interface TableRepository extends JpaRepository<TableEntity, String> {
}
