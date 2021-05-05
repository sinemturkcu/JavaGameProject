package JavaKampı.Homework4_2.Concrete;

import JavaKampı.Homework4_2.Abstracts.VerificationService;
import JavaKampı.Homework4_2.Entities.Player;

public class VerificationManagement implements VerificationService {


    @Override
    public boolean checkifValidate(Player player) {
        if(player.getTcNo().length()==11){
            System.out.println("Player can login");
            return true;
        }
        else{
            System.out.println("Player can not login");
            return false;
        }
    }
}
