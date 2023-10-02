import java.util.Objects;

public class Час {
    private int година;

    public Час(int година) {
        this.година = година;
    }

    // перевизначення методів equals(), hashCode() та toString()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Час час = (Час) obj;
        return година == час.година;
    }

    @Override
    public int hashCode() {
        return Objects.hash(година);
    }

    @Override
    public String toString() {
        return String.valueOf(година);
    }
}
