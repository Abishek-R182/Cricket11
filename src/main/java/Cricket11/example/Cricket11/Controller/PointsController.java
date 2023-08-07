package Cricket11.example.Cricket11.Controller;

import Cricket11.example.Cricket11.Entity.Players;
import Cricket11.example.Cricket11.Entity.Pointstable;
import Cricket11.example.Cricket11.Service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PointsController {

    @Autowired
    PlayersService playersService;



    @GetMapping("/get-points")
    public List<Pointstable> fetchPoints(){
        List<Pointstable> p = playersService.getPoints();
        return p;
}
}
