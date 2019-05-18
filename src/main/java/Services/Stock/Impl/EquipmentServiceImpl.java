package Services.Stock.Impl;

import Domain.Stock.Equipment;
import Repository.Stock.EquipmentRepository;
import Repository.Stock.Impl.EquipmentRepositoryImpl;
import Services.Stock.EquipmentService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    private static EquipmentServiceImpl service = null;
    private EquipmentRepository repository;

    private EquipmentServiceImpl(){
        this.repository = EquipmentRepositoryImpl.getRepository();
    }

    public static EquipmentServiceImpl getService(){
        if (service == null) service = new EquipmentServiceImpl();
        return service;
    }

    @Override
    public Equipment create(Equipment equipment){
        return this.repository.create(equipment);
    }

    @Override
    public Equipment update(Equipment equipment) {
        return this.repository.update(equipment);
    }

    @Override
    public Equipment read(String equipID){
        return this.repository.read(equipID);
    }

    @Override
    public void delete(String equipID) {
        this.repository.delete(equipID);
    }

    @Override
    public Set<Equipment> getAll(){
        return this.repository.getAll();
    }

}
