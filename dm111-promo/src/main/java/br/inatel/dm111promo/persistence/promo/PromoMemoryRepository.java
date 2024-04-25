package br.inatel.dm111promo.persistence.promo;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class PromoMemoryRepository implements PromoRepository{
    private Set<Promo> db = new HashSet<>();

    @Override
    public void save(Promo promo) {
        db.add(promo);
    }

    @Override
    public List<Promo> findAllById(String id) {
        return db.stream()
                .filter(spl -> spl.getId().equals(id))
                .toList();
    }

    @Override
    public Optional<Promo> findById(String id) {
        return db.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }
    @Override
    public void delete(String id) {
        db.removeIf(spl -> spl.getId().equals(id));
    }

    @Override
    public void update(Promo promo) {
        delete(promo.getId());
        save(promo);
    }
}
