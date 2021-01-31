package fr.ensma.a3.ia.mymultichat.server.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.ensma.a3.ia.mymultichat.api.canal.ChatCanalDesc;
import fr.ensma.a3.ia.mymultichat.server.business.ChatCanalAdmin;
import java.util.stream.Collectors;
import javax.ws.rs.POST;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("multichat")
public class MultiChatServices {

    //http://localhost:8080/services/multichat/1
    @GET
    @Path("{canalId}")
    public Response getCanalAmis(@PathParam("canalId") int canalId) {
        List<ChatCanalDesc> listcan = ChatCanalAdmin.INSTANCE.getAllCanal();
        try {
            ChatCanalDesc cc = listcan.get(canalId);
            return Response.ok(cc).build();
        } catch (IndexOutOfBoundsException ex) {
            return Response.noContent().build();
        }
    }

    //http://localhost:8080/services/multichat/allchanel
    @GET
    @Path("allchanel")
    public Response getAllChanel() {
        try {
            List<ChatCanalDesc> listcan = ChatCanalAdmin.INSTANCE.getAllCanal();
            return Response.ok(listcan).build();
        } catch (IndexOutOfBoundsException ex) {
            return Response.noContent().build();
        }
    }

    //http://localhost:8080/services/multichat/createchanel
    @GET
    @Path("createchanel/{chanelid}/{maxplayer}")
    public Response createChanel(@PathParam("chanelid") int chanelid, @PathParam("maxplayer") int maxplayer) {
        try {
            ChatCanalDesc addNewCanal = ChatCanalAdmin.INSTANCE.addNewCanal(chanelid, maxplayer);
            return Response.ok(addNewCanal).build();
        } catch (IndexOutOfBoundsException ex) {
            return Response.noContent().build();
        }
    }
}