public class Radio {

    private String stationName;
    private boolean turnedOn;

    public Radio() {
    }

    public void switchOnOff() {
        turnedOn = !turnedOn;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

}
