package hw2_01;

public class Wall implements Let {
    private int jump;
    private boolean isJump;

    public Wall(int jump) {
        this.jump = jump;
    }


    @Override
    public void go(int n) {
        if (getJump() <= n) {
            System.out.println("Участник прыгнул на " + jump + " метров");
            isJump = true;
        } else {
            System.out.println("Участник не смог прыгнуть на " + jump + " метров");
        }
    }

    @Override
    public boolean isRun() {
        return false;
    }

    @Override
    public boolean isJump() {
        return isJump;
    }

    @Override
    public int getRun() {
        return 0;
    }

    @Override
    public int getJump() {
        return jump;
    }

}