package br.inatel.dm111promo.api.promo;

import java.util.List;

public record PromoRequest(String name, String starting, String expiration, List<String> productsForYou, List<String> products) {
}