package JavaKampı.Homework4_2.Concrete;

import JavaKampı.Homework4_2.Abstracts.IPlayerService;
import JavaKampı.Homework4_2.Entities.Player;

public class PlayerManagement implements IPlayerService {
    @Override
    public void add(Player player) {
        System.out.println("A player named "+ player.getFirstName() +" "+ player.getLastName() +" has been added");
    }

    @Override
    public void delete(Player player) {
        System.out.println("A player named "+ player.getFirstName() +" "+ player.getLastName() +" has been deleted");
    }

    @Override
    public void update(Player player) {
        System.out.println("A player named "+ player.getFirstName() +" "+ player.getLastName() +" has been updated");
    }
}
