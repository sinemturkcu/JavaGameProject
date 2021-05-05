package JavaKampı.Homework4_2.Abstracts;

import JavaKampı.Homework4_2.Entities.Player;

public interface IPlayerService {
    void add(Player player);
    void delete (Player player);
    void update(Player player);
}
