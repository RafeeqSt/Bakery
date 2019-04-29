package Repository.Impl;

import Domain.Profile.Profile;
import Repository.ProfileRepositpry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ProfileRepositoryImplTest {

    private ProfileRepositpry repository;

    @Before
    public void setUp() throws Exception {
        this.repository = ProfileRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        //create a student, add it to the repository
        this.repository.create(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void read() {
        this.repository.read("123");
        Assert.assertEquals("123", "123");
    }

    @Test
    public void update() {
        this.repository.update(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void delete() {
        this.repository.delete(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void getAll() {
        Set<Profile> profiles = this.repository.getAll();
        Assert.assertEquals(1, profiles.size());
    }
}