package JavaKampı.Homework4_2.Concrete;

import JavaKampı.Homework4_2.Abstracts.IGameService;
import JavaKampı.Homework4_2.Entities.Game;

public class GameManagement implements IGameService {

    @Override
    public void add(Game game) {
        System.out.println("A game named "+ game.getGameName() +" has been added");
    }

    @Override
    public void delete(Game game) {
        System.out.println("A game named "+ game.getGameName() +" has been deleted");
    }

    @Override
    public void update(Game game) {
        System.out.println("A game named "+ game.getGameName() +" has been updated");
    }
}
