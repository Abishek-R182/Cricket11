package Cricket11.example.Cricket11.Controller;

import Cricket11.example.Cricket11.Entity.Results;
import Cricket11.example.Cricket11.Entity.Userdetails;
import Cricket11.example.Cricket11.Repositry.ResultRepo;
import Cricket11.example.Cricket11.Service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    PlayersService playersService;

    @PostMapping("/postuserdata")
    public Userdetails postUser(@RequestBody Userdetails k){
        Userdetails u = playersService.postUserdetails(k);
        return u;
    }

    @Autowired
    private ResultRepo resultRepo;
    @GetMapping("/getuser")
    public String getUser(Model model){
        List<Results> userName = resultRepo.findAll();
        model.addAttribute("",userName);
        return "PlayerResultView";
    }
}
