public abstract class Hero implements HavingSuperAbility{
    private int health;
    private int damage;
    private String superPowersType;

    public Hero(int health, int damage, String superPowersType){
        this.health = health;
        this.damage = damage;
        this.superPowersType = superPowersType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperPowersType() {
        return superPowersType;
    }

    public void setSuperPowersType(String superPowersType) {
        this.superPowersType = superPowersType;
    }

    public String info (){
        return "Здоровье: " + this.health + ", Урон: " + this.damage +", " + this.superPowersType;
    }
}
