package tallerpruebas;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

//Validando en USD cuando el empleado es un Worker con un margen de error de +-0.2
	@Test
	void testCSWorkerUSB() {
		Employee testEmpleado = new Employee(400, "USD", 0.5f, EmployeeType.Worker);

		float resultadoReal = testEmpleado.cs();
		float resultadoEsperado = 464.33f;

		assertEquals(resultadoReal, resultadoEsperado, 0.2);
	}

//Validando en USD cuando el empleado es un Manager con un margen de error de +-0.2
	@Test
	void testCSManagerUSB() {
		Employee testEmpleado = new Employee(400, "USD", 0.5f, EmployeeType.Manager);

		float resultadoReal = testEmpleado.cs();
		float resultadoEsperado = 464.508336f;

		assertEquals(resultadoReal, resultadoEsperado, 0.2);
	}


//Validando en USD cuando el empleado es un Supervisor con un margen de error de +-0.2
	@Test
	void testCSSupervisorUSB() {
		Employee testEmpleado = new Employee(400, "USD", 0.5f, EmployeeType.Supervisor);

		float resultadoReal = testEmpleado.cs();
		float resultadoEsperado = 464.68f;

		assertEquals(resultadoReal, resultadoEsperado, 0.2);
	}
	
//Validando en USD cuando el empleado es un tipo invalido con un margen de error de +-0.2
	@Test
	void testCSOtroEmpleadoUSB() {
		Employee testEmpleado = new Employee(400, "USD", 0.5f, EmployeeType.Other);
			
		float resultadoReal = testEmpleado.cs();
		float resultadoEsperado = 0.0f;
		assertEquals(resultadoReal, resultadoEsperado, 0.2);
	}

//Validando en otro tipo de moneda cuando el empleado es un Worker con un margen de error de +-0.2
	@Test
	void testCSWorker() {
		Employee testEmpleado = new Employee(400, "EUR", 0.5f, EmployeeType.Worker);

		float resultadoReal = testEmpleado.cs();
		float resultadoEsperado = 444.33f;

		assertEquals(resultadoReal, resultadoEsperado, 0.2);
	}

//Validando en otro tipo de moneda cuando el empleado es un Manager con un margen de error de +-0.2
	@Test
	void testCSManager() {
		Employee testEmpleado = new Employee(400, "EUR", 0.5f, EmployeeType.Manager);

		float resultadoReal = testEmpleado.cs();
		float resultadoEsperado = 444.508336f;

		assertEquals(resultadoReal, resultadoEsperado, 0.2);
	}


//Validando en otro tipo de moneda cuando el empleado es un Supervisor con un margen de error de +-0.2
	@Test
	void testCSSupervisor() {
		Employee testEmpleado = new Employee(400, "EUR", 0.5f, EmployeeType.Supervisor);

		float resultadoReal = testEmpleado.cs();
		float resultadoEsperado = 444.68f;

		assertEquals(resultadoReal, resultadoEsperado, 0.2);
	}
		
//Validando en otro tipo de moneda cuando el empleado es un tipo invalido con un margen de error de +-0.2
	@Test
	void testCSOtroEmpleado() {
		Employee testEmpleado = new Employee(400, "EUR", 0.5f, EmployeeType.Other);
						
		float resultadoReal = testEmpleado.cs();
		float resultadoEsperado = 0.0f;
		assertEquals(resultadoReal, resultadoEsperado, 0.2);
	}
}
