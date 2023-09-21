package tyre_pressure;

public class TyrePressureCalculator {
    public boolean calc(int frontRight, int frontLeft, int behindRight, int behindLeft) {
        int vorderreifen = frontRight - frontLeft;
        int hinterreifen = behindRight - behindLeft;
        return vorderreifen >= -3 && vorderreifen <= 3 && hinterreifen >= -3 && hinterreifen <= 3;


    }

    public boolean checkTyre(int pressure) {
        return pressure >= 35 && pressure <= 45;

    }
}
