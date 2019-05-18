package Services.ItemTypes;

import Domain.ItemTypes.Cake;
import Services.IService;

import java.util.Set;

public interface CakeService extends IService<Cake, String> {

    Set<Cake> getAll();

}
