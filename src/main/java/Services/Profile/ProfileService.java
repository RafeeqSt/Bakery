package Services.Profile;

import Domain.Profile.Profile;
import Services.IService;

import java.util.Set;

public interface ProfileService extends IService<Profile, String> {

    Set<Profile> getAll();

}
