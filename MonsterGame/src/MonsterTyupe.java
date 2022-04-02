public enum MonsterTyupe {
    ZOMBIE(2, 5),
    SKELETON(3, 6);

    private double damage;
    private double hp;
    MonsterTyupe(double damage, double hp) {
        this.damage = damage;
        this.hp = hp;
    }
    public double getDamage() {
        return damage;
    }
    public double getHp() {
        return hp;

    }
}
