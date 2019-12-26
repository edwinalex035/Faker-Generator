package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeStock {
    FakeStockType value() default FakeStockType.NSDQ;
}