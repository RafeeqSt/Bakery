package Repository.Profile;

import Domain.Profile.Owner;
import Repository.IRepository;

import java.util.Set;

public interface OwnerRepository extends IRepository<Owner, String> {

    Set<Owner> getAll();

}
