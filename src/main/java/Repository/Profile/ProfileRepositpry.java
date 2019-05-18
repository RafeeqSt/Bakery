package Repository.Profile;

import Domain.Profile.Profile;
import Repository.IRepository;

import java.util.Set;

public interface ProfileRepositpry extends IRepository<Profile, String> {

    Set<Profile> getAll();

}
