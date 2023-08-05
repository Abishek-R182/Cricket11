package Cricket11.example.Cricket11.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name="Players")

public class Players {
    @Id
    @GeneratedValue
    private UUID player_id;

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

    public String getPlayer_DOB() {
        return player_DOB;
    }

    public void setPlayer_DOB(String player_DOB) {
        this.player_DOB = player_DOB;
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

    public String getPlayer_role() {
        return player_role;
    }

    public void setPlayer_role(String player_role) {
        this.player_role = player_role;
    }

    public String getBatting_Style() {
        return Batting_Style;
    }

    public void setBatting_Style(String batting_Style) {
        Batting_Style = batting_Style;
    }

    public String getBowling_Style() {
        return Bowling_Style;
    }

    public void setBowling_Style(String bowling_Style) {
        Bowling_Style = bowling_Style;
    }

    public String getT20_Runs_Scored() {
        return T20_Runs_Scored;
    }

    public void setT20_Runs_Scored(String t20_Runs_Scored) {
        T20_Runs_Scored = t20_Runs_Scored;
    }

    public String getT20_Wickets_Taken() {
        return T20_Wickets_Taken;
    }

    public void setT20_Wickets_Taken(String t20_Wickets_Taken) {
        T20_Wickets_Taken = t20_Wickets_Taken;
    }

    public String getODI_Runs_Scored() {
        return ODI_Runs_Scored;
    }

    public void setODI_Runs_Scored(String ODI_Runs_Scored) {
        this.ODI_Runs_Scored = ODI_Runs_Scored;
    }

    public String getODI_Wickets_Taken() {
        return ODI_Wickets_Taken;
    }

    public void setODI_Wickets_Taken(String ODI_Wickets_Taken) {
        this.ODI_Wickets_Taken = ODI_Wickets_Taken;
    }

    public String getTest_Runs_Scored() {
        return Test_Runs_Scored;
    }

    public void setTest_Runs_Scored(String test_Runs_Scored) {
        Test_Runs_Scored = test_Runs_Scored;
    }

    public String getTest_Wickets_Taken() {
        return Test_Wickets_Taken;
    }

    public void setTest_Wickets_Taken(String test_Wickets_Taken) {
        Test_Wickets_Taken = test_Wickets_Taken;
    }

    public String getIPL_Runs_Scored() {
        return IPL_Runs_Scored;
    }

    public void setIPL_Runs_Scored(String IPL_Runs_Scored) {
        this.IPL_Runs_Scored = IPL_Runs_Scored;
    }

    public String getIPL_Wickets_Taken() {
        return IPL_Wickets_Taken;
    }

    public void setIPL_Wickets_Taken(String IPL_Wickets_Taken) {
        this.IPL_Wickets_Taken = IPL_Wickets_Taken;
    }

    public String getOverall_International_Runs_Scored() {
        return Overall_International_Runs_Scored;
    }

    public void setOverall_International_Runs_Scored(String overall_International_Runs_Scored) {
        Overall_International_Runs_Scored = overall_International_Runs_Scored;
    }

    public String getOverall_International_Wickets_Taken() {
        return Overall_International_Wickets_Taken;
    }

    public void setOverall_International_Wickets_Taken(String overall_International_Wickets_Taken) {
        Overall_International_Wickets_Taken = overall_International_Wickets_Taken;
    }


     private String player_name;


    private String player_DOB;


    private int player_age;


    private String player_country;

    private String player_role;


    private String Batting_Style;


    private String Bowling_Style;


    private String T20_Runs_Scored;


    private String T20_Wickets_Taken;


    private String ODI_Runs_Scored;


    private String ODI_Wickets_Taken;


    private String Test_Runs_Scored;


    private String Test_Wickets_Taken;


    private String IPL_Runs_Scored;


    private String IPL_Wickets_Taken;


    private String Overall_International_Runs_Scored;


    private String Overall_International_Wickets_Taken;


}
