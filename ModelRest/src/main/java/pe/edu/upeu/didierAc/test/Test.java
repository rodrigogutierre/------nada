package pe.edu.upeu.didierAc.test;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

public class Test {
	 public static final String SERVER_URI = "http://localhost:9090/didierAc/curso";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testGetAllEmployee();
	}
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	private static void testGetAllEmployee() {
         RestTemplate restTemplate = new RestTemplate();
         List<LinkedHashMap> emps = restTemplate.getForObject(SERVER_URI, List.class);    
         System.out.println("CURSOS");
         System.out.println("-------------");
         System.out.println("DICURSO\tCURSO\t\tIDDOCENTE");
         for(LinkedHashMap map : emps){
                 //System.out.println(map.getId());
                 System.out.println(map.get("idcurso")+"\t"+map.get("nombre")+"\t"+map.get("iddocente"));
         }
     }
}
