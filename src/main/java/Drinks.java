import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Drinks {
    Cola(1),
    ColaZero(2),
    Sprite(3),
    Fanta(4),
    FuzeTea(5);

    public int getCode() {
        return code;
    }

    private static final Map<Integer, Drinks> MACHINE_FIGURE_INPUTS = Arrays.stream(values()) .collect(Collectors.toMap(Drinks::getCode, drink -> drink));


    private final int code;

    private Drinks(int code){
        this.code = code;
    }
    public int GetCode(){
        return this.code;
    }

    public static Drinks fromCode(int code) { return MACHINE_FIGURE_INPUTS .get(code); }
}
