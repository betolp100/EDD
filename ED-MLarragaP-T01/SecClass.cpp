#include "stdafx.h"
#include "SecClass.h"
#include "FetchClass.h"
using namespace ::std;

SecClass::SecClass()

{

}


int SecClass::sFetch(int e) 
{
	return sFetch(myArray, e); 
}

int SecClass::sFetch(int  a[], int e)
{
	for (int i = 0; i < sizeof(a); i++)
	{
		if (a[i] == e) 
		{
			return i; //Returns the exact position where was found the number.
		}
	}
	return -1; //In case that the number does not exist, it returns nothing.
};
