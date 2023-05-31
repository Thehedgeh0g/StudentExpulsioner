package StrategyBuilder;

import student.Student;

public class StrategyBulider {
    private final boolean fullMoon;
    private final boolean random;
    public int beer;
    private final Student student;
    private boolean ivt;
    private boolean robot;
    private boolean sppo;

    public StrategyBulider(Student student,int beer, boolean robot, boolean sppo, boolean ivt, boolean fullMoon, boolean random) {
        this.fullMoon = fullMoon;
        this.random = random;
        this.beer = beer;
        this.student = student;
        this.ivt = ivt;
        this.robot = robot;
        this.sppo = sppo;
    }

    public int getBeer() {
        return beer;
    }

    public void setBeer(int beer){
        this.beer = beer;
    }

    public boolean isIvt() {
        return ivt;
    }

    public boolean isSppo() {
        return sppo;
    }

    public boolean isRobot() {
        return robot;
    }

    public boolean isFullMoon() {
        return fullMoon;
    }

    public boolean isRandom() {
        return random;
    }
}
