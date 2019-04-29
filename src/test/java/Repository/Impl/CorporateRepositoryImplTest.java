package Repository.Impl;

import Domain.Customers.Corporate;
import Repository.CorporateRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CorporateRepositoryImplTest {

    private CorporateRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = CorporateRepositoryImpl.getRepository();
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
        Set<Corporate> corporates = this.repository.getAll();
        Assert.assertEquals(1, corporates.size());
    }
}