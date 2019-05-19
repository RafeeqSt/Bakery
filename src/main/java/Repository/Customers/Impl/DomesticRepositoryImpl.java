package Repository.Customers.Impl;

import Domain.Customers.Domestic;
import Repository.Customers.DomesticRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class DomesticRepositoryImpl implements DomesticRepository {

    private static DomesticRepositoryImpl repository = null;
    private Set<Domestic> domestics;

    private DomesticRepositoryImpl(){
        this.domestics = new HashSet<>();
    }

    public static DomesticRepositoryImpl getRepository(){
        if (repository == null) repository = new DomesticRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Domestic> getAll() {
        return this.domestics;
    }

    @Override
    public Domestic create(Domestic domestic) {
        this.domestics.add(domestic);
        return domestic;
    }

    @Override
    public Domestic update(Domestic domestic) {
        String id = domestic.getClientName();

        Domestic domesticFind = findDomestic(id);

        domestics.remove(domesticFind);
        domestics.add(domestic);

        return null;
    }

    @Override
    public void delete(String s) {
        Domestic domestic = findDomestic(s);
        domestics.remove(domestic);
    }

    @Override
    public Domestic read(String s) {
        Domestic domestic = findDomestic(s);
        return domestic == null ? null: domestic;
    }

    private Domestic findDomestic(String domesticId)
    {
        return this.domestics.stream()
                .filter(Domestic -> Domestic.getClientName().trim()
                        .equals(Domestic)).findAny().orElse(null);
    }
}
