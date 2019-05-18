package Services.Profile;

import Domain.Profile.Owner;
import Services.IService;

import java.util.Set;

public interface OwnerService extends IService<Owner, String> {

    Set<Owner> getAll();

}
