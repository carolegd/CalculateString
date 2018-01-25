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

    @Test
    public void returnOneWhenOne(){
        assertEquals(1, Add.add("1"));
    }

    @Test
    public void returnTwoWhenTwo(){
        assertEquals(2, Add.add("2"));
    }

    @Test
    public void returnThreeWhenOneAndTwo(){
        assertEquals(3, Add.add("1,2"));
    }
}
