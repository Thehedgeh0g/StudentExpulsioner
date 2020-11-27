package expulsioner.strategy;

import student.Student;

public class FullMoonStrategy extends ExpulsionStrategy {
    public FullMoonStrategy(ExpulsionStrategy next) {
        super(next);
    }

    @Override
    public String expulse(Student student) {
        return " отчислен из-за полнолуния";
    }
}
