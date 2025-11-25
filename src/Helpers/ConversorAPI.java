package Helpers;

import Models.ModelAPIResponse;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

public class ConversorAPI {

    public static double obtenerConversion(String monedaBase, String monedaConvertida, double monto)
            throws IOException, InterruptedException {

        String urlApi = "https://v6.exchangerate-api.com/v6/f051a796976ff8355e55e93d/pair/"
                + monedaBase + "/" + monedaConvertida+"/"+monto;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlApi)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        ModelAPIResponse apiResponse = gson.fromJson(response.body(), ModelAPIResponse.class);


        return apiResponse.conversion_result;
    }

}
