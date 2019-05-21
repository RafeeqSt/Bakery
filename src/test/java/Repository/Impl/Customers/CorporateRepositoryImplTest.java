package Repository.Impl.Customers;

import Domain.Customers.Corporate;
import Factory.Customers.CorporateFactory;
import Repository.Customers.CorporateRepository;
import Repository.Customers.Impl.CorporateRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CorporateRepositoryImplTest {

    private CorporateRepository repository;
    private Corporate corporate;

    private Corporate getSavedCorporate() {
        Set<Corporate> savedCorporate = this.repository.getAll();
        return savedCorporate.iterator().next();
    }


    @Before
    public void setUp() throws Exception {
        this.repository = CorporateRepositoryImpl.getRepository();
        this.corporate = CorporateFactory.getCorporate("TestID","TestName");
    }

    @Test
    public void create() {
        Corporate created = this.repository.create(this.corporate);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.corporate);
    }

    @Test
    public void read() {
        Corporate savedCorporate = getSavedCorporate();
        System.out.println("In read, courseId = "+ savedCorporate.getCompanyID());
        Corporate read = this.repository.read(savedCorporate.getCompanyID());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedCorporate, read);
    }

    @Test
    public void update() {
        String newname = "New Test Corporate ID";
        Corporate corporate = new Corporate.Builder().copy(getSavedCorporate()).companyID(newname).build();
        System.out.println("In update, about_to_updated = " + corporate);
        Corporate updated = this.repository.update(corporate);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getCompanyID());
        getAll();
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