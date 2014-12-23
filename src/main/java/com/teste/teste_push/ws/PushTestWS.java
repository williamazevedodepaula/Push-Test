package com.teste.teste_push.ws;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
import java.io.IOException;
import javax.ejb.Stateful;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


/**
 *
 * @author William
 */
@Stateful
@Path("/push_test/")
public class PushTestWS {   

    private static String apiKey;
    private static String id;
    
    @GET
    @Path("/register/{apiKey}/{id}/")
    @Produces("application/json")
    public String register(@PathParam("apiKey") String apiKey, @PathParam("id") String id) {        
        this.apiKey = apiKey;
        this.id = id;
        System.out.println("apiKey: " + apiKey);
        System.out.println("id: " + id);
        return "Sucesso - apiKey: "+apiKey+"  id: " + id;        
    }
    
    @GET
    @Path("/send/{msg}/")
    @Produces("application/json")
    public String sendMsg(@PathParam("msg") String msg) throws IOException{
        //this.apiKey = apiKey;
        //this.id = id;
        Sender sender = new Sender(this.apiKey);
        Message mensagem = new Message.Builder()
                .addData("message", msg)
                .build();
        System.out.println("apiKey: " + this.apiKey);
        System.out.println("id: " + this.id);
        System.out.println("msg: " + msg);
        Result result = sender.send(mensagem, this.id, 10);
        return "ok";
    }
}
