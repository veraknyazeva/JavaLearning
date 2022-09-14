package home.work.org.polymorph;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<TV> tvs = new ArrayList<>();

        TV myTV = new BigFullHdLgTV();

        TV grandmaTV = new OldWhiteBlackSmallTV();

        tvs.add(myTV);
        tvs.add(grandmaTV);

        turnOnAllTV(tvs);
        turnOffAllTV(tvs);
    }

    public static void turnOnAllTV(List<TV> listOfTv) {
        for(TV tv : listOfTv) {
            tv.on();
        }
    }

    public static void turnOffAllTV(List<TV> listOfTv) {
        for(TV tv : listOfTv) {
            tv.off();
        }
    }
}
