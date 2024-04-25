package br.inatel.dm111promo.messaging;

public record Event(EventType type, Operation operation, PromoMessage data) {
}
