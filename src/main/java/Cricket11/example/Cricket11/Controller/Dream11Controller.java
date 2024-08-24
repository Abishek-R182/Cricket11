package Cricket11.example.Cricket11.Controller;

import Cricket11.example.Cricket11.Entity.Dream11Player;
import Cricket11.example.Cricket11.Entity.Players;
import Cricket11.example.Cricket11.Service.PlayersService;
import DAO.Dream11RequestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Dream11Controller {

    //auto wire
    @Autowired
    PlayersService playersService;


    //Post APi
    @PostMapping("/postdream11")
    public Dream11Player postPlayers(@RequestBody Dream11Player s){
       Dream11Player dream11= playersService.entryPlayer(s);
       return dream11;
   }


   @PostMapping("/postdream11team")
    public List<Dream11Player> postYourPlayers(@RequestBody List<Dream11Player> s){
        List<Dream11Player> dream11= playersService.entryPlayers(s);
        return dream11;
    }








    //public void addDream11Players(List<UUID> dream11Players){

       //playersService.addDream11Player();




}
