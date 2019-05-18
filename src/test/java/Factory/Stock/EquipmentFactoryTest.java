package Factory.Stock;

import Domain.Stock.Equipment;
import org.junit.Test;

import static org.junit.Assert.*;

public class EquipmentFactoryTest {

    @Test
    public void getEquipment() {
        String equipID = "754";
        Equipment equipment = EquipmentFactory.getEquipment(equipID);
        assertNotNull(equipment.getEquipID());
    }
}