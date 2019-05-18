package Repository.ItemTypes;

import Domain.ItemTypes.SmallCake;
import Repository.IRepository;

import java.util.Set;

public interface SmallCakeRepository extends IRepository<SmallCake, String> {

    Set<SmallCake> getAll();

}
