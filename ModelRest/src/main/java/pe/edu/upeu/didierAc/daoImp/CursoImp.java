package pe.edu.upeu.didierAc.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.didierAc.dao.CursoDAO;
import pe.edu.upeu.didierAc.entity.Curso;

@Repository
@Qualifier("CursoDAO")
public class CursoImp implements CursoDAO {

	@Autowired
	JdbcTemplate jt;
	
	public List<Map<String, Object>> readAll() {
		//return jt.query("select * from curso", new StudentMapper());
		//return jt.queryForList("select * from region", Curso.class);
	return jt.queryForList("SELECT\r\n" + 
				"    \r\n" + 
				"    dis.distrito,\r\n" + 
				"    reg.region,\r\n" + 
				"    vi.nombre,\r\n" + 
				"    vi.n_visitas,\r\n" + 
				"    COUNT(vi.idvisita),\r\n" + 
				"    COUNT(vi.n_visitas)\r\n" + 
				"FROM\r\n" + 
				"    distrito AS dis,\r\n" + 
				"    visita AS vi,\r\n" + 
				"    persona AS per,\r\n" + 
				"    region AS reg,\r\n" + 
				"    rol AS r,\r\n" + 
				"    usuario AS u\r\n" + 
				"WHERE\r\n" + 
				"    dis.iddistrito = per.iddistrito AND per.idpersona = vi.idpersona AND reg.idregion = dis.idregion AND per.idpersona = u.idusuario AND u.idrol = r.idrol AND r.nam_rol = 'pastor' AND reg.region <> '1'\r\n" + 
				"GROUP BY\r\n" + 
				"    dis.iddistrito  \r\n" + 
				"ORDER BY `reg`.`region` ASC"); 	
	}
	public List<Map<String, Object>> NumViReg(){
		return jt.queryForList("SELECT\r\n" + 
				"    \r\n" + 
				"    reg.region,\r\n" + 
				"    vi.nombre,\r\n" + 
				"    vi.n_visitas,\r\n" + 
				"    COUNT(vi.n_visitas)\r\n" + 
				"FROM\r\n" + 
				"    distrito AS dis,\r\n" + 
				"    visita AS vi,\r\n" + 
				"    persona AS per,\r\n" + 
				"    region AS reg,\r\n" + 
				"    rol AS r,\r\n" + 
				"    usuario AS u\r\n" + 
				"WHERE\r\n" + 
				"    dis.iddistrito = per.iddistrito AND per.idpersona = vi.idpersona AND reg.idregion = dis.idregion AND per.idpersona = u.idusuario AND u.idrol = r.idrol AND r.nam_rol = 'pastor' AND reg.region <> '1'\r\n" + 
				"GROUP BY\r\n" + 
				"    dis.iddistrito  \r\n" + 
				"ORDER BY `reg`.`region` ASC");
		
	}

}
