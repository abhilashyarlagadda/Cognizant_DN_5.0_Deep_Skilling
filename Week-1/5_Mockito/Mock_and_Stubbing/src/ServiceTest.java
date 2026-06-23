import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.mockito.Mockito;
public class ServiceTest {
	@Test
    public void testExternalApi() {

        Api mockApi = Mockito.mock(Api.class);

        when(mockApi.getData()).thenReturn("Mock Data");

        Service service = new Service(mockApi);

        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}
