// Circulo.cpp: define el punto de entrada de la aplicación de consola.
//

#define _USE_MATH_DEFINES
#include "stdafx.h"
#include <iostream>
#include <math.h>

double radioC, perimetroC, areaC;

int main()
{
	class triangulo
	{
	public:  //Se crea el constructor para el circulo si tiene radio
		triangulo(double radio)
		{
			radioC = radio;
			perimetroC = radio*2*M_PI;
			areaC = radio*radio*M_PI;

		}
	public:  //Se crea el constructor para el circulo si no tiene radio
		triangulo()
		{
			radioC = NULL;
			perimetroC = NULL;
			areaC = NULL;
		}

		//Obtenemos el valor de la radio, perimetro y area
		double getRadio()
		{
			return radioC;
		}
		double getPerimetro()
		{
			return perimetroC;
		}
		double getArea()
		{
			return areaC;
		}


		//Ajustamos el valor de cada variable antes mencionada
		double setRadio(double radio)
		{
			radioC = radio;
		}
		double setPerimetro(double perimetro)
		{
			perimetroC = perimetro;
		}
		double setArea(double area)
		{
			areaC = area;
		}

	};
	return 0;
}