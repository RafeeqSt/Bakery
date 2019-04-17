package Factory;

import Domain.ItemTypes.Savoury;
import org.junit.Test;

import static org.junit.Assert.*;

public class SavouryFactoryTest {

    @Test
    public void getSavoury() {
        String savouryCode = "1";
        Savoury profile = SavouryFactory.getSavoury(savouryCode);
        assertNotNull(profile.getSmallCakeCode());
    }
}