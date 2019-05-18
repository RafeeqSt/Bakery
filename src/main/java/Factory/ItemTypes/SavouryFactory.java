package Factory.ItemTypes;

import Domain.ItemTypes.Savoury;

public class SavouryFactory {

    public static Savoury getSavoury(String savouryCode) {
        return new Savoury.Builder().savouryCode(savouryCode)
                .build();
    }
}
