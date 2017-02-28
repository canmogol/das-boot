public class Antenna {

    private boolean isRaised = false;

    public void rise() {
        isRaised = true;
    }

    public void lower() {
        isRaised = false;
    }

    public boolean isRaised() {
        return isRaised;
    }

}
