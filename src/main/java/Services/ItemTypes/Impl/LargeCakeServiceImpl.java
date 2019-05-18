package Services.ItemTypes.Impl;

import Domain.ItemTypes.LargeCake;
import Repository.ItemTypes.Impl.LargeCakeRepositoryImpl;
import Repository.ItemTypes.LargeCakeRepository;
import Services.ItemTypes.LargeCakeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class LargeCakeServiceImpl implements LargeCakeService {

    private static LargeCakeServiceImpl service = null;
    private LargeCakeRepository repository;

    private LargeCakeServiceImpl(){
        this.repository = LargeCakeRepositoryImpl.getRepository();
    }

    public static LargeCakeServiceImpl getService(){
        if (service == null) service = new LargeCakeServiceImpl();
        return service;
    }

    @Override
    public LargeCake create(LargeCake largeCake){
        return this.repository.create(largeCake);
    }

    @Override
    public LargeCake update(LargeCake largeCake) {
        return this.repository.update(largeCake);
    }

    @Override
    public LargeCake read(String cakeType){
        return this.repository.read(cakeType);
    }

    @Override
    public void delete(String cakeType) {
        this.repository.delete(cakeType);
    }

    @Override
    public Set<LargeCake> getAll(){
        return this.repository.getAll();
    }

}
