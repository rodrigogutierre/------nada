package pe.edu.upeu.didierAc.servicesImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.didierAc.dao.CursoDAO;
import pe.edu.upeu.didierAc.service.CursoService;

@Service
public class CursoSevicesImpl implements CursoService {

	@Autowired
	CursoDAO cu;
	
	public List<Map<String, Object>> readAll() {
		return cu.readAll();
	}

	@Override
	public List<Map<String, Object>> NumViReg() {
		return cu.NumViReg();
	}
	

}
