package example;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import org.testng.Assert;

@Component
@SessionScope //commenting this line fixes test
public class SessionScopedBean {
    public int method( int arg ) {
        Assert.fail( "Method sould not be called" );
        return 0;
    }
}
