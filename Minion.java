public class Minion {
    private String minionName;
    private double minionHeight;
    private int numEvilDeedsComp;
//    private static int numMinions = 0;

//    public static int getNumMinions() {
//        return numMinions;
//    }
//
//    public static void setNumMinions(int numMinions) {
//        Minion.numMinions = numMinions;
//    }

    public Minion(String minionName, double minionHeight, int numEvilDeedsComp) {
        this.minionName = minionName;
        this.minionHeight = minionHeight;
        this.numEvilDeedsComp = numEvilDeedsComp;
//        numMinions++;
    }

    public String getMinionName() {
        return minionName;
    }

    public void setMinionName(String minionName) {
        this.minionName = minionName;
    }

    public double getMinionHeight() {
        return minionHeight;
    }

    public void setMinionHeight(double minionHeight) {
        this.minionHeight = minionHeight;
    }

    public int getNumEvilDeedsComp() {
        return numEvilDeedsComp;
    }

    public void setNumEvilDeedsComp(int numEvilDeedsComp) {
        this.numEvilDeedsComp = numEvilDeedsComp;
    }

    @Override
    public String toString() {
        return "Minion{" +
                "minionName='" + minionName + '\'' +
                ", minionHeight=" + minionHeight +
                ", numEvilDeedsComp=" + numEvilDeedsComp +
                '}';
    }
}
