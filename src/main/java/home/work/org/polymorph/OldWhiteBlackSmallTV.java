package home.work.org.polymorph;

public class OldWhiteBlackSmallTV implements TV {

    @Override
    public void on() {
        System.out.println("Turn ON OLD SMALL TV!");
    }

    @Override
    public void off() {
        System.out.println("Turn OFF OLD SMALL TV!");
    }
}
