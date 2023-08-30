package Rewards.Gem;

import Abstractions.ItemGenerator;
import Abstractions.iGameItem;


public class GemGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new GemReward();
    }
}
