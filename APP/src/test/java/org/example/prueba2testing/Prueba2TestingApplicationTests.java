package org.example.prueba2testing;

import org.example.prueba2testing.Model.Agenda;
import org.example.prueba2testing.Repository.AgendaRepository;
import org.example.prueba2testing.Servicios.AgendaService;
import org.example.prueba2testing.Servicios.DueñoService;
import org.example.prueba2testing.Servicios.MascotaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;
import org.example.prueba2testing.Model.Agenda;
import org.example.prueba2testing.Repository.AgendaRepository;
import org.example.prueba2testing.Servicios.AgendaService;
import org.example.prueba2testing.Servicios.DueñoService;
import org.example.prueba2testing.Servicios.MascotaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;

@SpringBootTest
class Prueba2TestingApplicationTests {
    @InjectMocks
    private AgendaService agendaService;

    @Mock
    private AgendaRepository agendaRepository;

    @Mock
    private DueñoService dueñoService;

    @Mock
    private MascotaService mascotaService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testListarCitas() {

        List<Agenda> result = agendaService.listarCitas();

        assertNotEquals(result, null);
    }


}
