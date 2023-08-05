package DAO;

import java.util.UUID;

public class Dream11RequestDAO {
    private UUID player_id;
    private String player_name;
    private int player_age;
    private String player_country;
    private String batting_style;
    private String bowling_style;

    public UUID getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(UUID player_id) {
        this.player_id = player_id;
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

    public String getPlayer_country() {
        return player_country;
    }

    public void setPlayer_country(String player_country) {
        this.player_country = player_country;
    }

    public String getBatting_style() {
        return batting_style;
    }

    public void setBatting_style(String batting_style) {
        this.batting_style = batting_style;
    }

    public String getBowling_style() {
        return bowling_style;
    }

    public void setBowling_style(String bowling_style) {
        this.bowling_style = bowling_style;
    }
}
