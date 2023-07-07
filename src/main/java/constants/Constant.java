package constants;

import java.time.Duration;

public class Constant {

    private final static String YOUTUBE_URL = "https://www.youtube.com/";
    private final static String YOUTUBE_TITLE = "YouTube";
    private final static Duration EXPLICIT_WAIT_DURATION = Duration.ofSeconds(15);

    public static String getYOUTUBE_URL() {
        return YOUTUBE_URL;
    }

    public static String getYOUTUBE_TITLE() {
        return YOUTUBE_TITLE;
    }

    public static Duration getExplicitWaitDuration() {
        return EXPLICIT_WAIT_DURATION;
    }
}
