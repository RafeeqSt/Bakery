package Factory;

import Domain.Profile.Profile;

public class ProfileFactory {

    public static Profile getProfile(String accessLevel) {
        return new Profile.Builder().accessLevel(accessLevel)
                .build();
    }
}
