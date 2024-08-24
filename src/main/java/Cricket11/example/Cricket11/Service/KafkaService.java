package Cricket11.example.Cricket11.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
/*
@Service
@Slf4j
public class KafkaService  {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(topics= "test_topic", groupId = "group_id")
    public void consume(String message){
        System.out.println("Consume Message: " + message);
    }




    public void sendMessage(String topic, String message) {

        kafkaTemplate.send(topic, message);
        log.info("Message Sent: " + message);

    }
}
*/