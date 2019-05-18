package Services.Customers.Impl;

import Domain.Customers.Domestic;
import Repository.Customers.DomesticRepository;
import Repository.Customers.Impl.DomesticRepositoryImpl;
import Services.Customers.DomesticService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DomesticServiceImpl implements DomesticService {

    private static DomesticServiceImpl service = null;
    private DomesticRepository repository;

    private DomesticServiceImpl(){
        this.repository = DomesticRepositoryImpl.getRepository();
    }

    public static DomesticServiceImpl getService(){
        if (service == null) service = new DomesticServiceImpl();
        return service;
    }

    @Override
    public Domestic create(Domestic domestic){
        return this.repository.create(domestic);
    }

    @Override
    public Domestic update(Domestic domestic) {
        return this.repository.update(domestic);
    }

    @Override
    public Domestic read(String companyId){
        return this.repository.read(companyId);
    }

    @Override
    public void delete(String companyId) {
        this.repository.delete(companyId);
    }

    @Override
    public Set<Domestic> getAll(){
        return this.repository.getAll();
    }
}
