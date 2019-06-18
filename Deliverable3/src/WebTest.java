import org.junit.Test;

public class WebTest extends BaseTest {
	
	private final String baseUrl = "https://cs1632summer2019.herokuapp.com/";

	@Test
	public void test() {
		driver.get(baseUrl);
	}

}
