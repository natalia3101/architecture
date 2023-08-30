package Rewards.Silver;

import Abstractions.ItemGenerator;
import Abstractions.iGameItem;


public class SilverGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }
}
