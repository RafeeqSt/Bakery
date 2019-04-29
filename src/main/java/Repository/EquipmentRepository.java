package Repository;

import Domain.Stock.Equipment;

import java.util.Set;

public interface EquipmentRepository extends IRepository<Equipment, String> {

    Set<Equipment> getAll();

}
