 public class Magic extends Hero{
        public Magic(int health, int damage, String superPowersType) {
            super(health, damage, superPowersType);
        }

        @Override
        public void applySuperAbility(String superAbilityType) {
            System.out.println("Magic применил суперспособность: " + getSuperPowersType());
        }
        public String info (){
            return super.info();
        }
}
