package hello;

import org.joda.time.LocalTime;

/**
 * @author dimdark
 * @date 2017-08-03
 * @time 11:11 AM
 */
public class HelloWorld {

    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }

}
