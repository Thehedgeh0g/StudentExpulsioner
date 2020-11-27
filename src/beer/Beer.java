package beer;

import StrategyBuilder.*;

public class Beer {
    public static String beerCounter(StrategyBulider strategyBulider){
        if (strategyBulider.getBeer() > 0){
            strategyBulider.setBeer(strategyBulider.getBeer()-1);
            return " вот твое пиво, иди гуляй";
        }
        return " пива нет, вали отсюда";
    }
}
