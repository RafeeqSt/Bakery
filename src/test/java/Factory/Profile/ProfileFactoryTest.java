package Factory.Profile;

import Domain.Profile.Profile;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfileFactoryTest {

    @Test
    public void getProfile() {
        String accessLevel = "1";
        Profile profile = ProfileFactory.getProfile(accessLevel);
        assertNotNull(profile.getAccessLevel());
    }
}