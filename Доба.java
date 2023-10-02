import java.util.Objects;

public class Доба {
    private Час година;
    private Хвилина хвилина;

    public Доба(Час година, Хвилина хвилина) {
        this.година = година;
        this.хвилина = хвилина;
    }

    // перевизначення методів equals(), hashCode() та toString()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Доба доба = (Доба) obj;
        return година.equals(доба.година) &&
                хвилина.equals(доба.хвилина);
    }

    @Override
    public int hashCode() {
        return Objects.hash(година, хвилина);
    }

    @Override
    public String toString() {
        return "Поточний час: " + година + ":" + хвилина;
    }

    // метод для розрахунку часу доби
    public void вивестиЧасДоби() {
        if (година.equals(new Час(6)) && хвилина.equals(new Хвилина(0)) ||
                година.equals(new Час(5)) && хвилина.equals(new Хвилина(1))) {
            System.out.println("Ранок");
        } else if (година.equals(new Час(12)) && хвилина.equals(new Хвилина(0))) {
            System.out.println("День");
        } else if (година.equals(new Час(18)) && хвилина.equals(new Хвилина(0))) {
            System.out.println("Вечір");
        } else {
            System.out.println("Ніч");
        }
    }
}
