package Repository;

import Domain.ItemTypes.Cake;

import java.util.Set;

public interface CakeRepository extends IRepository<Cake, String> {

    Set<Cake> getAll();

}
