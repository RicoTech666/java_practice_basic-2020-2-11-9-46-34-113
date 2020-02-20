package module;

public enum CardType {
    SPADE("黑桃"),
    HEART("红桃"),
    CLUB("梅花"),
    DIAMOND("方片");

    private String name;

    CardType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
