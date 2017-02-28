package com.fererlab.controller;

import com.fererlab.model.Shipwreck;
import com.fererlab.repository.ShipwreckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    @Autowired
    private ShipwreckRepository repository;

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list() {
//        return ShipwreckStub.list();
        return repository.findAll();
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck) {
//        return ShipwreckStub.create(shipwreck);
        return repository.saveAndFlush(shipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
    public Shipwreck get(@PathVariable Long id) {
//        return ShipwreckStub.get(id);
        return repository.findOne(id);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
//        return ShipwreckStub.update(id, shipwreck);
        Shipwreck persisted = repository.findOne(id);
        BeanUtils.copyProperties(shipwreck, persisted);
        return repository.saveAndFlush(persisted);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
    public Shipwreck delete(@PathVariable Long id) {
//        return ShipwreckStub.delete(id);
        Shipwreck shipwreck = repository.findOne(id);
        repository.delete(id);
        return shipwreck;
    }

}
