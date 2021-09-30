#include <iostream>

using namespace std;
float num1;
float num2;
float sum, product;
float difference, quotient;


int main()
{
    cout << "Calculations!" << endl;
    cout << "Key in a number " << endl;
    cin >> num1;
    cout << "Key in a number " << endl;
    cin >> num2;
    sum =  num1 + num2;
    product = num1 * num2;
     difference = num1 - num2;
     quotient = num1/num2;


    cout << "Sum = " << sum << endl;
    cout << "Product = " << product << endl;
    cout << "The difference = " << difference << endl;
    cout << "The quotient = " << quotient << endl;



    return 0;
}
