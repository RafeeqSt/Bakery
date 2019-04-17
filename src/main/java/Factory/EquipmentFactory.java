package Factory;

import Domain.Stock.Equipment;

public class EquipmentFactory {

    public static Equipment getEquipment(String equipID) {
        return new Equipment.Builder().equipID(equipID)
                .build();
    }
}
