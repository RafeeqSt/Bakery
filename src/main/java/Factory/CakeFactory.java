package Factory;

import Domain.ItemTypes.Cake;

public class CakeFactory {

    public static Cake getCakeType(String cakeType) {
        return new Cake.Builder().cakeType(cakeType)
                .build();
    }
}
