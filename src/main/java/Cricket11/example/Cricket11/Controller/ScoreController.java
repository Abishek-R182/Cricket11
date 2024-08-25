package Cricket11.example.Cricket11.Controller;

import Cricket11.example.Cricket11.Entity.Results;
import Cricket11.example.Cricket11.Service.ScoreService;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.List;
@Controller
@Slf4j
public class ScoreController {
    @Autowired
    ScoreService scoreService;


    //private String containerId = InetAddress.getLocalHost().getHostName();

    //public ScoreController() throws UnknownHostException {
    //}

    /*public String logIpAddress() {
        DockerClient dockerClient = DockerClientBuilder.getInstance().build();
        InspectContainerResponse containerInfo = dockerClient.inspectContainerCmd(containerId).exec();
        String containerInfoId = containerInfo.getId();

        System.out.println("Container ID: " + containerInfoId);

        return containerInfoId;
    }*/
    @GetMapping("/getresult")
    public String fetchScore(Model model) throws UnknownHostException {


        List<Results> playerResults = scoreService.calculateScore();
        model.addAttribute("playerResults",playerResults);

        log.info("Client Host Address: {}", InetAddress.getLocalHost().getHostName());

        log.debug("Returning Players Result View");
        return "PlayerResultView";
    }


}
