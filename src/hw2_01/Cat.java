package hw2_01;

public class Cat implements Participants {
    private int run;
    private int jump;

    public Cat(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }

//    public void jumping(Wall w) {
//        if (w.goWall(jump)) {
//            System.out.println("Кошка перепрыгнула стену в " + w.getHeight() + " метров");
//        } else {
//            System.out.println("Кошка не смогла перепрыгнуть стену в " + w.getHeight() + " метров");
//        }
//    }
//
//    public void runnig(Treadmill t) {
//        if (t.goTreadmill(run)) {
//            System.out.println("Кошка пробежала " + t.getLenght() + " метров");
//        } else {
//            System.out.println("Кошка не смогла пробежать " + t.getLenght() + " метров");
//        }
//    }

    @Override
    public void running() {
        System.out.println("Кошка бежит...");
    }

    @Override
    public void jumping() {
        System.out.println("Кошка прыгает...");
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
