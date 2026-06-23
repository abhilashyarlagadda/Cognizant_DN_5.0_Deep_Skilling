
import static org.mockito.Mockito.verify;
import org.junit.Test;
import org.mockito.Mockito;

public class ServiceTest {
	@Test
	
    public void testVerifyInteraction() {

        Api mockApi = Mockito.mock(Api.class);

        Service service = new Service(mockApi);

        service.fetchData();

        verify(mockApi).getData();
	}

}
