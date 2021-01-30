package bg.softuni.lection2.lection2.test;

import org.springframework.context.annotation.*;

@Configuration
public class AnimalConfig {

    @Profile("kitty-app")
    @Bean
    @Scope("prototype")
    public Animal createCat() {
        return new Cat();
    }

    @Profile("doggy-app")
    @Bean
    public Animal createDog() {
        return new Dog();
    }
}
