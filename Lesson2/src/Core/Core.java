package Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Abstractions.ItemGenerator;
import Rewards.Emerald.EmeraldGenerator;
import Rewards.Gem.GemGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Ruby.RubyGenerator;
import Rewards.Silver.SilverGenerator;

public class Core {
    // отвечает за логику игры
    public void run(){
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new GemGenerator());
        generatorList.add(new EmeraldGenerator());
        generatorList.add(new RubyGenerator());

        // рандомно выбираем награду из списка
        Random random = new Random();
        ItemGenerator randomReward = generatorList.get(random.nextInt(generatorList.size()));
        System.out.println(randomReward.openReward());
    }
}
