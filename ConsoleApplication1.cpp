// ConsoleApplication1.cpp: define el punto de entrada de la aplicación de consola.
//

#include "stdafx.h"
#include "iostream"
#include "string"


int x, y, z;
std::string(dimension);


int main()
{
	class punto 
	{
	public:  //Se crea constructor para figura en 3 dimensiones
		punto(int coorx, int coory, int coorz)
		{
			x			=		coorx;
			y			=		coory;
			z			=		coorz;
			dimension	=		"3 dimensiones";
		}
		//Se crea constructor para figura en 2 dimensiones
		punto(int coorx, int coory)
		{
			x			=		coorx;
			y			=		coory;
			z			=		 0;
			dimension	=		"2 dimensiones";
		}
		//Se crea constructor para figura en 1 dimension
		punto (int coorx)
		{
			x			=		coorx;
			y			=		0;
			z			=		0;
			dimension	=		"1 dimension";
		}
		//Se crea la figura en el origen
		punto() 
		{
			x			=		0;
			y			=		0;
			z			=		0;
			dimension	=		"0 dimensiones, se encuentra en el origen";
		}

		//Obtenemos el valor x de la figura
		int getx() 
		{
			return x;
		}
		//Obtenemos el valor y de la figura
		int gety()
		{
			return y;
		}
		//Obtenemos el valor z de la figura
		int getz() 
		{
			return z;
		}


		//Tomamos el valor de x e igualamos al valor del parametro.
		void setx(int coorx) 
		{
			x = coorx;
		}
		//Tomamos el valor de y e igualamos al valor del parametro.
		void sety(int coory)
		{
			y = coory;
		}
		//Tomamos el valor de z e igualamos al valor del parametro.
		void setz(int coorz)
		{
			z= coorz;
		}



	};
	return 0;
}

