import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddShould {
    @Test
    public void returnZeroWhenNull(){
        assertEquals(0, Add.add(null));
    }

    @Test
    public void returnZeroWhenEmptyString(){
        assertEquals(0, Add.add(""));
    }


}
