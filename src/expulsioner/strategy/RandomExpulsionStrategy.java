package expulsioner.strategy;

import student.Student;

import java.util.Random;

public class RandomExpulsionStrategy extends ExpulsionStrategy {
    public RandomExpulsionStrategy(ExpulsionStrategy next) {
        super(next);
    }

    @Override
    public String expulse(Student student) {
      if((new Random().nextInt(2) == 1)){
          return " отчислен по воле монетки";
      }
      return CallNext(student);
    }
}
