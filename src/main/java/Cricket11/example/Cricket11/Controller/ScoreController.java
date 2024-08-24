package Cricket11.example.Cricket11.Controller;

import Cricket11.example.Cricket11.Entity.Results;
import Cricket11.example.Cricket11.Service.ScoreService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
@Slf4j
public class ScoreController {
    @Autowired
    ScoreService scoreService;

    @GetMapping("/getresult")
    public String fetchScore(Model model){

        List<Results> playerResults = scoreService.calculateScore();
        model.addAttribute("playerResults",playerResults);
        log.debug("Returning Players Result View");
        return "PlayerResultView";
    }


}
