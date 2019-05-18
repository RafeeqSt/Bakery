package Repository.Customers.Impl;

import Repository.Customers.CorporateRepository;
import Domain.Customers.Corporate;

import java.util.HashSet;
import java.util.Set;

public class CorporateRepositoryImpl implements CorporateRepository {

    private static CorporateRepositoryImpl repository = null;
    private Set<Corporate> corporates;

    private CorporateRepositoryImpl(){
        this.corporates = new HashSet<>();
    }

    public static CorporateRepositoryImpl getRepository(){
        if (repository == null) repository = new CorporateRepositoryImpl();
        return repository;
    }


    public Corporate create(Corporate corporate){
        this.corporates.add(corporate);
        return corporate;
    }

    @Override
    public Corporate update(Corporate corporate) {
        String id = corporate.getCompanyID();

        Corporate corporateFind = findCorporate(id);

        corporates.remove(corporateFind);
        corporates.add(corporate);

        return null;
    }



    public Corporate read(String companyId){
        // find the course that matches the id and return it if exist
        Corporate corporate = findCorporate(companyId);
        return corporate == null ? null: corporate;
    }

    public void delete(String companyId) {
        // find the course, delete it if it exist
        Corporate corporate = findCorporate(companyId);
        corporates.remove(corporate);
    }


    public Set<Corporate> getAll(){
        return this.corporates;
    }

    private Corporate findCorporate(String corporateId)
        {
            return this.corporates.stream()
                    .filter(Corporate -> Corporate.getCompanyID().trim()
                            .equals(Corporate)).findAny().orElse(null);
        }


    }
