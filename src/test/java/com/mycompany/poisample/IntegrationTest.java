package com.mycompany.poisample;

import com.mycompany.poisample.ApachePoiSampleApp;
import com.mycompany.poisample.config.AsyncSyncConfiguration;
import com.mycompany.poisample.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { ApachePoiSampleApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
