package Factory.Profile;

import Domain.Profile.Owner;
import org.junit.Test;

import static org.junit.Assert.*;

public class OwnerFactoryTest {

    @Test
    public void getOwner() {
        String username = "Emp";
        String password = "pass";
        Owner owner = OwnerFactory.getOwner(username,password);
        assertNotNull(owner.getUsername(),owner.getPassword());
    }
}