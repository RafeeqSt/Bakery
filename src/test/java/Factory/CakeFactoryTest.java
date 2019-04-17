package Factory;

import Domain.ItemTypes.Cake;
import org.junit.Test;

import static org.junit.Assert.*;

public class CakeFactoryTest {

    @Test
    public void getCakeType() {
        String cakeTpe = "Chocolate";
        Cake cake = CakeFactory.getCakeType(cakeTpe);
        assertNotNull(cake.getCakeType());
    }
}