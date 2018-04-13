package com.example.demo.controller;

import com.example.demo.model.Vehicle;
import com.example.demo.repository.VehicleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
public class ExampleControllerTest {

    private ExampleController exampleController;
    private VehicleRepository vehicleRepository = Mockito.mock(VehicleRepository.class);

    @Test
    public void shouldTestIt() {
        //given
        exampleController = new ExampleController(vehicleRepository);
        Mockito.when(vehicleRepository.getOne(1L)).thenReturn(new Vehicle());

        //when
        exampleController.helloWorld();

        //then

    }

}