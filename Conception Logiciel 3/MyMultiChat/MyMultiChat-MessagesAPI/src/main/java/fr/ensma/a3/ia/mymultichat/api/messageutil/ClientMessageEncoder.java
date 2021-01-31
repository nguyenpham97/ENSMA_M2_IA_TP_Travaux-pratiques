package fr.ensma.a3.ia.mymultichat.api.messageutil;

import fr.ensma.a3.ia.mymultichat.api.message.ClientMessage;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.google.gson.Gson;
import java.nio.ByteBuffer;
import org.apache.commons.lang3.SerializationUtils;

public class ClientMessageEncoder implements Encoder.Binary<ClientMessage> {

    private static Gson gson = new Gson();

    @Override
    public void init(EndpointConfig config) {
        // TODO Auto-generated method stub
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
    }

    @Override
    public ByteBuffer encode(ClientMessage object) throws EncodeException {
        return ByteBuffer.wrap(SerializationUtils.serialize(object));
    }

    /**
     * Création d'un objet Json pour l'envoie
     */
//	@Override
//	public String encode(ClientMessage mess) throws EncodeException {
//		return gson.toJson(mess);		
//	}
}