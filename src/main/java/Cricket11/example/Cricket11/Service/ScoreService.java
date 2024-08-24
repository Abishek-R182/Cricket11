package Cricket11.example.Cricket11.Service;

import Cricket11.example.Cricket11.Entity.Pointstable;
import Cricket11.example.Cricket11.Entity.Results;
import Cricket11.example.Cricket11.Repositry.PointsRepo;
import Cricket11.example.Cricket11.Repositry.ResultRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

import static java.lang.String.valueOf;

@Service
public class ScoreService {
    @Autowired
    ResultRepo resultRepo;

    @Autowired
    PointsRepo pointsRepo;
        public List<Results> calculateScore(){
            List<Pointstable> p = pointsRepo.findAll();

            int Runs = 0, Wickets = 0, Catch = 0, Stumping = 0, Runout = 0;

            for(int i = 0; i < p.size(); i++) {

                if (p.get(i).getPoint_Dept().equals("Runs")) {
                    Runs = p.get(i).getPoints();
                } else if (p.get(i).getPoint_Dept().equals("Wickets")) {
                    Wickets = p.get(i).getPoints();
                } else if (p.get(i).getPoint_Dept().equals("Catch")) {
                    Catch = p.get(i).getPoints();
                } else if (p.get(i).getPoint_Dept().equals("Stumping")) {
                    Stumping = p.get(i).getPoints();
                } else if (p.get(i).getPoint_Dept().equals("Runout")) {
                    Runout = p.get(i).getPoints();
                }else{
                    System.out.println(" ");
                }
            }

            List<Results> results = resultRepo.findAll();


            for (int j = 0; j < results.size(); j++) {
                int total = 0;

                total += Integer.parseInt(results.get(j).getRuns()) * Runs;

                total += Integer.parseInt(results.get(j).getWickets()) * Wickets;

                total += Integer.parseInt(results.get(j).getCatch()) * Catch;

                total += Integer.parseInt(results.get(j).getStumping()) * Stumping;

                total += Integer.parseInt(results.get(j).getRunout()) * Runout;

                results.get(j).setTotal(String.valueOf(total));

                resultRepo.save(results.get(j));
            }
            return results;
        }

}
