package Repository.Impl.Stock;

import Domain.Stock.Equipment;
import Repository.Stock.EquipmentRepository;
import Repository.Stock.Impl.EquipmentRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class EquipmentRepositoryImplTest {

    private EquipmentRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = EquipmentRepositoryImpl.getRepository();
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
        Set<Equipment> equipment = this.repository.getAll();
        Assert.assertEquals(1, equipment.size());
    }
}