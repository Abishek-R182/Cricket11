package Cricket11.example.Cricket11.Repositry;


import Cricket11.example.Cricket11.Entity.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlayersRepo extends JpaRepository<Players, UUID> {

}

    //@Query("update ? 1")
    //public void updatePlayerByUUID(UUID playerId, String playerName);




