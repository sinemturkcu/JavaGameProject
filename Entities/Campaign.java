package JavaKampı.Homework4_2.Entities;

public class Campaign {
    private int cid; // cid means that campaign id
    private String campaignName;
    private double campaignPrice;


    public Campaign(){

    }

    public Campaign(int cid, String campaignName, double campaignPrice) {
        this.cid = cid;
        this.campaignName = campaignName;
        this.campaignPrice = campaignPrice;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getCampaignPrice() {
        return campaignPrice;
    }

    public void setCampaignPrice(double campaignPrice) {
        this.campaignPrice = campaignPrice;
    }
}
