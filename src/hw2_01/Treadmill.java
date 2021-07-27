package hw2_01;

public class Treadmill implements Let {
    private int run;
    private boolean isRun;

    public Treadmill(int run) {
        this.run = run;
    }

    @Override
    public void go(int n) {
        if (run <= n) {
            System.out.println("Участник пробежал " + run + " метров");
            isRun = true;
        } else {
            System.out.println("Участник не смог пробежать " + run + " метров");
        }
    }


    @Override
    public int getRun() {
        return run;
    }

    @Override
    public int getJump() {
        return 0;
    }


    public boolean isRun() {
        return isRun;
    }

    @Override
    public boolean isJump() {
        return false;
    }
}
