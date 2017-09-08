#pragma once

class ObjNodo
{
public:

	int contenido;
	ObjNodo* siguiente;

	ObjNodo();
	ObjNodo(int contenido, ObjNodo* siguiente);
	
	int getContenido();
	ObjNodo* getSiguiente();
	
	void setContenido(int contenido);
	void setSiguiente(ObjNodo* siguiente);
	
};