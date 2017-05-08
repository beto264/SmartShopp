package cl.duoc.innovacion.smartshopp.services;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cl.duoc.innovacion.smartshopp.persistence.CategoriaHome;
import cl.duoc.innovacion.smartshopp.persistence.exceptions.PersistenceException;

@Path("/categorias")
public class CategoriaService implements IService {

	private CategoriaHome home;
	private ServiceStatus serviceStatus;

	public CategoriaService() {
		home = new CategoriaHome();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getAll() {
		try {
			return mapper.writeValueAsString(home.getAll());
		} catch (PersistenceException e) {
			serviceStatus = new ServiceStatus();
			serviceStatus.setCode(e.getCode());
			serviceStatus.setMessage(e.getMessage());
			serviceStatus.setNativeMessage(e.getNativeMessage());
		} catch (IOException e) {
			serviceStatus = new ServiceStatus();
			serviceStatus.setCode(Constants.WEB_SERVICE_ERROR_ID);
			serviceStatus.setMessage(Constants.WEB_SERVICE_ERROR);
			serviceStatus.setNativeMessage(e.getMessage());
		}

		try {
			return mapper.writeValueAsString(serviceStatus);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("id") int id) {
		try {
			return mapper.writeValueAsString(home.findById(id));
		} catch (PersistenceException e) {
			serviceStatus = new ServiceStatus();
			serviceStatus.setCode(e.getCode());
			serviceStatus.setMessage(e.getMessage());
			serviceStatus.setNativeMessage(e.getNativeMessage());
		} catch (IOException e) {
			serviceStatus = new ServiceStatus();
			serviceStatus.setCode(Constants.WEB_SERVICE_ERROR_ID);
			serviceStatus.setMessage(Constants.WEB_SERVICE_ERROR);
			serviceStatus.setNativeMessage(e.getMessage());
		}

		try {
			return mapper.writeValueAsString(serviceStatus);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

}
