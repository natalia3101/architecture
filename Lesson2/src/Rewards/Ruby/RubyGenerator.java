package Rewards.Ruby;

import Abstractions.ItemGenerator;
import Abstractions.iGameItem;

public class RubyGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new RubyReward();
    }
}
