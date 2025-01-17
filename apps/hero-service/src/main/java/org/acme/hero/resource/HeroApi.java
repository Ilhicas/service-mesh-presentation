package org.acme.hero.resource;

import org.acme.hero.data.HeroItem;
import org.acme.hero.model.Hero;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/heros")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public interface HeroApi {

    @Operation(
        operationId = "ListLegumes",
        summary = "List all super heroes"
    )
    @APIResponse(
        responseCode = "200",
        description = "The List with all super heroes"
    )
    @APIResponse(
        name = "notFound",
        responseCode = "404",
        description = "super heroes list not found"
    )
    @APIResponse(
        name = "internalError",
        responseCode = "500",
        description = "Internal Server Error"
    )
    @GET
    List<HeroItem> list();
}
