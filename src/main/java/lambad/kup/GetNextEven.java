package lambad.kup;

import java.util.function.Function;

public class GetNextEven {

    public static Function<Long, Object> getNextEvenNumber = (num) -> num%2==0?num+2:num+1;
}
