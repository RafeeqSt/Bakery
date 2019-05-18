package Services.ItemTypes.Impl;

import Domain.ItemTypes.Cake;
import Repository.ItemTypes.CakeRepository;
import Repository.ItemTypes.Impl.CakeRepositoryImpl;
import Services.ItemTypes.CakeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CakeServiceImpl implements CakeService {

    private static CakeServiceImpl service = null;
    private CakeRepository repository;

    private CakeServiceImpl(){
        this.repository = CakeRepositoryImpl.getRepository();
    }

    public static CakeServiceImpl getService(){
        if (service == null) service = new CakeServiceImpl();
        return service;
    }

    @Override
    public Cake create(Cake cake){
        return this.repository.create(cake);
    }

    @Override
    public Cake update(Cake cake) {
        return this.repository.update(cake);
    }

    @Override
    public Cake read(String cakeType){
        return this.repository.read(cakeType);
    }

    @Override
    public void delete(String cakeType) {
        this.repository.delete(cakeType);
    }

    @Override
    public Set<Cake> getAll(){
        return this.repository.getAll();
    }
}
