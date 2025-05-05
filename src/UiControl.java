public class UiControl {
    public UiControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UiControl");
    }

    private boolean isEnabled = true;

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
