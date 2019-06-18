#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void printValues();
void sort();
void swap(int*, int*);
void insert();

int values[9];

void main()
{
	insert();
	printf("Before: \n");
	printValues();
	sort();
	printf("After: \n");
	printValues();

}



void printValues()
{
int i;	
	printf("[ ");
	
	for(i = 0; i < 9; i++)
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
int * ptr1, * ptr2;

	for(i = 0; i < 8; i++)
	{


		ptr1 = values;
		ptr2 = ptr1 + 1;
		for(j = 0; j < 8; j++)
		{
			
			

			if( *ptr1 > *ptr2)
			{
				swap(ptr1, ptr2);
				values[j] = *ptr1;
				values[j + 1] = *ptr2;
			}


		
			ptr1++;
			ptr2++;
		}

		printValues();			
	}




}
void insert()
{

int i;
	srand(time(0));
	for(i = 0; i < 9; i++)
	{
	values[i] = (rand()%10);
	}



}



























