package Factory.Profile;

import Domain.Profile.Owner;

public class OwnerFactory {

    public static Owner getOwner(String username, String password) {
        return new Owner.Builder().username(username)
                .password(password)
                .build();
    }
}
