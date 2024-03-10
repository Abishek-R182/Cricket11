package Cricket11.example.Cricket11.Controller;

import Cricket11.example.Cricket11.Entity.Players;
import Cricket11.example.Cricket11.Entity.Results;
import Cricket11.example.Cricket11.Repositry.ResultRepo;
import Cricket11.example.Cricket11.Service.PlayersService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
public class PlayersController {
    @Autowired
    PlayersService playersService;

    @GetMapping("/allplayers")
    public List<Players> fetchPlayers(){
        List<Players> players = playersService.getAllPlayers();
        return players;
    }

    @Autowired
    private ResultRepo resultRepo;

    @GetMapping("/getresults")
    public String getAllEntities(Model model) {
        List<Results> entities = resultRepo.findAll();
        model.addAttribute("playerResults", entities);
        return "PlayerResultView";
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
