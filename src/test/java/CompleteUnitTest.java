import Decorator.*;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({AddCheeseTest.class, AddKetchupTest.class, AddMayoTest.class, AddMustardTest.class,
        BurgerTest.class, FriesTest.class, HotDogTest.class, CustomerTest.class, CustomerOrderTest.class,
        ToppingBuilderTest.class})
public class CompleteUnitTest
{

}
