package Cricket11.example.Cricket11.Entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="Pointstable")
public class Pointstable {

    @Id
    @GeneratedValue
    private UUID Point_id;
    private String Point_Dept;
    private int Points;





    public UUID getPoint_id(){
    return Point_id;
    }

    public void setPoint_id(UUID point_id) {
        Point_id = point_id;
    }

    public String getPoint_Dept() {
        return Point_Dept;
    }

    public void setPoint_Dept(String point_Dept) {
        Point_Dept = point_Dept;
    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int points) {
        Points = points;
    }
}
