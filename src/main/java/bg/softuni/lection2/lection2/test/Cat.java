package bg.softuni.lection2.lection2.test;

import bg.softuni.lection2.lection2.test.Animal;
import org.springframework.stereotype.Component;

public class Cat implements Animal {
    @Override
    public String makeNoise() {
        return "meeew";
    }
}
