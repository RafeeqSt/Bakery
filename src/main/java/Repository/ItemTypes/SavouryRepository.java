package Repository.ItemTypes;

import Domain.ItemTypes.Savoury;
import Repository.IRepository;

import java.util.Set;

public interface SavouryRepository extends IRepository<Savoury, String> {

    Set<Savoury> getAll();

}
