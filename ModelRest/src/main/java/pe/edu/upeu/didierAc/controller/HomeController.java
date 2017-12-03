package pe.edu.upeu.didierAc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.didierAc.dao.CursoDAO;

@RestController
public class HomeController {

	@Autowired
	CursoDAO cus;
	

	@RequestMapping("/")
	public String hello() {
		return "escribe 'datos' en la url ";
	}
	@RequestMapping(value = "/datos", method = RequestMethod.GET)
	public List<Map<String, Object>> region() {
	 return cus.readAll();
	
	 
	}
	@RequestMapping(value = "/visita_por_region", method = RequestMethod.GET)
	public List<Map<String, Object>> visitaporregion() {
	
	 return cus.NumViReg();
	 
	}
	/*
	@RequestMapping(value = "/cus", method = RequestMethod.POST)
    public void principal(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        String opc = request.getParameter("opc");
        String id="";
        try {
            switch (opc) {
                case "list":
                    mp.put("pr", cus.readAll());
                    break;
                
            }
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

        Gson gson = new Gson();
        out.println(gson.toJson(mp));
        out.flush();
        out.close();
    }
    */
}

