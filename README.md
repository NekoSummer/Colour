# Colour

-------------

An hMod plugin with modern colours. Utilise `Colour.toANSI()` to display colours in the console as well!

### Constant spelling differences

(I personally favour British English.)

| Colour Plugin (GB) | Bukkit (US)         |
| :-------------     | :-------------      |
| GREY               | GRAY                |
| DARK_GREY          | DARK_GRAY           |

### WARNING
When utilising the `toANSI` function provided by this plugin, <br>
ensure that you append `Colour.RESET` at the end of your text to avoid <br>
colour bleed in the terminal.

### Build
The project can be built using either Ant or Maven.

```bash
# Using Ant 
ant clean build

# Using Maven 
mvn clean package

# Using Maven Daemon (Faster alternative)
mvnd clean package
```