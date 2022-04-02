public enum Weapontype  {
    AXE(3),
    PICKAXE(2);

    private double damage;
    Weapontype(double damage) {
        this.damage = damage;
    }
    public double getDamage() {
        return damage;
    }
}
