public class Player {
    private String name;
    private double damage;
    private double hp;
    private double xp;

    public Player(String name, double damage, double hp, double xp) {
        this.damage = damage;
        this.name = name;
        this.hp = hp;
        this.xp = xp;
    }
    public void print() {
        System.out.println();
    }
}
