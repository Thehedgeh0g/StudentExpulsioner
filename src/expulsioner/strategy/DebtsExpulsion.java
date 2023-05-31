package expulsioner.strategy;

import student.Student;

public class DebtsExpulsion extends ExpulsionStrategy {
    public DebtsExpulsion(ExpulsionStrategy next) {
        super(next);

    }

    @Override
    public String expulse(Student student) {

        if(!student.getDebts().isEmpty()){
            String debts = "";
            for (String debt : student.getDebts()){
                debts += debt + ", ";
            }
            debts= debts.substring(0, debts.length()-2);
            return " отчислен из-за предметов: " + debts;
        }
        return CallNext(student);
    }
}
