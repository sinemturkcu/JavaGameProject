package JavaKampı.Homework4_2.Abstracts;
import JavaKampı.Homework4_2.Entities.Campaign;

public interface ICampaignService {
    void add(Campaign campaign);
    void delete (Campaign campaign);
    void update(Campaign campaign);
}
