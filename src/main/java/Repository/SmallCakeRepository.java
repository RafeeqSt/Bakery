package Repository;

import Domain.ItemTypes.SmallCake;

import java.util.Set;

public interface SmallCakeRepository extends IRepository<SmallCake, String> {

    Set<SmallCake> getAll();

}
