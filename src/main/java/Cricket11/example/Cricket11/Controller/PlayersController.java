package Cricket11.example.Cricket11.Controller;

import Cricket11.example.Cricket11.Entity.Players;
import Cricket11.example.Cricket11.Service.PlayersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class PlayersController {
    @Autowired
    PlayersService playersService;

    @GetMapping("/allplayers")
    public List<Players> fetchPlayers(){
        List<Players> players = playersService.getAllPlayers();
        return players;
    }

    @PostMapping("/addplayers")
    public Players postPlayers(@RequestBody Players p){
        Players players1 = playersService.postPlayers(p);
        return players1;
    }
    @PutMapping("/updateplayers")
    public Players putPLayers(@RequestBody Players p) {
        log.info("Update Method Called");
        Players players2 = playersService.updatePlayer(p);
        return players2;
    }
}
