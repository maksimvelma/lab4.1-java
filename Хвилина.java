import java.util.Objects;

public class Хвилина {
    private int хвилина;

    public Хвилина(int хвилина) {
        this.хвилина = хвилина;
    }

    // перевизначення методів equals(), hashCode() та toString()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Хвилина хвилина1 = (Хвилина) obj;
        return хвилина == хвилина1.хвилина;
    }

    @Override
    public int hashCode() {
        return Objects.hash(хвилина);
    }

    @Override
    public String toString() {
        return String.valueOf(хвилина);
    }
}
