package expulsioner.strategy;

import student.Student;

public abstract class ExpulsionStrategy  {
    protected final ExpulsionStrategy next;

    public ExpulsionStrategy(ExpulsionStrategy next){
        this.next = next;
    }

    protected String CallNext(Student student){
        if (next != null){
            return next.expulse(student);
        }
        return " не отчислен, т.к. нет долгов";
    }

    public abstract String expulse(Student student);

}
