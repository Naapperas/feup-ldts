public class StringBar extends Bar {

    @Override
    public boolean isHappyHour() {
        return this.happyHourStasrted;
    }

    @Override
    public void startHappyHour() {
        this.happyHourStasrted = true;
        this.notifyObservers();
    }

    @Override
    public void endHappyHour() {
        this.happyHourStasrted = false;
        this.notifyObservers();
    }
}
