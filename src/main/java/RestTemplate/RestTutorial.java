package RestTemplate;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RestTutorial {

    public static void main(String[] args) throws URISyntaxException , IOException, InterruptedException {
        Gson gson = new Gson();
        FuelTemplate fuelTemplate = new FuelTemplate();
        fuelTemplate.populate();

        String jsonString = gson.toJson(fuelTemplate);
        System.out.println(jsonString);

        HttpRequest postRequest = HttpRequest.newBuilder().uri(new URI("https://fuelpass.gov.lk/api/registration"))
                .POST(HttpRequest.BodyPublishers.ofString(jsonString))
                .header("Content-Type","application/json")
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> httpResponse =  httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());
        fuelTemplate = gson.fromJson(httpResponse.body(),FuelTemplate.class);
        System.out.println("Status :: " + fuelTemplate.getStatus());
        System.out.println( "Message :: " + fuelTemplate.getMsg());

        if (!fuelTemplate.getStatus() && "Consumer Verification Expired".equals(fuelTemplate.getMsg())) {
            // generate new otp
        }
    }
}
