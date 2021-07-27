package hw2_01;

public class Main {
    public static void main(String[] args) {

        Participants[] participants = {
                new Cat(250, 10),
                new Human(200, 2),
                new Robot(1000, 12),
        };

        Let[] lets = {
                new Treadmill(190),
                new Wall(9),
        };

        for (int i = 0; i < participants.length; i++) {

            for (int j = 0; j < lets.length; j++) {
                if (lets[j].getRun() != 0) {
                    participants[i].running();
                    lets[j].go(participants[i].getRun());
                    if (lets[j].isRun() == false) {
                        break;
                    }
                } else {
                    participants[i].jumping();
                    lets[j].go(participants[i].getJump());
                    if (lets[j].isJump() == false) {
                        break;
                    }
                }


            }
        }
    }
}
