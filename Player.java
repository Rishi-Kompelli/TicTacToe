public class Player {
    String Name;
    String Symbol;
    public Player(String name, String symbol) {
        Name = name;
        Symbol = symbol;
    }
    public String getPlayer() {
        return Name;
    }
    public String getSymbol() {
        return Symbol;
    }
    public String toString(){
        return String.format("%s: %s", Name, Symbol);
    }
}
