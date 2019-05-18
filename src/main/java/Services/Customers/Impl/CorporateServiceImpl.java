package Services.Customers.Impl;

import Domain.Customers.Corporate;
import Repository.Customers.CorporateRepository;
import Repository.Customers.Impl.CorporateRepositoryImpl;
import Services.Customers.CorporateService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CorporateServiceImpl implements CorporateService {

    private static CorporateServiceImpl service = null;
    private CorporateRepository repository;

    private CorporateServiceImpl(){
        this.repository = CorporateRepositoryImpl.getRepository();
    }

    public static CorporateServiceImpl getService(){
        if (service == null) service = new CorporateServiceImpl();
        return service;
    }

    @Override
    public Corporate create(Corporate corporate){
        return this.repository.create(corporate);
    }

    @Override
    public Corporate update(Corporate corporate) {
        return this.repository.update(corporate);
    }

    @Override
    public Corporate read(String companyId){
        return this.repository.read(companyId);
    }

    @Override
    public void delete(String companyId) {
        this.repository.delete(companyId);
    }

    @Override
    public Set<Corporate> getAll(){
        return this.repository.getAll();
    }

    }
