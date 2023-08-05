package Cricket11.example.Cricket11.Repositry;

import Cricket11.example.Cricket11.Entity.Dream11Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


    @Repository
    public interface Dream11Repo extends JpaRepository<Dream11Player, UUID>{

        @Query(value = "select * from dream11 where dream11user_id = :userId", nativeQuery = true )
        public List<Dream11Player> getAllD11PlayersByUserId(UUID userId);
    }


