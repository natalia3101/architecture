package Rewards.Emerald;

import Abstractions.ItemGenerator;
import Abstractions.iGameItem;


public class EmeraldGenerator extends ItemGenerator{
        @Override
    public iGameItem createItem() {
        return new EmeraldReward();
    }
}
