package Cricket11.example.Cricket11;
import Cricket11.example.Cricket11.Entity.Players;
import Cricket11.example.Cricket11.Entity.Pointstable;
//import Cricket11.example.Cricket11.Service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

@SpringBootApplication
@EnableScheduling
public class Cricket11Application  {

	//@Autowired
	//private KafkaService kafkaService;


	//public static void main(String[] args) {
		//SpringApplication.run(Cricket11Application.class, args);
	//}

	/*@Scheduled(fixedRate = 10000)
	public void sendKafkaMessage(){
		String topic = "test_topic";
		String message = "Hello, Kafka!" + LocalDateTime.now();

		//List<Players> playersList = // call getAllPLayers();

				for(Players p : playersList){

					Pointstable p = new Pointstable();
					p.setPoint_id(p.getPoint_id());
					p.setPoint_Dept();
					p.setPoints();
				}




		kafkaService.sendMessage(topic, message);
	}
	@Override
	public void run(String[] args) throws Exception {

		sendKafkaMessage();
	}*/

	public static void main(String[] args) {
		SpringApplication.run(Cricket11Application.class, args);
	}

}
