package hw2_01;

public class Robot implements Participants{
    int run;
    int jump;

    public Robot(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }

//    public void jumping(Wall w) {
//        if (w.goWall(jump)) {
//            System.out.println("Робот перепрыгнул стену в " + w.getHeight() + " метров");
//        } else {
//            System.out.println("Робот не смог перепрыгнуть стену в " + w.getHeight() + " метров");
//        }
//    }
//
//    public void runnig(Treadmill t) {
//        if (t.goTreadmill(run)) {
//            System.out.println("Робот пробежал " + t.getLenght() + " метров");
//        } else {
//            System.out.println("Робот не смог пробежать " + t.getLenght() + " метров");
//        }
//    }

    @Override
    public void running() {
        System.out.println("Робот бежит...");
    }

    @Override
    public void jumping() {
        System.out.println("Робот прыгает...");
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
