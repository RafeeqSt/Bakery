package Services.ItemTypes;

import Domain.ItemTypes.Savoury;
import Services.IService;

import java.util.Set;

public interface SavouryService extends IService<Savoury, String> {

    Set<Savoury> getAll();

}
