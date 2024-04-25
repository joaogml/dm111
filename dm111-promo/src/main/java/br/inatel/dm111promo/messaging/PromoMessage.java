package br.inatel.dm111promo.messaging;

import java.util.List;

public record PromoMessage(
        String id,
        String name,
        String starting,
        String expiration,
        List<String>productsForYou,
        List<String>products,
        long lastUpdatedOn
) {
}
