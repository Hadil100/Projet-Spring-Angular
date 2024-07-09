package main;

public class Calculator {
public int evaluate(String expression)
{
int sum = 0;
for (String summand:
expression.split("\\+"))

sum += Integer.valueOf(summand);
return sum;
}
public int add(int a, int b) {
	return a+b;
}
public int substruct(int a, int b) {
	return a-b;
}
public int divide(int a, int b) {
	if(b==0) {
	throw new ArithmeticException("division par zero");
	}
	return a/b;
}
public int multiply(int a, int b) {
	return a*b;
}

}
