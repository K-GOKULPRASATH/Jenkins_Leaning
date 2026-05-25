package jen.jenkins;

import jen.jenkins.Controller.Jenkins;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsApplicationTests {

    @Test
    void contextLoads() {
        Jenkins jenkins = new Jenkins();

        String result = jenkins.hello();
        System.out.println(result);
        assertEquals("Jenkins",result);
    }

}
