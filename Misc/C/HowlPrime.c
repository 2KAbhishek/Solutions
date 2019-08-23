/*A howling prime is a prime number whose digits add up to a prime number too
e.g - 113 : a prime number itself and 1+1+3=5 also prime*/


#include <stdio.h>
int IsPrime(int num);
int IsHowl(int num);
int main()
{
	int num,howl_flag=0,prime_flag=0,temp;
	printf("\n\t ***Program to check for Howling Primes***\n");
	printf("Enter the number to be checked\n-->");
	scanf("%d",&num);

	prime_flag=IsPrime(num);
	howl_flag=IsHowl(num);

	if (prime_flag==2&&howl_flag==2)
	{
		printf("\nThe number is a howling prime.\n");
	}
	if (prime_flag==2&&howl_flag!=2)
	{
		printf("\nThe number is prime but not howling prime.\n");
	}
	if (prime_flag!=2)
	{
		printf("The number is not prime\n");
	}
	return 0;
}


int IsPrime(int num)
{
	int count;
	for (count=2;count<num;count++)
	{
		if ((num%count)==0)
		{
			return 1;
			break;
		}

		if ((num%count)!=0)
		{
			return 2;
		}
	}
	return 0;
}

int IsHowl(int num)
{
	int sum=0,flag=0;
	while (num)
	{
		sum=sum+(num%10);
		num = num/10;
	}
	flag=IsPrime(sum);
	return flag;
}