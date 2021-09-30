#include <iostream>

using namespace std;
/// DECLARE VARIABLES
/// TYPE OF VARIABLE   VARIABLE_NAME;
int rate = 15;
float net_pay;
float hours;
float gross;
float tax;

int main()
{

    cout << "Wages Calculation" << endl;
    cout << "Key in hours worked " << endl;

    cin >> hours;

    // FORMAT FOR CALCULATIONS
    // RESULT_VARIABLE = VARIABLE1  * VARIABLE2;
    gross = hours * rate;
    cout << "Gross pay = " << gross << endl;

    if (gross <= 650)
    {
        tax = gross * .2;
    }
    else if (gross > 650)
    {
        // add smth here eventually
    }
    cout << "Tax = " << tax << endl;

    net_pay = gross - tax;
    cout << "Net pay = " << net_pay << endl;

    return 0;
}
