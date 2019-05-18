package Repository.ItemTypes.Impl;

import Domain.ItemTypes.Savoury;
import Repository.ItemTypes.SavouryRepository;

import java.util.HashSet;
import java.util.Set;

public class SavouryRepositoryImpl implements SavouryRepository {

    private static SavouryRepositoryImpl repository = null;
    private Set<Savoury> savourys;

    private SavouryRepositoryImpl(){
        this.savourys = new HashSet<>();
    }

    public static SavouryRepositoryImpl getRepository(){
        if (repository == null) repository = new SavouryRepositoryImpl();
        return repository;
    }

    private Savoury findSavoury(String savouryCode)
    {
        return this.savourys.stream()
                .filter(Savoury -> Savoury.getSavouryCode().trim()
                        .equals(Savoury)).findAny().orElse(null);
    }

    @Override
    public Set<Savoury> getAll() {
        return this.savourys;
    }

    @Override
    public Savoury create(Savoury savoury) {
        this.savourys.add(savoury);
        return savoury;
    }

    @Override
    public Savoury update(Savoury savoury) {
        String id = savoury.getSavouryCode();

        Savoury savouryFind = findSavoury(id);

        savourys.remove(savouryFind);
        savourys.add(savoury);

        return null;
    }

    @Override
    public void delete(String s) {
        Savoury savoury = findSavoury(s);
        savourys.remove(savoury);
    }

    @Override
    public Savoury read(String s) {
        Savoury savoury = findSavoury(s);
        return savoury == null ? null: savoury;
    }

}
