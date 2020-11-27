package StrategyBuilder;

import expulsioner.strategy.DebtsExpulsion;
import expulsioner.strategy.ExpulsionStrategy;
import expulsioner.strategy.FullMoonStrategy;
import expulsioner.strategy.RandomExpulsionStrategy;
import student.Student;

import static beer.Beer.beerCounter;

public class StrategyChainBuilder {

    public static String build(Student student, StrategyBulider strategyBulider){
        if(student.getFaculty().contains("robot") && strategyBulider.isRobot()){
            ExpulsionStrategy expulsionStrategy = new DebtsExpulsion(null);
            return student.getName() + " с факультета " + student.getFaculty() +  expulsionStrategy.expulse(student);
        }

        if(student.getFaculty().contains("sppo") && strategyBulider.isSppo()){
            if(!strategyBulider.isFullMoon() && !strategyBulider.isRandom()) {
                ExpulsionStrategy expulsionStrategy = new DebtsExpulsion(null);
                return student.getName() + " с факультета " + student.getFaculty() + expulsionStrategy.expulse(student);
            }

            if (!strategyBulider.isRandom()){
                FullMoonStrategy fullMoonStrategy = new FullMoonStrategy(null);
                ExpulsionStrategy expulsionStrategy = new DebtsExpulsion(fullMoonStrategy);
                return student.getName() + " с факультета " + student.getFaculty() + expulsionStrategy.expulse(student);
            }

            RandomExpulsionStrategy randomExpulsionStrategy = new RandomExpulsionStrategy(null);
            ExpulsionStrategy expulsionStrategy = new DebtsExpulsion(randomExpulsionStrategy);
            return student.getName() + " с факультета " + student.getFaculty() + expulsionStrategy.expulse(student);

        }

        if(student.getFaculty().contains("ivt") && strategyBulider.isIvt()){
            if (!strategyBulider.isRandom()){
                ExpulsionStrategy expulsionStrategy = new DebtsExpulsion(null);
                return student.getName() + " с факультета " + student.getFaculty() + expulsionStrategy.expulse(student);
            }

            RandomExpulsionStrategy randomExpulsionStrategy = new RandomExpulsionStrategy(null);
            ExpulsionStrategy expulsionStrategy = new DebtsExpulsion(randomExpulsionStrategy);
            return student.getName() + " с факультета " + student.getFaculty() + expulsionStrategy.expulse(student);
        }

        return student.getName() + " с факультета " + student.getFaculty() + beerCounter(strategyBulider);
    }

}
