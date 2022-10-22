public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic(250, 25, "BOOST");
        Medic medic = new Medic(200, 13, "Heal Points", 8);
        Warrior warrior = new Warrior(250, 20, "CRITICAL DAMAGE");
        Hero[] havingSuperAbility = {magic, medic, warrior};
        for (int i = 0; i < havingSuperAbility.length; i++) {
            havingSuperAbility[i].applySuperAbility("laser");
            System.out.println(havingSuperAbility[i].info());
            if(havingSuperAbility[i] == medic){
                System.out.println(medic.increaseExperience());
            }
        }
    }
}