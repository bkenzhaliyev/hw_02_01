package hw2_01;

public class Human implements Participants {
    private int run;
    private int jump;

    public Human(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }

//    public void jumping(Wall w) {
//        if (w.goWall(jump)) {
//            System.out.println("Человек перепрыгнул стену в " + w.getHeight() + " метров");
//        } else {
//            System.out.println("человек не смог перепрыгнуть стену в " + w.getHeight() + " метров");
//        }
//    }
//
//    public void runnig(Treadmill t) {
//        if (t.goTreadmill(run)) {
//            System.out.println("Человек пробежал " + t.getLenght() + " метров");
//        } else {
//            System.out.println("Человек не смог пробежать " + t.getLenght() + " метров");
//        }
//    }

    @Override
    public void running() {
        System.out.println("Человек бежит...");
    }

    @Override
    public void jumping() {
        System.out.println("Человек прыгает...");
    }

    @Override
    public int getRun() {
        return run;
    }

    @Override
    public int getJump() {
        return jump;
    }
}
