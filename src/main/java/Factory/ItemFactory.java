package Factory;


import Domain.Item;

public class ItemFactory {

    public static Item getCompany(String name,int price) {
        return new Item.Builder().name(name)
                .price(price)
                .build();
    }
}