package OOP;

import OOP.Player;

public class VideoPlayer extends Player {
    private static int video_quality = 5;
    private static final int max_video_quality = 10;
    @Override
    public void turnUpTheVolume() {
        if (volume < max_volume)
            volume++;
    }
    @Override
    public void turnDownTheVolume() {
        if (volume > min_volume)
            volume--;
    }
    public void turnUpTheQuality() {
        if (video_quality < max_video_quality)
            video_quality++;
    }
}
