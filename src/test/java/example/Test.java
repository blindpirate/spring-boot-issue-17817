package example;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

@SpringBootTest
@TestExecutionListeners(MockitoTestExecutionListener.class)
public class Test extends AbstractTestNGSpringContextTests {
    @SpyBean SessionScopedBean bean;

    @org.testng.annotations.Test
    public void test() {
        doReturn( 0 ).when( bean ).method( any( Integer.class ) );
    }
}
