public class Warrior extends Hero{
    public Warrior(int health, int damage, String superPowersType) {
        super(health, damage, superPowersType);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Warrior применил суперспособность: " + getSuperPowersType());
    }
    public String info (){
        return super.info();
    }
}
