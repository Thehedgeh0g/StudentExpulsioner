import StrategyBuilder.StrategyBulider;
import StrategyBuilder.StrategyChainBuilder;
import student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentExpulsioner {

    public static void main(String[] args) {
        int beer = new Random().nextInt(3);
        boolean robot = Boolean.parseBoolean(args[0]);
        boolean sppo = Boolean.parseBoolean(args[1]);
        boolean ivt = Boolean.parseBoolean(args[2]);
        boolean random = Boolean.parseBoolean(args[3]);
        boolean fullMoon = Boolean.parseBoolean(args[4]);
        String configuration = robot + " " + sppo + " " + ivt  + " " + random  + " " + fullMoon;
        System.out.println("конфигурация отчислятора: " + configuration);
        System.out.println("кол-во банок пива: " + beer);



        List<String> student1Debts = new ArrayList<>();
        student1Debts.add("opd");
        student1Debts.add("prog");
        Student student = new Student("name", "sppo", student1Debts);

        StrategyBulider strategyBulider = new StrategyBulider(student, beer, robot, sppo, ivt, fullMoon, random);

        System.out.println(StrategyChainBuilder.build(student, strategyBulider));

        List<String> student2Debts = new ArrayList<>();
        student2Debts.add("opd");
        Student student2 = new Student("name2", "robot", student2Debts);

        StrategyBulider strategyBulider2 = new StrategyBulider(student2, beer, robot, sppo, ivt, fullMoon, random);

        System.out.println(StrategyChainBuilder.build(student2, strategyBulider2));

        List<String> student3Debts = new ArrayList<>();
        student3Debts.add("opd");
        student3Debts.add("prog");
        Student student3 = new Student("name3", "ivt", student3Debts);

        StrategyBulider strategyBulider3 = new StrategyBulider(student3, beer, robot, sppo, ivt, fullMoon, random);

        System.out.println(StrategyChainBuilder.build(student2, strategyBulider3));

    }
}
