package cl.duoc.innovacion.smartshopp.services;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

public interface IService {

	public String getAll();

	public String getById(int id);

	public ObjectMapper mapper = new ObjectMapper();

	default public void setMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
	}

}
