package Repository.ItemTypes;

import Domain.ItemTypes.Cake;
import Repository.IRepository;

import java.util.Set;

public interface CakeRepository extends IRepository<Cake, String> {

    Set<Cake> getAll();

}
