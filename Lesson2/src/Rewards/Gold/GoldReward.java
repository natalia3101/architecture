package Rewards.Gold;

import Abstractions.iGameItem;

public class GoldReward implements iGameItem {

    @Override
    public String open() {
        return "Gold";
    
    }
}