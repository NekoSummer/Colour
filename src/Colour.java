import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Colour extends Plugin {
    public static final String COLOUR_CHAR = "\u00a7";

    public static final String BLACK = COLOUR_CHAR + "0";
    public static final String DARK_BLUE = COLOUR_CHAR + "1";
    public static final String DARK_GREEN = COLOUR_CHAR + "2";
    public static final String DARK_AQUA = COLOUR_CHAR + "3";
    public static final String DARK_RED = COLOUR_CHAR + "4";
    public static final String DARK_PURPLE = COLOUR_CHAR + "5";
    public static final String GOLD = COLOUR_CHAR + "6";
    public static final String GREY = COLOUR_CHAR + "7";
    public static final String DARK_GREY = COLOUR_CHAR + "8";
    public static final String BLUE = COLOUR_CHAR + "9";
    public static final String GREEN = COLOUR_CHAR + "a";
    public static final String AQUA = COLOUR_CHAR + "b";
    public static final String RED = COLOUR_CHAR + "c";
    public static final String LIGHT_PURPLE = COLOUR_CHAR + "d";
    public static final String YELLOW = COLOUR_CHAR + "e";
    public static final String WHITE = COLOUR_CHAR + "f";
    public static final String RESET = COLOUR_CHAR + "r";

    public static String clean(String message) {
        return message.replaceAll("(?i)" + COLOUR_CHAR + "[0-9a-fr]", "");
    }

    public static String toANSI(String string) {
        string = string.replace(RESET, (char) 0x1b + "[0m");
        string = string.replace(BLACK, (char) 0x1b + "[0;30m");
        string = string.replace(DARK_BLUE, (char) 0x1b + "[0;34m");
        string = string.replace(DARK_GREEN, (char) 0x1b + "[0;32m");
        string = string.replace(DARK_AQUA, (char) 0x1b + "[0;36m");
        string = string.replace(DARK_RED, (char) 0x1b + "[0;31m");
        string = string.replace(DARK_PURPLE, (char) 0x1b + "[0;35m");
        string = string.replace(GOLD, (char) 0x1b + "[0;33m");
        string = string.replace(GREY, (char) 0x1b + "[0;37m");
        string = string.replace(DARK_GREY, (char) 0x1b + "[30;1m");
        string = string.replace(BLUE, (char) 0x1b + "[34;1m");
        string = string.replace(GREEN, (char) 0x1b + "[32;1m");
        string = string.replace(AQUA, (char) 0x1b + "[36;1m");
        string = string.replace(RED, (char) 0x1b + "[31;1m");
        string = string.replace(LIGHT_PURPLE, (char) 0x1b + "[35;1m");
        string = string.replace(YELLOW, (char) 0x1b + "[33;1m");
        string = string.replace(WHITE, (char) 0x1b + "[37;1m");

        return string;
    }

    @Override
    public void enable() {
        Logger.getLogger("Minecraft").info("Colour extra plugin is enabled");
        Logger.getLogger("Minecraft").warning("\nWhen utilising the `toANSI` function provided by this plugin, \nensure that you append `Colour.RESET` at the end of your text to avoid \ncolour bleed in the terminal.");
        Logger.getLogger("Minecraft").info(toANSI("author:" + AQUA + "NewmoomCat" + RESET));
    }

    @Override
    public void disable() {
        Logger.getLogger("Minecraft").info("Colour extra plugin is disabled");
    }

}
