package erp.hotel.oriana.template;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.time.OffsetDateTime;
import java.util.Map;

@Path("/api/v1")
public class InfoResource {

    @GET
    @Path("/info")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> info() {
        return Map.of(
                "service", "oriana-quarkus-service-template",
                "time", OffsetDateTime.now().toString()
        );
    }
}
