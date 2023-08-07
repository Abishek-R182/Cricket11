package Cricket11.example.Cricket11.Repositry;

import Cricket11.example.Cricket11.Entity.Pointstable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PointsRepo extends JpaRepository<Pointstable, UUID> {

}
