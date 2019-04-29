package Repository;

import Domain.ItemTypes.Savoury;

import java.util.Set;

public interface SavouryRepository extends IRepository<Savoury, String> {

    Set<Savoury> getAll();

}
