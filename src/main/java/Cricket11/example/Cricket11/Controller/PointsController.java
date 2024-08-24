package Cricket11.example.Cricket11.Controller;

import Cricket11.example.Cricket11.Entity.Players;
import Cricket11.example.Cricket11.Entity.Pointstable;
import Cricket11.example.Cricket11.Service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class PointsController {

    @Autowired
    PlayersService playersService;



    @GetMapping("/getpoints")
    public String fetchPoints(Model model){
        List<Pointstable> pointsTable = playersService.getPoints();
        model.addAttribute("pointsTable",pointsTable);
        return "PlayerResultView";

    }
}
