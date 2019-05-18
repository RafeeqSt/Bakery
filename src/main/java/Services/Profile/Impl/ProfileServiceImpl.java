package Services.Profile.Impl;

import Domain.Profile.Profile;
import Repository.Profile.Impl.ProfileRepositoryImpl;
import Repository.Profile.ProfileRepositpry;
import Services.Profile.ProfileService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ProfileServiceImpl implements ProfileService {

    private static ProfileServiceImpl service = null;
    private ProfileRepositpry repository;

    private ProfileServiceImpl(){
        this.repository = ProfileRepositoryImpl.getRepository();
    }

    public static ProfileServiceImpl getService(){
        if (service == null) service = new ProfileServiceImpl();
        return service;
    }

    @Override
    public Profile create(Profile owner){
        return this.repository.create(owner);
    }

    @Override
    public Profile update(Profile owner) {
        return this.repository.update(owner);
    }

    @Override
    public Profile read(String userName){
        return this.repository.read(userName);
    }

    @Override
    public void delete(String userName) {
        this.repository.delete(userName);
    }

    @Override
    public Set<Profile> getAll(){
        return this.repository.getAll();
    }

}
