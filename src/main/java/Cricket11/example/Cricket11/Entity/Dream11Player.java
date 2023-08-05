package Cricket11.example.Cricket11.Entity;

import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table(name="Dream11" )

public class Dream11Player {

   /* public Dream11Player(UUID player_id,String player_name, int player_age,  String player_country, String batting_Style, String bowling_Style){
        this.players = new Players();
        this.players.setPlayer_id(player_id);

        this.player_name = player_name;
        this.player_age = player_age;
        this.player_country = player_country;
        this.batting_Style = batting_Style;
        this.bowling_Style = bowling_Style;
    }*/

    @Id
    @GeneratedValue
    private UUID Id;

    @OneToOne
    @JoinColumn(name = "dream11_id")
    private Players players;

    @OneToOne
    @JoinColumn(name = "dream11user_id")
    private Userdetails userdetails;



    //  private UUID playerid; // id
    private String player_name;// name

    private int player_age;//age

    private String batting_Style;// batt style

    private String bowling_Style; // bowling style

    private String player_country;




    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public Players getPlayers() {
        return players;
    }

    public void setPlayers(Players players) {
        this.players = players;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public int getPlayer_age() {
        return player_age;
    }

    public void setPlayer_age(int player_age) {
        this.player_age = player_age;
    }

    public String getBatting_Style() {
        return batting_Style;
    }

    public void setBatting_Style(String batting_Style) {
        this.batting_Style = batting_Style;
    }

    public String getBowling_Style() {
        return bowling_Style;
    }

    public void setBowling_Style(String bowling_Style) {
        this.bowling_Style = bowling_Style;
    }

    public String getPlayer_country() {
        return player_country;
    }

    public void setPlayer_country(String player_country) {
        this.player_country = player_country;
    }

    public Userdetails getUserdetails() {
        return userdetails;
    }

    public void setUserdetails(Userdetails userdetails) {
        this.userdetails = userdetails;
    }
}
