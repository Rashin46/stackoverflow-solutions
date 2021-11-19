package com.ylm.cnpl.core.util;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class EnvUtilTest {
    @Autowired
    private EnvUtil envUtil;

    @Test
    public void getValueFromEnvConfigTest() {
        String envConfigValue = this.envUtil.getEnvValue("center.office.dept");
        assertNotNull(envConfigValue);
    }
}
