package Services.ItemTypes;

import Domain.ItemTypes.LargeCake;
import Services.IService;

import java.util.Set;

public interface LargeCakeService extends IService<LargeCake, String> {

    Set<LargeCake> getAll();

}
