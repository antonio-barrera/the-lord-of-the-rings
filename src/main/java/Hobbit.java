public class Hobbit extends Hero {
    public Hobbit() {
        super(200);
    }

    @Override
    public double attack(Entity entity) {
        double attackValue = super.attack(entity);
        if (entity.getClass().getTypeName().equals("Gobblin"))
            attackValue -= 5;
        return attackValue;
    }
}
