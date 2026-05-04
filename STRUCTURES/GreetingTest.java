import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreetingTest{

    @Test
        public void greetUserName(){
String actual = Greeting.greet("Alice");
String expected = "hello " + "Alice";
assertEquals(actual, expected);
}

    @Test
        public void greetUserWorld(){
String actual = Greeting.greet("world");
String expected = "hello world";
assertEquals(actual, expected);
}

    @Test
        public void greetUser(){
String actual = Greeting.greet("");
String expected = "hello "   ;
assertEquals(actual, expected);
}



}
