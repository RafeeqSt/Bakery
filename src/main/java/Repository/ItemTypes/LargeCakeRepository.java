package Repository.ItemTypes;

import Domain.ItemTypes.LargeCake;
import Repository.IRepository;

import java.util.Set;

public interface LargeCakeRepository extends IRepository<LargeCake, String> {

    Set<LargeCake> getAll();

}
