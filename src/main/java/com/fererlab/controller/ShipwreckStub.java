package com.fererlab.controller;

import com.fererlab.model.Shipwreck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipwreckStub {

    private static Map<Long, Shipwreck> wrecks = new HashMap<>();
    private static Long idIndex = 3L;

    static {
        Shipwreck a = new Shipwreck(1L, "U869", "A very deep UBoat", "FAIR", 200, 33.2, 32.1, 2000);
        Shipwreck b = new Shipwreck(2L, "Thistlegorm", "British merchant boat", "FAIR", 150, 23.2, 22.2, 1980);
        Shipwreck c = new Shipwreck(3L, "S.S. Yongala", "A luxury passenger ship", "FAIR", 100, 13.2, 12.2, 1990);
        wrecks.put(a.getId(), a);
        wrecks.put(b.getId(), b);
        wrecks.put(c.getId(), c);
    }

    public static List<Shipwreck> list() {
        return new ArrayList<>(wrecks.values());
    }

    public static Shipwreck create(Shipwreck shipwreck) {
        idIndex = idIndex + 1;
        shipwreck.setId(idIndex);
        wrecks.put(idIndex, shipwreck);
        return shipwreck;
    }

    public static Shipwreck get(Long id) {
        return wrecks.get(id);
    }

    public static Shipwreck update(Long id, Shipwreck shipwreck) {
        shipwreck.setId(id);
        wrecks.put(id, shipwreck);
        return shipwreck;
    }

    public static Shipwreck delete(Long id) {
        return wrecks.remove(id);
    }
}
