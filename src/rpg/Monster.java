package rpg;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double Damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        Damage = damage;

    }

    public abstract double attack();

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return Damage;
    }
}

