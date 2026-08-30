package programaDGI;

import java.util.Scanner;

public class programaDGI {

	public static void main(String[] args) {

		double BPC = 6864;
		double pisoPrimeraFranja = BPC * 0;
		double techoPrimeraFranja = BPC * 7;
		double pisoSegundaFranja = BPC * 7;
		double techoSegundaFranja = BPC * 10;
		double pisoTerceraFranja = BPC * 10;
		double techoTerceraFranja = BPC * 15;
		double pisoCuartaFranja = BPC * 15;
		double techoCuartaFranja = BPC * 30;
		double pisoQuintaFranja = BPC * 30;
		double techoQuintaFranja = BPC * 50;
		double pisoSextaFranja = BPC * 50;
		double techoSextaFranja = BPC * 75;
		double pisoSeptimaFranja = BPC * 75;
		double techoSeptimaFranja = BPC * 115;
		double pisoOctavaFranja = BPC * 115;
		double techoOctavaFranja = BPC * 115;
		double pisoPrimeraFranjaIass = BPC * 0;
		double techoPrimeraFranjaIass = BPC * 9;
		double pisoSegundaFranjaIass = BPC * 9;
		double techoSegundaFranjaIass = BPC * 15;
		double pisoTerceraFranjaIass = BPC * 15;
		double techoTerceraFranjaIass = BPC * 50;
		double pisoCuartaFranjaIass = BPC * 50;
		double techoCuartaFranjaIass = BPC * 50;

		double precioFranja1I = 0;
		double precioFranja2I = 0;
		double precioFranja3I = 0;
		double precioFranja4I = 0;

		double terceraFanjaIASS = pisoTerceraFranjaIass - pisoSegundaFranjaIass;
		double cuartaFranjaIASS = pisoCuartaFranjaIass - pisoTerceraFranjaIass;

		double terceraFranjaIASSCuenta = terceraFanjaIASS * 0.06;
		double cuartaFranjaIASSCuenta = cuartaFranjaIASS * 0.24;

		double precioFranja1 = 0;
		double precioFranja2 = 0;
		double precioFranja3 = 0;
		double precioFranja4 = 0;
		double precioFranja5 = 0;
		double precioFranja6 = 0;
		double precioFranja7 = 0;
		double precioFranja8 = 0;

		double menoresACargoConfirmados = 0;
		double menoresACargoConDiscapacidadConfirmados = 0;

		double terceraFranjaIRPF = pisoTerceraFranja - pisoSegundaFranja;
		double cuartaFranjaIRPF = pisoCuartaFranja - pisoTerceraFranja;
		double quintaFranjaIRPF = pisoQuintaFranja - pisoCuartaFranja;
		double sextaFranjaIRPF = pisoSextaFranja - pisoQuintaFranja;
		double septimaFranjaIRPF = pisoSeptimaFranja - pisoSextaFranja;
		double octavaFranjaIRPF = pisoOctavaFranja - pisoSeptimaFranja;

		double menoresACargoFonasa;
		double ConyugeACargoFonasa;

		double fonasaMin = BPC * 2.5;
		double aporteBasico = 0.03;

		double mostrarPorcentaje = 0;

		int anioActual = 2026;

		Scanner lector = new Scanner(System.in);

		int opciones = 0;

		do {

			System.out.println("==========================================================================");
			System.out.println("Bienveni@ al programa para calcular sus impuestos");
			System.out.println("1- Calcular IRPF");
			System.out.println("2- Calcular IASS");
			System.out.println("3- Calcular FONASA");
			System.out.println("4- Calcular declaracion jurada");
			System.out.println("5- Ayuda");
			System.out.println("6- Salir");
			System.out.println("==========================================================================");

			opciones = lector.nextInt();

			switch (opciones) {

			case 1: {

				System.out.println("==========================================================================");
				System.out.println("Ingrese su sueldo nominal");
				System.out.println("==========================================================================");

				double sueldoNominal = lector.nextDouble();

				System.out.println("==========================================================================");
				System.out.println("Ingrese el numero de menores a cargo sin discapacidades");
				System.out.println("==========================================================================");

				int menoresACargo = lector.nextInt();

				System.out.println("==========================================================================");
				System.out.println("Ingrese el numero de menores a cargo con discapacidad");
				System.out.println("==========================================================================");

				int menoresACargoConDiscapacidad = lector.nextInt();

				if (menoresACargo >= 1) {

					menoresACargoConfirmados = BPC * 20;

				} else {

					menoresACargoConfirmados = 0;

				}

				if (menoresACargoConDiscapacidad >= 1) {

					menoresACargoConDiscapacidadConfirmados = BPC * 40;

				} else {

					menoresACargoConDiscapacidadConfirmados = 0;

				}

				if (sueldoNominal <= 0) {
					System.out.println("==========================================================================");
					System.out.println("ingrse un numero positivo para calcular su impuesto");

				} else if (sueldoNominal >= pisoPrimeraFranja && sueldoNominal <= techoPrimeraFranja) {

					precioFranja1 = sueldoNominal - pisoPrimeraFranja - menoresACargoConfirmados

							- menoresACargoConDiscapacidadConfirmados;

					System.out.println("==========================================================================");

					System.out.println("No debe pagar IRPF");

				} else if (sueldoNominal >= pisoSegundaFranja && sueldoNominal <= techoSegundaFranja) {

					precioFranja2 = sueldoNominal - pisoSegundaFranja - menoresACargoConfirmados

							- menoresACargoConDiscapacidadConfirmados;

					System.out.println("==========================================================================");

					System.out.println("su sueldo entra en la segunda franja");

				} else if (sueldoNominal >= pisoTerceraFranja && sueldoNominal <= techoTerceraFranja) {

					precioFranja3 = sueldoNominal - pisoTerceraFranja - menoresACargoConfirmados

							- menoresACargoConDiscapacidadConfirmados;

					System.out.println("==========================================================================");

					System.out.println("su sueldo entra en la tercera franja");

				} else if (sueldoNominal >= pisoCuartaFranja && sueldoNominal <= techoCuartaFranja) {

					precioFranja4 = sueldoNominal - pisoCuartaFranja - menoresACargoConfirmados

							- menoresACargoConDiscapacidadConfirmados;

					System.out.println("==========================================================================");

					System.out.println("su sueldo entra en la cuarta franja");

				} else if (sueldoNominal >= pisoQuintaFranja && sueldoNominal < techoQuintaFranja) {

					precioFranja5 = sueldoNominal - pisoQuintaFranja - menoresACargoConfirmados

							- menoresACargoConDiscapacidadConfirmados;

					System.out.println("==========================================================================");

					System.out.println("su sueldo entra en la quinta franja");

				} else if (sueldoNominal >= pisoSextaFranja && sueldoNominal < techoSextaFranja) {

					precioFranja6 = sueldoNominal - pisoSextaFranja - menoresACargoConfirmados

							- menoresACargoConDiscapacidadConfirmados;

					System.out.println("==========================================================================");

					System.out.println("su sueldo entra en la sexta franja");

				} else if (sueldoNominal >= pisoSeptimaFranja && sueldoNominal < techoSeptimaFranja) {

					precioFranja7 = sueldoNominal - pisoSeptimaFranja - menoresACargoConfirmados

							- menoresACargoConDiscapacidadConfirmados;

					System.out.println("==========================================================================");

					System.out.println("su sueldo entra en la sexta franja");

				} else if (sueldoNominal >= pisoOctavaFranja && sueldoNominal > techoOctavaFranja) {

					precioFranja8 = sueldoNominal - pisoOctavaFranja - menoresACargoConfirmados

							- menoresACargoConDiscapacidadConfirmados;

					System.out.println("==========================================================================");

					System.out.println("su sueldo entra en la octava franja");
				}

				if (precioFranja1 < 0) {

					System.out.println("su total a pagar es: 0 (No debe pagar IRPF)");

				} else if (precioFranja2 < 0) {

					System.out.println("su total a pagar es: 0 (No debe pagar IRPF)");

				} else if (precioFranja3 < 0) {

					System.out.println("su total a pagar es: 0 (No debe Pagar IRPF)");

				} else if (precioFranja4 < 0) {

					System.out.println("su total a pagar es: 0 (No debe pagar IRPF)");

				} else if (precioFranja5 < 0) {

					System.out.println("su total a pagar es: 0 (No debe Pagar IRPF)");

				} else if (precioFranja6 < 0) {

					System.out.println("su total a pagar es: 0 (No debe pagar IRPF)");

				} else if (precioFranja7 < 0) {

					System.out.println("su total a pagar es: 0 (No debe Pagar IRPF)");

				} else if (precioFranja8 < 0) {

					System.out.println("su total a pagar es: 0 (No debe pagar IRPF)");

				} else if (sueldoNominal > techoPrimeraFranja && sueldoNominal < pisoTerceraFranja) {

					System.out.println("debe pagar: ");

					System.err.println(precioFranja2 * 0.10);

				} else if (sueldoNominal > techoSegundaFranja && sueldoNominal < pisoCuartaFranja) {

					System.out.println("debe pagar:");

					System.err.println(terceraFranjaIRPF * 0.10 + precioFranja3 * 0.15);

				} else if (sueldoNominal > techoTerceraFranja && sueldoNominal < pisoQuintaFranja) {

					System.out.println("debe pagar: ");

					System.err.println(cuartaFranjaIRPF * 0.15 + terceraFranjaIRPF * 0.10 + precioFranja4 * 0.24);

				} else if (sueldoNominal > techoCuartaFranja && sueldoNominal < pisoSextaFranja) {

					System.out.println("debe pagar: ");

					System.err.println(quintaFranjaIRPF * 0.24 + cuartaFranjaIRPF * 0.15 + terceraFranjaIRPF * 0.10

							+ precioFranja5 * 0.25);

				} else if (sueldoNominal > techoQuintaFranja && sueldoNominal < pisoSeptimaFranja) {

					System.out.println("debe pagar: ");

					System.err.println(sextaFranjaIRPF * 0.25 + quintaFranjaIRPF * 0.24 + cuartaFranjaIRPF * 0.15

							+ terceraFranjaIRPF * 0.10 + precioFranja6 * 0.27);

				} else if (sueldoNominal > techoSextaFranja && sueldoNominal < pisoOctavaFranja) {

					System.out.println("debe pagar: ");

					System.err.println(septimaFranjaIRPF * 0.27 + sextaFranjaIRPF * 0.25 + quintaFranjaIRPF * 0.24

							+ cuartaFranjaIRPF * 0.15 + terceraFranjaIRPF * 0.10 + precioFranja7 * 0.31);

				} else if (sueldoNominal > techoSeptimaFranja) {

					System.out.println("debe pagar");

					System.err.println(octavaFranjaIRPF * 0.31 + septimaFranjaIRPF * 0.27 + sextaFranjaIRPF * 0.25

							+ quintaFranjaIRPF * 0.24 + cuartaFranjaIRPF * 0.15 + terceraFranjaIRPF * 0.10

							+ precioFranja8 * 0.36);

				}

				break;

			}

			case 2: {

				System.out.println("==========================================================================");
				System.out.println("ingrese su jubilacion/Pension ");
				System.out.println("==========================================================================");

				double jubilacionPension = lector.nextDouble();

				if (jubilacionPension <= 0) {
					System.out.println("==========================================================================");
					System.out.println("ingrse un numero positivo para calcular su impuesto");

				} else if (jubilacionPension >= pisoPrimeraFranjaIass && jubilacionPension <= techoPrimeraFranjaIass) {

					precioFranja1I = jubilacionPension - pisoPrimeraFranjaIass;
					System.out.println("==========================================================================");
					System.out.println("no debes pagar IASS");

				} else if (jubilacionPension >= pisoSegundaFranjaIass && jubilacionPension <= techoSegundaFranjaIass) {

					precioFranja2I = jubilacionPension - pisoSegundaFranjaIass;
					System.out.println("==========================================================================");
					System.out.println("su jubilacion/pension entra en la segunda Franja");

				} else if (jubilacionPension >= pisoTerceraFranjaIass && jubilacionPension <= techoTerceraFranjaIass) {

					precioFranja3I = jubilacionPension - pisoTerceraFranjaIass;
					System.out.println("==========================================================================");
					System.out.println("su jubilacion/pension entra en la tercera Franja");

				} else if (jubilacionPension >= pisoCuartaFranjaIass && jubilacionPension <= techoCuartaFranjaIass) {

					precioFranja4I = jubilacionPension - pisoCuartaFranjaIass;
					System.out.println("==========================================================================");
					System.out.println("su jubilacion/pension entra en la cuarta Franja");

				}

				if (precioFranja1I < 0) {

					System.out.println("su total a pagar es: 0 (No debe pagar IASS)");
				} else if (precioFranja2I < 0) {
					System.out.println(" su total a pagar es: 0 (No debe pagar IASS)");
				} else if (precioFranja3I < 0) {
					System.out.println("su total a pagar es: 0 (No debe Pagar IASS)");
				} else if (precioFranja4I < 0) {
					System.out.println("su total a pagar es: 0 (No debe pagar IASS)");

				} else if (jubilacionPension > techoPrimeraFranjaIass && jubilacionPension < pisoTerceraFranjaIass) {

					System.out.println("debe pagar: ");

					System.err.println(precioFranja2I * 0.06);

				} else if (jubilacionPension > techoSegundaFranjaIass && jubilacionPension < pisoCuartaFranjaIass) {

					System.out.println("debe pagar: ");

					System.err.println(terceraFranjaIASSCuenta + precioFranja3I * 0.24);

				} else if (jubilacionPension > techoTerceraFranjaIass) {

					System.out.println("debe pagar: ");

					System.err.println(cuartaFranjaIASSCuenta + precioFranja4I * 0.30);

				}

				break;

			}

			case 3: {

				System.out.println("==========================================================================");
				System.out.println("ingrese su sueldo nominal: ");
				System.out.println("==========================================================================");
				double sueldoNominalF = lector.nextDouble();
				System.out.println("==========================================================================");
				System.out.println("ingrese el numero de menores a cargo: ");
				System.out.println("==========================================================================");

				menoresACargoFonasa = lector.nextInt();

				System.out.println("==========================================================================");
				System.out.println("ingrese su aguinaldo nominal");
				System.out.println("==========================================================================");
				double aguinaldo = lector.nextDouble();
				System.out.println("==========================================================================");
				System.out.println("tiene un conyugue o concubino a cargo? ingrese 1 si tiene o 0 si no tiene");
				System.out.println("==========================================================================");

				int COCBAC = lector.nextInt();

				if (sueldoNominalF <= 0) {

					System.out.println("==========================================================================");
					System.out.println("No debe pagar el FONASA");

				} else {

					if (sueldoNominalF <= fonasaMin) {

						if (COCBAC == 1) {

							ConyugeACargoFonasa = 0.02;

							mostrarPorcentaje = 5;

							double hasta2Pago = aporteBasico + ConyugeACargoFonasa;

							System.out.println(
									"==========================================================================");
							System.out.println("debe pagar por el sueldo nominal: " + (sueldoNominalF * hasta2Pago));
							System.out.println("su porcentaje aplicado es: " + mostrarPorcentaje + "%");

						} else {

							ConyugeACargoFonasa = 0.00;

							mostrarPorcentaje = 3;

							double hasta2Pago = aporteBasico + ConyugeACargoFonasa;

							System.out.println(
									"==========================================================================");
							System.err.println("debe pagar por el sueldo nominal: " + (sueldoNominalF * hasta2Pago));
							System.out.println(" su porcentaje aplicado es: " + mostrarPorcentaje + "%");

						}

					} else if (sueldoNominalF >= fonasaMin) {

						if (COCBAC == 1 && menoresACargoFonasa == 0) {

							ConyugeACargoFonasa = 0.035;

							double mas2Pago = aporteBasico + ConyugeACargoFonasa;

							mostrarPorcentaje = 6.5;

							System.out.println(
									"==========================================================================");
							System.err.println("debe pagar por el sueldo nominal: " + (sueldoNominalF * mas2Pago));
							System.out.println("su porcentaje aplicado es: " + mostrarPorcentaje + "%");

						} else if (COCBAC == 1 && menoresACargoFonasa >= 1) {

							ConyugeACargoFonasa = 0.05;

							double mas2Pago = aporteBasico + ConyugeACargoFonasa;

							mostrarPorcentaje = 8;

							System.out.println(
									"==========================================================================");
							System.err.println("debe pagar por el sueldo nominal:" + (sueldoNominalF * mas2Pago));
							System.out.println("su porcentaje aplicado es: " + mostrarPorcentaje + "%");

						}

						if (COCBAC == 0 && menoresACargoFonasa == 0) {

							ConyugeACargoFonasa = 0.015;

							mostrarPorcentaje = 4.5;

							double mas2Pago = aporteBasico + ConyugeACargoFonasa;

							System.out.println(
									"==========================================================================");
							System.err.println("debe pagar por el sueldo nominal: " + (sueldoNominalF * mas2Pago));
							System.out.println("su porcentaje aplicado es: " + mostrarPorcentaje + "%");

						} else if (COCBAC == 0 && menoresACargoFonasa >= 1) {

							ConyugeACargoFonasa = 0.03;

							mostrarPorcentaje = 6;

							double mas2Pago = aporteBasico + ConyugeACargoFonasa;

							System.out.println(
									"==========================================================================");
							System.err.println("debe pagar por el sueldo nominal: " + (sueldoNominalF * mas2Pago));
							System.out.println("su porcentaje aplicado es: " + mostrarPorcentaje + "%");

						}

					}

				}

				if (aguinaldo <= 0) {

					System.out.println("==========================================================================");
					System.out.println("No debe pagar el FONASA");

				} else {

					if (aguinaldo <= fonasaMin) {

						if (COCBAC == 1) {

							ConyugeACargoFonasa = 0.02;

							double hasta2Pago = aporteBasico + ConyugeACargoFonasa;

							mostrarPorcentaje = 5;

							System.out.println(
									"==========================================================================");
							System.err.println("debe pagar por el aguinaldo: " + (aguinaldo * hasta2Pago));
							System.out.println("su porcentaje aplicado es: " + mostrarPorcentaje + "%");

						} else {

							ConyugeACargoFonasa = 0.00;

							double hasta2Pago = aporteBasico + ConyugeACargoFonasa;

							mostrarPorcentaje = 3;

							System.out.println(
									"==========================================================================");
							System.err.println("debe pagar por el aguinaldo: " + (aguinaldo * hasta2Pago));
							System.out.println("su porcentaje aplicado es: " + mostrarPorcentaje + "%");

						}

					} else if (aguinaldo >= fonasaMin) {

						if (COCBAC == 1 && menoresACargoFonasa == 0) {

							ConyugeACargoFonasa = 0.035;

							double mas2Pago = aporteBasico + ConyugeACargoFonasa;

							mostrarPorcentaje = 3.5;

							System.out.println(
									"==========================================================================");
							System.err.println("debe pagar por el aguinaldo: " + (aguinaldo * mas2Pago));
							System.out.println("su porcentaje aplicado es: " + mostrarPorcentaje + "%");

						} else if (COCBAC == 1 && menoresACargoFonasa >= 1) {

							ConyugeACargoFonasa = 0.05;

							double mas2Pago = aporteBasico + ConyugeACargoFonasa;

							mostrarPorcentaje = 8;

							System.out.println(
									"==========================================================================");
							System.err.println("debe pagar por el aguinaldo: " + (aguinaldo * mas2Pago));
							System.out.println("su porcentaje alicado es: " + mostrarPorcentaje + "%");

						}

						if (COCBAC == 0 && menoresACargoFonasa == 0) {

							ConyugeACargoFonasa = 0.015;

							double mas2Pago = aporteBasico + ConyugeACargoFonasa;

							mostrarPorcentaje = 4.5;

							System.out.println(

									"==========================================================================");
							System.err.println("debe pagar por el aguinaldo: " + (aguinaldo * mas2Pago));
							System.out.println("su orcentaje aplicado es: " + mostrarPorcentaje + "%");

						} else if (COCBAC == 0 && menoresACargoFonasa >= 1) {

							ConyugeACargoFonasa = 0.03;

							double mas2Pago = aporteBasico + ConyugeACargoFonasa;

							mostrarPorcentaje = 6;

							System.out.println(

									"==========================================================================");
							System.err.println("debe pagar por el aguinaldo: " + (aguinaldo * mas2Pago));
							System.out.println("debe pagar por el aguinaldo: " + mostrarPorcentaje + "%");

						}

					}

				}

				break;

			}

			case 4: {

				System.out.println("==========================================================================");
				System.out.println("ingrese su nombre ");
				System.out.println("==========================================================================");
				String nombre = lector.next();
				System.out.println("==========================================================================");
				System.out.println("ingrese su apellido ");
				System.out.println("==========================================================================");
				String apellido = lector.next();
				System.out.println("==========================================================================");
				System.out.println("ingrese su dia de nacimiento");
				System.out.println("==========================================================================");
				int diaNacido = lector.nextInt();
				System.out.println("==========================================================================");
				System.out.println("ingrese su mes de nacimiento (en numeros)");
				System.out.println("==========================================================================");
				int mesNacido = lector.nextInt();
				System.out.println("==========================================================================");
				System.out.println("ingrese su año de nacimiento");
				System.out.println("==========================================================================");
				int anioNacido = lector.nextInt();
				System.out.println("==========================================================================");
				System.out.println("ingrese su cedula (sin puntos ni guiones)");
				System.out.println("==========================================================================");
				String cedula = lector.next();
				System.out.println("==========================================================================");
				System.out.println("ingrese su serie de credencial");
				System.out.println("==========================================================================");
				String serieCredencial = lector.next();
				System.out.println("==========================================================================");
				System.out.println("ingrese el numero de su credencial");
				System.out.println("==========================================================================");
				int numeroCredencial = lector.nextInt();
				System.out.println("==========================================================================");
				System.out.println("ingrese su departamento(sin espacios)");
				System.out.println("==========================================================================");
				String departamento = lector.next();
				System.out.println("==========================================================================");
				System.out.println("ingrese su localidad (sin espacios)");
				System.out.println("==========================================================================");
				String localidad = lector.next();
				System.out.println("==========================================================================");
				System.out.println("ingrese su calle(sin espacios)");
				System.out.println("==========================================================================");
				String calle = lector.next();
				System.out.println("==========================================================================");
				System.out.println("ingrese su manzana");
				System.out.println("==========================================================================");
				String manzanaDomicilio = lector.next();
				System.out.println("==========================================================================");
				System.out.println("ingrese su solar");
                System.out.println("==========================================================================");				
				int solarDomicilio = lector.nextInt();
				System.out.println("==========================================================================");
				System.out.println("ingrese su sueldo nominal");
				System.out.println("==========================================================================");
				double sueldoNominalDJ = lector.nextDouble();
				System.out.println("==========================================================================");
				System.out.println("ingrese su estado civil");
				System.out.println("==========================================================================");
				String estadoCivil = lector.next();
				System.out.println("==========================================================================");

				System.out.println("¡Hola " + nombre + " " + apellido + "!");
				System.out.println("su cedula es: " + cedula);
				System.out.println("su credencial es: " + serieCredencial + " " + numeroCredencial);
				System.out.println("nacio el: " + diaNacido + "/" + mesNacido + "/" + anioNacido + " ");
				System.out.println("Tiene " + (anioActual - anioNacido) + " " + "años");
				System.out.println("vive en: ");
				System.out.println(departamento);
				System.out.println(localidad);
				System.out.println(calle);
				System.out.println("su manzana es: " + manzanaDomicilio);
				System.out.println("su solar es: " + solarDomicilio);
				System.out.println("usted es: " + estadoCivil);
				System.out.println("usted cobra: " + sueldoNominalDJ);

				break;

			}

			case 5: {

				System.out.println("Bienvenid@ al menu de ayuda");

				System.out.println(" ");

				System.out.println(" IRPF:");

				System.out.println(" ");

				System.out.println(

						"para calcular el IRPF debe presionar 1 en el menu inicial "

								+ "(el menu aparecera debjado de el menu de ayuda)");

				System.out.println("El programa pedira iniciar los datos nesesarios para calcular el impuesto");

				System.out.println("luego el programa devolvera el resultado del impuesto");

				System.out.println(" ");

				System.out.println(" IASS:");

				System.out.println(" ");

				System.out.println(

						"para calcular el IASS debe presionar 2 en el menu inicial "

								+ "(el menu aparecera debajo de el munu de ayuda)");

				System.out.println("el programa pedira iniciar los datos nesesarios para calcular el impuesto");

				System.out.println("luego el progrma devolvera el resultado del impuesto");

				System.out.println(" ");

				System.out.println(" FONASA:");

				System.out.println(" ");

				System.out.println(

						"para calcular el FONASA debe precionar 3 en el menu inicial "

								+ "(el menu aparecera debajo del menu de ayuda");

				System.out.println("el programa pedira iniciar los datos nesesarios para calcular el impuesto");

				System.out.println("luego el programa devolvera el resultado del impuesto");

				System.out.println(" ");

				System.out.println(" Declaracion Jurada:");

				System.out.println(" ");

				System.out.println(

						"para calcular la declaracion jurada debe presionar 4 en el munu inicial "

								+ "(el menu aparecera debajo del menu de ayuda");

				System.out.println("el programa pedira iniciar los datos nesessarios para calcular el impuesto");

				System.out.println("luego el programa devolvera el resultado del impuesto");

				System.out.println(" ");

				System.out.println(

						"para salir del programa presione 6 en el menu inicial "

								+ "( el menu aparecera debajo del menu de ayuda");

				System.out.println(" ");

				break;
			}

			}

		} while (opciones != 6);

	}

}