package Repository.Stock;

import Domain.Stock.Equipment;
import Repository.IRepository;

import java.util.Set;

public interface EquipmentRepository extends IRepository<Equipment, String> {

    Set<Equipment> getAll();

}
