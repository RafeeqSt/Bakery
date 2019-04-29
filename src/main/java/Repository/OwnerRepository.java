package Repository;

import Domain.Profile.Owner;

import java.util.Set;

public interface OwnerRepository extends IRepository<Owner, String> {

    Set<Owner> getAll();

}
