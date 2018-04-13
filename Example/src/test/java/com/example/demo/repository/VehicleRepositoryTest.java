package com.example.demo.repository;

import com.example.demo.conf.AppConfig;
import com.example.demo.model.Vehicle;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest()
@ContextConfiguration(classes = {
        AppConfig.class
})
@Transactional
@Rollback
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class VehicleRepositoryTest {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Test
    @Sql(statements = "insert into vehicle values (1, 'example')")
    public void shouldGetAllElementsFromDatabase() {
        //given

        //when
        List<Vehicle> vehicles = vehicleRepository.findAll();

        //then
        assertThat(vehicles).hasSize(1);
    }

}