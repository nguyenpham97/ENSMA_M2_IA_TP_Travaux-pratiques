package fr.ensma.a3.ia.mymultichat.api.messageutil;

import fr.ensma.a3.ia.mymultichat.api.message.ClientMessage;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import com.google.gson.Gson;
import java.nio.ByteBuffer;
import org.apache.commons.lang3.SerializationUtils;

public class ClientMessageDecoder implements Decoder.Binary<ClientMessage> {

	private static Gson gson = new Gson();
	
	@Override
	public void init(EndpointConfig config) {
		// TODO Auto-generated method stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

//	@Override
//	public ClientMessage decode(String mess) throws DecodeException {
//		return gson.fromJson(mess, ClientMessage.class);
//	}
//
//	@Override
//	public boolean willDecode(String mess) {
//		// TODO Auto-generated method stub
//		return true;
//	}

    @Override
    public ClientMessage decode(ByteBuffer bytes) throws DecodeException {
        return (ClientMessage) SerializationUtils.deserialize(bytes.array());
        
    }

    @Override
    public boolean willDecode(ByteBuffer bytes) {
       return true;
    }

}