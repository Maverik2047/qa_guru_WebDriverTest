package ga.guru.owner.config;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//Пример тестирования тестов

public class TypeTest {
    @Test
    public void testDouble() {
        System.setProperty("double", "11.11");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getDouble()).isEqualTo(11.11);

    }

    @Test
    public void testBoolean() {
        System.setProperty("boolean", "true");
        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getBoolean()).isEqualTo(true);
    }
}
