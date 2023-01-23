package org.example.testdoubles;

import org.example.testdoubles.utils.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CustomerReaderTest {

    CustomerReader customerReader;
    EntityManager entityManager;

    @BeforeEach
    void setUp() {
        entityManager = Mockito.mock(EntityManager.class);
        customerReader = new CustomerReader(entityManager);
    }

    @Test
    void findFullNameWithValidIdReturnsFullNameOfCustomer() {

        Customer customer = new Customer(1,"Kalle", "Anka");
        Mockito.when(entityManager.find(1L)).thenReturn(customer);

        String fullName = customerReader.findFullName(1L);

        assertEquals("Kalle Anka", fullName);
    }

    @Test
    void callingFindFullNameWithInvalidIdReturnsEmptyString(){

        Mockito.when(entityManager.find(2L)).thenReturn(null);

        String fullName = customerReader.findFullName(2L);

        assertEquals("", fullName);
    }
    
}