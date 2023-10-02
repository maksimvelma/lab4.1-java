import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        Час година = new Час(18);
        Хвилина хвилина = new Хвилина(30);

        Доба доба = new Доба(година, хвилина);
        System.out.println("Поточний час: " + година + ":" + хвилина);

        доба.вивестиЧасДоби();
    }
}
