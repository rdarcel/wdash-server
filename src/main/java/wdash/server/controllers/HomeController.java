package wdash.server.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import wdash.server.models.reponses.StandResponse;

@Controller("/") // (1)
public class HomeController {

    @Get("/") // (2)
    public HttpResponse<StandResponse> index() {
        return HttpResponse.ok(new StandResponse(200,"OK"));
    }
}