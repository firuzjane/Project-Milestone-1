public class Television {
    private boolean powerOn;
    private int volume;
    private int currentChannel;

    public Television() {
        powerOn = false;
        volume = 10;
        currentChannel = 1;
    }

    public void turnOn() {
        powerOn = true;
    }

    public void turnOff() {
        powerOn = false;
    }

    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        volume--;
    }

    public void channelUp() {
        currentChannel++;
    }

    public void channelDown() {
        currentChannel--;
    }

    public String getStatus() {
        if(powerOn) {
            return "TV On";
        }
        return "TV Off";
    }
}
