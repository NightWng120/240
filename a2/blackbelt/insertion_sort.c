#include <stdio.h>
#define MAX 9
void printValues();
void sort();
void swap(int*, int*);
int values[100] = {7, 3, 9, 4, 6, 1, 2, 8, 5};

void main()
{

	printf("Here is a list of unsorted values\n");
	printf("Before: \n");
	printValues();
	sort();
	printf("After: \n");
	printValues();
	printf("Please enter an integer to be inserted into the array\n");











}



void printValues()
{
int i;	
	printf("[ ");
	
	for(i = 0; i < MAX; i++)
	{
		printf(" %d", values[i]);
	}
	printf(" ]\n");


}


void swap(int* x, int* j)
{
int temp;
	
	temp = *j;
	*j = *x;
	*x = temp;


}
void sort()
{
int x;
int i;
int j;


for(i = 0; i < MAX; i++)
{
	x = values[i];
	j = i - 1;
	while(j >= 0 && values[j] > x)
	{
		values[j + 1] = values[j];
		j--;
	}
	values[j + 1] = x;








}



}

