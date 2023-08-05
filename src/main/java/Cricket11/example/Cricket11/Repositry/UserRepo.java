package Cricket11.example.Cricket11.Repositry;

import Cricket11.example.Cricket11.Entity.Userdetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<Userdetails, UUID> {

}
