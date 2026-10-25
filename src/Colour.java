import java.util.logging.Logger;

public class Colour extends Plugin {
    public static final String BLACK = Colors.Black;
    public static final String DARK_BLUE = Colors.Navy;
    public static final String DARK_GREEN = Colors.Green;
    public static final String DARK_AQUA = Colors.Blue;
    public static final String DARK_RED = Colors.Red;
    public static final String DARK_PURPLE = Colors.Purple;
    public static final String GOLD = Colors.Gold;
    public static final String GREY = Colors.LightGray;
    public static final String DARK_GREY = Colors.Gray;
    public static final String BLUE = Colors.DarkPurple;
    public static final String GREEN = Colors.LightGreen;
    public static final String AQUA = Colors.LightBlue;
    public static final String RED = Colors.Rose;
    public static final String LIGHT_PURPLE = Colors.LightPurple;
    public static final String YELLOW = Colors.Yellow;
    public static final String WHITE = Colors.White;
    public static final String RESET = "§r";

    public static String clean(String message) {
        return message.replaceAll("(?i)\u00a7[0-9a-fr]", "");
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

    @Override
    public void initialize() {
        PluginLoader loader = etc.getLoader();
        loader.addListener(PluginLoader.Hook.COMMAND, new ColourCommand(), this, PluginListener.Priority.MEDIUM);
    }
}
