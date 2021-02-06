import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {
    @Test
    void sample() {
        var sample = new Sample();
        Assertions.assertTrue(sample.vTrue);
    }
}
