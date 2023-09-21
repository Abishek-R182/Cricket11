package Cricket11.example.Cricket11.Service;

import Cricket11.example.Cricket11.Entity.Dream11Player;
import Cricket11.example.Cricket11.Entity.Players;
import Cricket11.example.Cricket11.Entity.Userdetails;
import Cricket11.example.Cricket11.Repositry.Dream11Repo;
import Cricket11.example.Cricket11.Repositry.PlayersRepo;
import Cricket11.example.Cricket11.Repositry.UserRepo;
import DAO.Dream11RequestDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class PlayersService {
    @Autowired
    PlayersRepo playersRepo;
    public List<Players> getAllPlayers(){
        List<Players>  listOfPlayers = playersRepo.findAll();
        return listOfPlayers;
    }

    public Players updatePlayer(Players p){
        Players p2 = playersRepo.save(p);
        return p2;
    }

    public Players postPlayers(Players q){
        Players p3 = playersRepo.save(q);
        return p3;
    }

    @Autowired
    Dream11Repo dream11Repo;


    public Dream11Player entryPlayer(Dream11Player a){
        System.out.println("player===="+a);
        Dream11Player p1 =dream11Repo.save(a);
        return p1;
    }
    @Autowired
    UserRepo userRepo;
    public Userdetails postUserdetails(Userdetails o){
        Userdetails u1 = userRepo.save(o);
        return u1;
    }

    public List<Dream11Player> entryPlayers(List<Dream11Player> a){
        System.out.println("player===="+a);

        UUID userId = a.get(0).getUserdetails().getUser_id();

        if(a.size()  != 11) {
            System.out.println("you need to select exactly 11 players");
        }
        else{
            for(int i = 0; i < a.size(); i++){
                dream11Repo.save(a.get(i));
               // System.out.println(a.get(i));
            }
        }
        return dream11Repo.getAllD11PlayersByUserId(userId);
    }



}









