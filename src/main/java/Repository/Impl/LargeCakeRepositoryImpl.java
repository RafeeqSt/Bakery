package Repository.Impl;

import Domain.ItemTypes.LargeCake;
import Repository.LargeCakeRepository;

import java.util.HashSet;
import java.util.Set;

public class LargeCakeRepositoryImpl implements LargeCakeRepository {

    private static LargeCakeRepositoryImpl repository = null;
    private Set<LargeCake> largeCakes;

    private LargeCakeRepositoryImpl(){
        this.largeCakes = new HashSet<>();
    }

    public static LargeCakeRepositoryImpl getRepository(){
        if (repository == null) repository = new LargeCakeRepositoryImpl();
        return repository;
    }

    private LargeCake findLargeCake(String largeCakeCode)
    {
        return this.largeCakes.stream()
                .filter(LargeCake -> LargeCake.getLargeCakeCode().trim()
                        .equals(LargeCake)).findAny().orElse(null);
    }

    @Override
    public Set<LargeCake> getAll() {
        return this.largeCakes;
    }

    @Override
    public LargeCake create(LargeCake largeCake) {
        this.largeCakes.add(largeCake);
        return largeCake;
    }

    @Override
    public LargeCake update(LargeCake largeCake) {
        String id = largeCake.getLargeCakeCode();

        LargeCake largeCakeFind = findLargeCake(id);

        largeCakes.remove(largeCakeFind);
        largeCakes.add(largeCake);

        return null;
    }

    @Override
    public void delete(String s) {
        LargeCake largeCake = findLargeCake(s);
        largeCakes.remove(largeCake);
    }

    @Override
    public LargeCake read(String s) {
        LargeCake largeCake = findLargeCake(s);
        return largeCake == null ? null: largeCake;
    }

}
