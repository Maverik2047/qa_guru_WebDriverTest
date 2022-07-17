package ga.guru.owner.config;

import org.aeonbits.owner.Config;

//Пример для тестирования тестов

public interface TypeConfig extends Config {

    @Key("double")
    Double getDouble();

    @Key("boolean")
    Boolean getBoolean();
}
