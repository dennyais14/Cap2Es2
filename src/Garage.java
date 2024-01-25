import java.util.Arrays;

public class Garage {
    Auto[] auto;

    @Override
    public String toString() {
        return "Garage{" +
                "auto=" + Arrays.toString(auto) +
                '}';
    }

    public Garage(Auto[] auto) {

}
}
