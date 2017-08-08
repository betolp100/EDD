// Triángulo.cpp: define el punto de entrada de la aplicación de consola.
//

#include "stdafx.h"
#include <iostream>

double baseT, alturaT, hipotenusaT, senT, csenT, tanT, perimetroT, areaT;


int main()
{
	class triangulo
	{
	public:  //Se crea el constructor para el triangulo si tiene 3 lados
		triangulo(double base, double altura, double hipotenusa, double sen, double csen, double tan, double perimetro, double area)
		{
			baseT = base;
			alturaT = altura;
			hipotenusaT = hipotenusa;
			senT = hipotenusa / altura;
			csenT = hipotenusa / base;
			tanT = altura / base;
			perimetroT = base*3;
			areaT = base*altura / 2;
		}
	public:  //Se crea el constructor para el triangulo, pero si este no tiene un lado, no podra ser un triangulo, por lo que es NULL
		triangulo()
		{
			baseT = NULL;
			alturaT = NULL;
			hipotenusaT = NULL;
			senT = NULL;
			csenT = NULL;
			tanT = NULL;
			perimetroT = NULL;
		}

		//Obtenemos el valor de la base, altura, hipotenusa, seno, coseno, tangente, perimetro y area
		double getBase()
		{
			return baseT;
		}

		double getAltura()
		{
			return alturaT;
		}
		
		double getHipotenusa()
		{
			return hipotenusaT;
		}
		double getSeno()
		{
			return senT;
		}
		double getCsen()
		{
			return csenT;
		}
		double getTan()
		{
			return tanT;
		}
		double getPerimetro()
		{
		return perimetroT;
		}
		double getArea()
		{
			return areaT;
		}
		


		//Ajustamos el valor de cada variable antes mencionada
		double setBase(double base)
		{
			baseT= base;
		}
		double setAltura(double altura)
		{
			alturaT = altura;
		}
		double setHipotenusa(double hipotenusa)
		{
			hipotenusaT = hipotenusa;
		}
		double setSen(double sen)
		{
			senT = sen;
		}
		double setCsen(double csen)
		{
			csenT = csen;
		}
		double setTan(double tan)
		{
			tanT = tan;
		}
		double setPerimetro(double perimetro)
		{
			perimetroT = perimetro;
		}
		double setArea(double area)
		{
			areaT = area;
		}

	};
	return 0;
}