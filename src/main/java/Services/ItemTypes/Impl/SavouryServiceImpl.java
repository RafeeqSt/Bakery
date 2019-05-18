package Services.ItemTypes.Impl;

import Domain.ItemTypes.Savoury;
import Repository.ItemTypes.Impl.SavouryRepositoryImpl;
import Repository.ItemTypes.SavouryRepository;
import Services.ItemTypes.SavouryService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SavouryServiceImpl implements SavouryService {

    private static SavouryServiceImpl service = null;
    private SavouryRepository repository;

    private SavouryServiceImpl(){
        this.repository = SavouryRepositoryImpl.getRepository();
    }

    public static SavouryServiceImpl getService(){
        if (service == null) service = new SavouryServiceImpl();
        return service;
    }

    @Override
    public Savoury create(Savoury savoury){
        return this.repository.create(savoury);
    }

    @Override
    public Savoury update(Savoury savoury) {
        return this.repository.update(savoury);
    }

    @Override
    public Savoury read(String savouryCode){
        return this.repository.read(savouryCode);
    }

    @Override
    public void delete(String savouryCode) {
        this.repository.delete(savouryCode);
    }

    @Override
    public Set<Savoury> getAll(){
        return this.repository.getAll();
    }

}
