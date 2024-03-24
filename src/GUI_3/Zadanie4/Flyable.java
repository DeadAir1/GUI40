package GUI_3.Zadanie4;

public interface Flyable {
    String drive();
    double distance();

    static Flyable hybrid(Flyable a, Flyable b){
            return new Flyable() {
                @Override
                public String drive() {
                    return a.drive()+"," + b.drive();
                }

                @Override
                public double distance() {
                    return Math.max(a.distance(), b.distance());
                }
            };
    }
}
