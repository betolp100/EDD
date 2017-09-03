#include "stdafx.h"
#include "SortClass.h"


SortClass:: SortClass()
{

}

void SortClass:: selection(int  a[])//SELECTION ALGORYHTM
{
	int aux;
	for (int i = 0; i < sizeof(a)- 1; i++)
	{
		int m = i;
		for (int j = i + 1; j < sizeof(a); j++)
		{
			if (a[j] < a[m])
			{
				m = j;
			}
		}
		aux = a[i];  //Swap array positions
		a[i] = a[m];
		a[m] = aux;
	}
}

void SortClass::insertion(int  a[]) //INSERTION
{
	{
		int temp;
		for (int i = 0; i < sizeof(a) - 1; i++)
		{
			for (int j = i; j > 0; j--)
			{
				if (a[j] < a[j - 1])
				{
					temp = a[j]; //Swap array positions
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
	}
}

void SortClass::bubble(int  a[]) //BUBBLE
{
	int temp;
	for (int i = 0; i<sizeof(a) - 1; i++)
	{
		for (int j = 0; j<sizeof(a) - 1; j++)
		{
			if (a[j + 1]<a[j])
			{
				temp = a[j + 1];//swap array possitions
				a[j + 1] = a[j];
				a[j] = temp;
			}
		}
	}
}

void SortClass::quickSort(int  a[], int inti, int intf) //QUICKSORT
{
	int i, j, pivot, temp;
	int arr_size = sizeof(a) / sizeof(a[0]);
	i = inti; j = intf;
	pivot = a[inti];
	do
	{
		//Moves throughout the vector comparing the values with the pivot, moving one by one, forwards or backwards
		while (a[i] <= pivot && i<j)
		{
			i++;
		}
		while (a[j]>pivot)
		{
			j--;
		}
		if (i<j)
		{
			temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			i++; j--;
		}
	} while (i <= j);
	a[inti] = a[j];
	a[j] = pivot;

	//Uses recursivity to sort all of the values set by set
	if (inti<j - 1)
	{
		quickSort(a, inti, j - 1);
	}
	if (i < intf)
	{
		quickSort(a, j + 1, intf);
	}
}

void SortClass::mergeSort(int  a[], int ini, int fin) //Sorts the values in an array using the mergesort algorithm
{
	if (fin - ini == 0 || fin - ini == 1) //if the current evaluated list is of size 0 or 1, it means its already sorted.
	{

	}
	else
	{
		int pivot = (ini + fin) / 2;
		mergeSort(a, ini, pivot);
		mergeSort(a, pivot, fin);
		int p1 = ini;
		int p2 = pivot;
		int p3 = 0;
		//an auxiliary array is created to save the in-order lists.
		int size = fin - ini;
		int *atemp = new int[size];
		//Moves throughout the pivots and points, while checking the value of each point.
		while (p1<pivot || p2<fin)
		{
			if (p1<pivot && p2<fin)
			{
				if (a[p3++]<a[p2++])
				{
					atemp[p3++] = a[p1++]; //In case they're smaller, they're swapped. 
				}
				else
				{
					atemp[p3++] = a[p2++];
				}
			}
			else if (p1<pivot)
			{
				atemp[p3++] = atemp[p1++];
			}
			else
			{
				atemp[p3++] = atemp[p2++];
			}
		}
		for (int i = 0; i<fin - ini; i++)
		{
			a[ini + i] = atemp[i];
		}
	}
};