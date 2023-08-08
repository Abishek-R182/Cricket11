package Cricket11.example.Cricket11.Entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="Results")
public class Results {
    @Id
    @GeneratedValue
    private UUID Result_Id;
    @OneToOne
    @JoinColumn(name= "Player_Id")
    private Players players;

    private String Runs;
    private String Wickets;
    private String Catch;
    private String Stumping;
    private String RunOut;
    private String Total;

    public UUID getResult_Id() {
        return Result_Id;
    }

    public void setResult_Id(UUID result_Id) {
        Result_Id = result_Id;
    }

    public Players getPlayers() {
        return players;
    }

    public void setPlayers(Players players) {
        this.players = players;
    }

    public String getRuns() {
        return Runs;
    }

    public void setRuns(String runs) {
        Runs = runs;
    }

    public String getWickets() {
        return Wickets;
    }

    public void setWickets(String wickets) {
        Wickets = wickets;
    }

    public String getCatch() {

        return Catch;
    }

    public void setCatch(String aCatch) {

        Catch = aCatch;
    }

    public String getStumping() {
        return Stumping;
    }

    public void setStumping(String stumping) {
        Stumping = stumping;
    }

    public String getRunOut() {
        return RunOut;
    }

    public void setRunOut(String runOut) {

        RunOut = runOut;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {

        Total = total;
    }
}
