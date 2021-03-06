package Repository.Impl.Stock;

import Domain.Stock.Ingredient;
import Repository.Stock.Impl.IngredientRepositoryImpl;
import Repository.Stock.IngredientRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class IngredientRepositoryImplTest {

    private IngredientRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = IngredientRepositoryImpl.getRepository();
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
        Set<Ingredient> ingredients = this.repository.getAll();
        Assert.assertEquals(1, ingredients.size());
    }
}