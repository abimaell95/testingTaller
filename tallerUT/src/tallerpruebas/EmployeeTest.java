package tallerpruebas;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testCsWorker() {
		Employee testEmpleado = new Employee(100, "USD", 0.5f, EmployeeType.Worker);
		
		float resultadoReal = testEmpleado.cs();
		float resultadoEsperado = 164.33f;
		
		assertEquals(resultadoReal, resultadoEsperado, 0.01);
	}
}
