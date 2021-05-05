package JavaKampı.Homework4_2;

import JavaKampı.Homework4_2.Abstracts.VerificationService;
import JavaKampı.Homework4_2.Concrete.*;
import JavaKampı.Homework4_2.Entities.Campaign;
import JavaKampı.Homework4_2.Entities.Game;
import JavaKampı.Homework4_2.Entities.Player;
import JavaKampı.Homework4_2.Entities.Sale;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Campaign campaign1=new Campaign(1,"New Year Campaign",30.0);

        Game game1= new Game(1,"Valorant","Shooter game");

        Player player1= new Player(7,"Sinem","Türkçü","miyav reyiz",
                "12345","1999-03-19","47113562414");

        Sale sale1= new Sale(4,180.0);





        GameManagement gameManagement=new GameManagement();
        gameManagement.add(game1);

        PlayerManagement playerManagement=new PlayerManagement();
        playerManagement.delete(player1);

        SaleManagement saleManagement=new SaleManagement();
        saleManagement.update(sale1);

        CampaignManagement campaignManagement=new CampaignManagement();
        campaignManagement.add(campaign1);

        VerificationManagement verificationManagement=new VerificationManagement();
        verificationManagement.checkifValidate(player1);



    }
}
