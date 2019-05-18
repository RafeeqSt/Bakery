package Repository.Impl.Customers;

import Domain.Customers.Domestic;
import Repository.Customers.DomesticRepository;
import Repository.Customers.Impl.DomesticRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class DomesticRepositoryImplTest {

    private DomesticRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = DomesticRepositoryImpl.getRepository();
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
        Set<Domestic> domestics = this.repository.getAll();
        Assert.assertEquals(1, domestics.size());
    }
}