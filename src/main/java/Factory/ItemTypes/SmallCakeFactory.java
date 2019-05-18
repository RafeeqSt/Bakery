package Factory.ItemTypes;

import Domain.ItemTypes.SmallCake;

public class SmallCakeFactory {

    public static SmallCake getSmallCake(String smallCakeCode) {
        return new SmallCake.Builder().smallCakeCode(smallCakeCode)
                .build();
    }
}
