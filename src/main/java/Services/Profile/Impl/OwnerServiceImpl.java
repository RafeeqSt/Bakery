package Services.Profile.Impl;

import Domain.Profile.Owner;
import Repository.Profile.Impl.OwnerRepositoryImpl;
import Repository.Profile.OwnerRepository;
import Services.Profile.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceImpl implements OwnerService {

    private static OwnerServiceImpl service = null;
    private OwnerRepository repository;

    private OwnerServiceImpl(){
        this.repository = OwnerRepositoryImpl.getRepository();
    }

    public static OwnerServiceImpl getService(){
        if (service == null) service = new OwnerServiceImpl();
        return service;
    }

    @Override
    public Owner create(Owner owner){
        return this.repository.create(owner);
    }

    @Override
    public Owner update(Owner owner) {
        return this.repository.update(owner);
    }

    @Override
    public Owner read(String userName){
        return this.repository.read(userName);
    }

    @Override
    public void delete(String userName) {
        this.repository.delete(userName);
    }

    @Override
    public Set<Owner> getAll(){
        return this.repository.getAll();
    }

}
