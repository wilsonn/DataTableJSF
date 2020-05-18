package pe.com.whnm.holamundojsf.managebean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import pe.com.whnm.holamundojsf.bean.Persona;

@ManagedBean
@RequestScoped
public class PersonaBean {
	
	private Persona persona = new Persona();
	private static List<Persona> lstPersonas = new ArrayList<Persona>();
	
	
	public PersonaBean() {
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Persona> getLstPersonas() {
		return PersonaBean.lstPersonas;
	}

	public void setLstPersonas(List<Persona> lstPersonas) {
		PersonaBean.lstPersonas = lstPersonas;
	}
	
	public void agregarPersona() {
		PersonaBean.lstPersonas.add(persona);
	}
	
	public void eliminarPersona(Persona per) {
		PersonaBean.lstPersonas.remove(per);
	}
	

}
