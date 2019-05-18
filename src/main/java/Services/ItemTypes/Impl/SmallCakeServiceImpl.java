package Services.ItemTypes.Impl;

import Domain.ItemTypes.SmallCake;
import Repository.ItemTypes.Impl.SmallCakeRepositoryImpl;
import Repository.ItemTypes.SmallCakeRepository;
import Services.ItemTypes.SmallCakeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SmallCakeServiceImpl implements SmallCakeService {

    private static SmallCakeServiceImpl service = null;
    private SmallCakeRepository repository;

    private SmallCakeServiceImpl(){
        this.repository = SmallCakeRepositoryImpl.getRepository();
    }

    public static SmallCakeServiceImpl getService(){
        if (service == null) service = new SmallCakeServiceImpl();
        return service;
    }

    @Override
    public SmallCake create(SmallCake smallCake){
        return this.repository.create(smallCake);
    }

    @Override
    public SmallCake update(SmallCake smallCake) {
        return this.repository.update(smallCake);
    }

    @Override
    public SmallCake read(String smallCakeCode){
        return this.repository.read(smallCakeCode);
    }

    @Override
    public void delete(String smallCakeCode) {
        this.repository.delete(smallCakeCode);
    }

    @Override
    public Set<SmallCake> getAll(){
        return this.repository.getAll();
    }

}
