package Repository;

import Domain.Profile.Profile;

import java.util.Set;

public interface ProfileRepositpry extends IRepository<Profile, String> {

    Set<Profile> getAll();

}
