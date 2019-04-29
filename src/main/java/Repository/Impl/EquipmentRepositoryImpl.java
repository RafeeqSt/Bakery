package Repository.Impl;

import Domain.Stock.Equipment;
import Repository.EquipmentRepository;

import java.util.HashSet;
import java.util.Set;

public class EquipmentRepositoryImpl implements EquipmentRepository {

    private static EquipmentRepositoryImpl repository = null;
    private Set<Equipment> equipments;

    private EquipmentRepositoryImpl(){
        this.equipments = new HashSet<>();
    }

    public static EquipmentRepositoryImpl getRepository(){
        if (repository == null) repository = new EquipmentRepositoryImpl();
        return repository;
    }

    private Equipment findEquipment(String equipId)
    {
        return this.equipments.stream()
                .filter(Equipment -> Equipment.getEquipID().trim()
                        .equals(Equipment)).findAny().orElse(null);
    }

    @Override
    public Set<Equipment> getAll() {
        return this.equipments;
    }

    @Override
    public Equipment create(Equipment equipment) {
        this.equipments.add(equipment);
        return equipment;
    }

    @Override
    public Equipment update(Equipment equipment) {
        String id = equipment.getEquipID();

        Equipment equipmentFind = findEquipment(id);

        equipments.remove(equipmentFind);
        equipments.add(equipment);

        return null;
    }

    @Override
    public void delete(String s) {
        Equipment equipment = findEquipment(s);
        equipments.remove(equipment);
    }

    @Override
    public Equipment read(String s) {
        Equipment equipment = findEquipment(s);
        return equipment == null ? null: equipment;
    }

}
