package Services.Stock;

import Domain.Stock.Equipment;
import Services.IService;

import java.util.Set;

public interface EquipmentService extends IService<Equipment, String> {

    Set<Equipment> getAll();

}
