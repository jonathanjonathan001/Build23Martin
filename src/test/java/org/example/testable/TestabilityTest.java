package org.example.testable;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

// // @SuppressWarnings({"unchecked"})
// @ExtendWith(MockitoExtension.class)
class TestabilityTest {

    LoggerImpl logger = new LoggerImpl();

    // List<String> strings = (List<String>) Mockito.mock(List.class);
    // @Mock
    //List<String> strings;
    MailSender mailSender = Mockito.mock(MailSender.class);
    Testability testability = new Testability(logger, mailSender);

    @Test
    void runWithValidEmailShouldLogAndSendMail(){
        testability.run();

        assertTrue(logger.logIsCalled);
        Mockito.verify(mailSender, Mockito.times(1)).sendMail(eq("some-invalid-email-address.com"), anyString());
        // assertThat("test"). ...
    }

    @Test
    void runWithInvalidEmailShouldLogMessageWithErrorLevel(){
        Mockito.doThrow(new IllegalArgumentException()).when(mailSender).sendMail(anyString(),anyString());

        testability.run();

        assertEquals(2, logger.count);
    
    
    }
    

    
}

