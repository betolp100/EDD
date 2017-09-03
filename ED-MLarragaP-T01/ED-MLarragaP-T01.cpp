// ED-MLarragaP-T01.cpp: define el punto de entrada de la aplicación de consola.
//
#include "stdafx.h"
#include "SecClass.h"
#include "BinClass.h"
#include "SortClass.h"

using namespace std;

int main()
{
	int testArray[4] = {1,2,3,4};
	SecClass test = SecClass();
	BinClass test2 = BinClass();
	
	//SECUENCIAL
	test.setArray(test.RandArray(5));
	test.showArray();
	test.showFetch(test.sFetch(3));
	
	//BINARY
	test2.setArray(testArray);
	test2.showArray();
	test2.showFetch(test2.bFetch(45));
	
	
	return 0;
}