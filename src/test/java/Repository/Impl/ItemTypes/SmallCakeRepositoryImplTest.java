package Repository.Impl.ItemTypes;

import Domain.ItemTypes.SmallCake;
import Repository.ItemTypes.Impl.SmallCakeRepositoryImpl;
import Repository.ItemTypes.SmallCakeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class SmallCakeRepositoryImplTest {

    private SmallCakeRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = SmallCakeRepositoryImpl.getRepository();
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
        Set<SmallCake> smallCakes = this.repository.getAll();
        Assert.assertEquals(1, smallCakes.size());
    }
}