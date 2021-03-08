package lambad.kup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GetNextEvenTest {

    @Test
    public void getNextEvenNumberTest() {

        Long test1 = (Long) GetNextEven.getNextEvenNumber.apply(34L);
        Assertions.assertEquals(Long.valueOf(36), test1);

        Long test2 = (Long) GetNextEven.getNextEvenNumber.apply(66666L);
        Assertions.assertEquals(Long.valueOf(66668), test2);

        Long test3 = (Long) GetNextEven.getNextEvenNumber.apply(90453L);
        Assertions.assertEquals(Long.valueOf(90454), test3);

        Long test4 = (Long) GetNextEven.getNextEvenNumber.apply(0L);
        Assertions.assertEquals(Long.valueOf(2), test4);


    }

}
