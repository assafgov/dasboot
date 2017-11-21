package com.boot;

import com.boot.controller.ShipwrekController;
import com.boot.model.Shipwreck;
import com.sun.media.sound.WaveExtensibleFileReader;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.transaction.BeforeTransaction;

import static org.junit.Assert.assertEquals;

public class ShipwreckControllerTest {

    @InjectMocks
    private ShipwrekController sc;


@Before
public void init(){
    MockitoAnnotations.initMocks(this);
}

    @Test
    public void testShipwreckGet(){
        Shipwreck wreck = sc.get(1L);
        assertEquals(1L, wreck.getId().longValue());

    }


}
