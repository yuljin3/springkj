import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class HttpTest {

	@Test
	public void testName() throws Exception {
		
		HttpClient httpClient = HttpClientBuilder.create().build();
		
		HttpResponse response = httpClient.execute(new HttpGet("https://seoulpokemap.com/query2.php?since=0&mons=3,6,9,59,65,68,76,89,103,106,107,108,112,113,130,131,134,135,136,137,142,143,149"));
         
        HttpEntity entity = response.getEntity(); 
        String content = EntityUtils.toString(entity); 
        System.out.println(content);

		
	}
	
}
