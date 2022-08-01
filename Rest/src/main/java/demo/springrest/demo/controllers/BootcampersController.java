package demo.springrest.demo.controllers;

import demo.springrest.demo.models.Bootcamper;
import demo.springrest.demo.services.BootcamperService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {

    private BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("uno", Math.random()));
        this.bootcamperService.add(new Bootcamper("dos", Math.random()));
        this.bootcamperService.add(new Bootcamper("tres", Math.random()));
        this.bootcamperService.add(new Bootcamper("cuatro", Math.random()));
        this.bootcamperService.add(new Bootcamper("cinco", Math.random()));


    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos(){
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("nombre") String nombre){
        return bootcamperService.get(nombre);
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    public Response seterBootcamper(Bootcamper bootcamper){
        bootcamperService.add(bootcamper);

        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getNombre())).build();

    }
}
