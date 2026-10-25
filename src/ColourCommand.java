public class ColourCommand extends PluginListener{

    public void commandHelp(Player player) {
        player.sendMessage(Colour.AQUA + "/colour black        - Test black");
        player.sendMessage(Colour.AQUA + "/colour dark_blue    - Test dark blue");
    }
    @Override
    public boolean onCommand(Player player, String[] split) {
        if (split[0].equalsIgnoreCase("/colour")) {
            if (split.length == 1) {
                commandHelp(player);
                return true;
            }
            if (split.length == 2) {
                if (split[1].equalsIgnoreCase("black")) {
                    player.sendMessage(Colour.BLACK + "Black");
                } else if (split[1].equalsIgnoreCase("dark_blue")){
                    player.sendMessage(Colour.DARK_BLUE + "Dark Blue");
                } else if (split[1].equalsIgnoreCase("dark_green")) {
                    player.sendMessage(Colour.DARK_GREEN + "Dark Green");
                } else  {
                    commandHelp(player);
                }
                return true;
            }
        }
        return false;
    }
}
