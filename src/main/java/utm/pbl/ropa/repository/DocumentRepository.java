package utm.pbl.ropa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utm.pbl.ropa.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
}
