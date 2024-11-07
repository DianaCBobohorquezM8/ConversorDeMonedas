import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

        Moneda consultaMoneda(String busqueda) {

            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" +
                 "637cd60e2799b7c4ba4eaa41/latest/" + busqueda);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = null;
            try {
                response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException |InterruptedException e) {
                throw new RuntimeException(e);
            }

            return new Gson().fromJson(response.body(),Moneda.class);

        }


}
