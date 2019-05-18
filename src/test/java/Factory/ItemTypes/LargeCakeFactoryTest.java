package Factory.ItemTypes;

import Domain.ItemTypes.LargeCake;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargeCakeFactoryTest {

    @Test
    public void getLargeCake() {
        String largeCakeCode = "461";
        LargeCake largeCake = LargeCakeFactory.getLargeCake(largeCakeCode);
        assertNotNull(largeCake.getLargeCakeCode());
    }
}