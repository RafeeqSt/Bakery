package Factory.ItemTypes;

import Domain.ItemTypes.SmallCake;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmallCakeFactoryTest {

    @Test
    public void getSmallCake() {
        String smallCakeCode = "34";
        SmallCake profile = SmallCakeFactory.getSmallCake(smallCakeCode);
        assertNotNull(profile.getSmallCakeCode());
    }
}