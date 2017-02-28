package com.fererlab.controller;

import com.fererlab.model.Shipwreck;
import com.fererlab.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;

public class ShipwreckControllerTest {

    public static final Long ID_1 = new Long(1);
    public static final Shipwreck SHIPWRECK_1 = new Shipwreck(
            ID_1,
            "One",
            "Description",
            "Condition",
            100,
            10.0,
            20.0,
            2000
    );

    @InjectMocks
    private ShipwreckController shipwreckController;

    @Mock
    private ShipwreckRepository repository;

    @Before
    public void init() {
        // initialize mocks
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testList() throws Exception {
    }

    @Test
    public void testCreate() throws Exception {

    }

    @Test
    public void testGet() throws Exception {
        Mockito.doReturn(SHIPWRECK_1).when(repository).findOne(ID_1);
        Shipwreck shipwreck = shipwreckController.get(ID_1);
        Mockito.verify(repository, times(1)).findOne(ID_1);
        assertThat(shipwreck.getId(), is(ID_1));
    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }
}