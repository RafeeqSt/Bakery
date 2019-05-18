package Repository.ItemTypes.Impl;

import Domain.ItemTypes.SmallCake;
import Repository.ItemTypes.SmallCakeRepository;

import java.util.HashSet;
import java.util.Set;

public class SmallCakeRepositoryImpl implements SmallCakeRepository {

    private static SmallCakeRepositoryImpl repository = null;
    private Set<SmallCake> smallCakes;

    private SmallCakeRepositoryImpl(){
        this.smallCakes = new HashSet<>();
    }

    public static SmallCakeRepositoryImpl getRepository(){
        if (repository == null) repository = new SmallCakeRepositoryImpl();
        return repository;
    }

    private SmallCake findSmallCake(String smallCakeCode)
    {
        return this.smallCakes.stream()
                .filter(SmallCake -> SmallCake.getSmallCakeCode().trim()
                        .equals(SmallCake)).findAny().orElse(null);
    }

    @Override
    public Set<SmallCake> getAll() {
        return this.smallCakes;
    }

    @Override
    public SmallCake create(SmallCake smallCake) {
        this.smallCakes.add(smallCake);
        return smallCake;
    }

    @Override
    public SmallCake update(SmallCake smallCake) {
        String id = smallCake.getSmallCakeCode();

        SmallCake smallCakeFind = findSmallCake(id);

        smallCakes.remove(smallCakeFind);
        smallCakes.add(smallCake);

        return null;
    }

    @Override
    public void delete(String s) {
        SmallCake smallCake = findSmallCake(s);
        smallCakes.remove(smallCake);
    }

    @Override
    public SmallCake read(String s) {
        SmallCake smallCake = findSmallCake(s);
        return smallCake == null ? null: smallCake;
    }

}
