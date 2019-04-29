package Repository.Impl;

import Domain.ItemTypes.Cake;
import Repository.CakeRepository;

import java.util.HashSet;
import java.util.Set;

public class CakeRepositoryImpl implements CakeRepository {

    private static CakeRepositoryImpl repository = null;
    private Set<Cake> cakes;

    private CakeRepositoryImpl(){
        this.cakes = new HashSet<>();
    }

    public static CakeRepositoryImpl getRepository(){
        if (repository == null) repository = new CakeRepositoryImpl();
        return repository;
    }

    private Cake findCake(String cakeType)
    {
        return this.cakes.stream()
                .filter(Cake -> Cake.getCakeType().trim()
                        .equals(Cake)).findAny().orElse(null);
    }

    @Override
    public Set<Cake> getAll() {
        return this.cakes;
    }

    @Override
    public Cake create(Cake cake) {
        this.cakes.add(cake);
        return cake;
    }

    @Override
    public Cake update(Cake cake) {
        String id = cake.getCakeType();

        Cake cakeFind = findCake(id);

        cakes.remove(cakeFind);
        cakes.add(cake);
        return null;
    }

    @Override
    public void delete(String s) {
        Cake cake = findCake(s);
        cakes.remove(cake);
    }

    @Override
    public Cake read(String s) {
        Cake cake = findCake(s);
        return cake == null ? null: cake;
    }
}
