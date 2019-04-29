package Repository;

import Domain.ItemTypes.LargeCake;

import java.util.Set;

public interface LargeCakeRepository extends IRepository<LargeCake, String> {

    Set<LargeCake> getAll();

}
