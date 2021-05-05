package JavaKampı.Homework4_2.Concrete;

import JavaKampı.Homework4_2.Abstracts.ICampaignService;
import JavaKampı.Homework4_2.Entities.Campaign;

public class CampaignManagement implements ICampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println("A game named "+ campaign.getCampaignName() +" has been updated");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("A game named "+ campaign.getCampaignName() +" has been deleted");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("A game named "+ campaign.getCampaignName() +" has been updated");
    }
}
