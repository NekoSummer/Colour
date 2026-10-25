public class ColourCommand extends PluginListener{

    public void commandHelp(Player player) {
        player.sendMessage(Colour.AQUA + "/colour black        - Test black");
        player.sendMessage(Colour.AQUA + "/colour dark_blue    - Test dark blue");
        player.sendMessage(Colour.AQUA + "/colour dark_green   - Test dark green");
        player.sendMessage(Colour.AQUA + "/colour dark_aqua    - Test dark aqua");
        player.sendMessage(Colour.AQUA + "/colour dark_red     - Test dark red");
        player.sendMessage(Colour.AQUA + "/colour dark_purple  - Test dark purple");
        player.sendMessage(Colour.AQUA + "/colour gold         - Test gold");
        player.sendMessage(Colour.AQUA + "/colour grey         - Test grey");
        player.sendMessage(Colour.AQUA + "/colour dark_grey    - Test dark grey");
        player.sendMessage(Colour.AQUA + "/colour blue         - Test blue");
        player.sendMessage(Colour.AQUA + "/colour green        - Test green");
        player.sendMessage(Colour.AQUA + "/colour aqua         - Test aqua");
        player.sendMessage(Colour.AQUA + "/colour red          - Test aqua");
        player.sendMessage(Colour.AQUA + "/colour light_purple - Test aqua");
        player.sendMessage(Colour.AQUA + "/colour yellow       - Test aqua");
        player.sendMessage(Colour.AQUA + "/colour white        - Test aqua");
    }
    @Override
    public boolean onCommand(Player player, String[] split) {
        if (split[0].equalsIgnoreCase("/colour")) {
            if (split.length == 1) {
                commandHelp(player);
                return true;
            }
            /*
             * 十分冗长的
             */
            if (split.length == 2) {
                if (split[1].equalsIgnoreCase("black")) {
                    player.sendMessage(Colour.BLACK + "Black");
                } else if (split[1].equalsIgnoreCase("dark_blue")){
                    player.sendMessage(Colour.DARK_BLUE + "Dark Blue");
                } else if (split[1].equalsIgnoreCase("dark_green")) {
                    player.sendMessage(Colour.DARK_GREEN + "Dark Green");
                } else if (split[1].equalsIgnoreCase("dark_aqua")) {
                    player.sendMessage(Colour.DARK_AQUA + "Dark Aqua");
                } else if (split[1].equalsIgnoreCase("dark_red")) {
                    player.sendMessage(Colour.DARK_RED + "Dark Red");
                } else if (split[1].equalsIgnoreCase("dark_purple")) {
                    player.sendMessage(Colour.DARK_PURPLE + "Dark Purple");
                } else if (split[1].equalsIgnoreCase("gold")) {
                    player.sendMessage(Colour.GOLD + "Gold");
                } else if (split[1].equalsIgnoreCase("grey")) {
                    player.sendMessage(Colour.GREY + "Grey");
                } else if (split[1].equalsIgnoreCase("dark_grey")) {
                    player.sendMessage(Colour.DARK_GREY + "Dark Grey");
                } else if (split[1].equalsIgnoreCase("blue")) {
                    player.sendMessage(Colour.BLUE + "Blue");
                } else if (split[1].equalsIgnoreCase("green")) {
                    player.sendMessage(Colour.GREEN + "Green");
                } else if (split[1].equalsIgnoreCase("aqua")) {
                    player.sendMessage(Colour.AQUA + "Aqua");
                } else if (split[1].equalsIgnoreCase("red")) {
                    player.sendMessage(Colour.RED + "Red");
                } else if (split[1].equalsIgnoreCase("light_purple")) {
                    player.sendMessage(Colour.LIGHT_PURPLE + "Light Purple");
                } else if (split[1].equalsIgnoreCase("yellow")) {
                    player.sendMessage(Colour.YELLOW + "Yellow");
                } else if (split[1].equalsIgnoreCase("white")) {
                    player.sendMessage(Colour.WHITE + "White");
                } else {
                    commandHelp(player);
                }
                if (split[1].equalsIgnoreCase("com.nexon.bluearchive")) {
                    player.sendMessage(Colour.AQUA + "Blue" + Colour.WHITE + "Archive");
                }
                return true;
            }
        }
        return false;
    }
}
