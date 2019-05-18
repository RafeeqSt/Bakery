package Services.ItemTypes;

import Domain.ItemTypes.SmallCake;
import Services.IService;

import java.util.Set;

public interface SmallCakeService extends IService<SmallCake, String> {

    Set<SmallCake> getAll();

}
