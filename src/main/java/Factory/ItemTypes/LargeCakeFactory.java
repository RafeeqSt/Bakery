package Factory.ItemTypes;

import Domain.ItemTypes.LargeCake;

public class LargeCakeFactory {

    public static LargeCake getLargeCake(String largeCakeCode) {
        return new LargeCake.Builder().largeCakeCode(largeCakeCode)
                .build();
    }
}
