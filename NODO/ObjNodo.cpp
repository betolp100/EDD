#include "stdafx.h"
#include "ObjNodo.h"

	ObjNodo::ObjNodo()
	{
		contenido = 0;
		siguiente = NULL;
	}
	ObjNodo::ObjNodo(int contenido, ObjNodo* siguiente)
	{
		contenido = contenido;
		siguiente = siguiente;
	}
	int ObjNodo::getContenido()
	{
		return contenido;
	}
	ObjNodo*ObjNodo::getSiguiente()
	{
		return siguiente;
	}

	void ObjNodo::setContenido(int contenido)
	{
		contenido = contenido;
	}

	void ObjNodo::setSiguiente(ObjNodo* siguiente)
	{
		siguiente = siguiente;
	}