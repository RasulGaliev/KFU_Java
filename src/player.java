public abstract class player implements technics {
    protected int volume = 50;
    protected static final int max_volume = 100;
    protected static final int min_volume = 0;
    @Override
    public void power() {
        System.out.println("player is playing");
    }
    @Override
    public void off() {
        System.out.println("player is done playing");
    }
    public void turnUpTheVolume() {};
    public void turnDownTheVolume() {};
}
