#include <iostream>
#include <iomanip>

using namespace std;
/// DECLARE VARIABLES
/// TYPE OF VARIABLE   VARIABLE_NAME;
float net_pay;
float hours;
float gross;
float tax;
int rate;

int main()
{

    cout << "Wages Calculation" << endl << endl;


    cout << "Enter amount of hours worked" << endl;
    cin >> hours;

    cout << "Enter hourly rate" << endl;
    cin >> rate;

    // FORMAT FOR CALCULATIONS
    // RESULT_VARIABLE = VARIABLE1  * VARIABLE2;
    gross = hours * rate;
    cout << "Gross Pay = " << fixed << setprecision(2) << gross << endl;

    if (gross <= 650)
    {
        tax = gross * .2;
    }
    else
    {
        tax = ((gross - 650) * .4) + 130;
    }
    cout << "PAYE" << fixed << setprecision(2) << setw(8) << " = " << tax << endl;

    net_pay = gross - tax;
    cout << "Net Pay" << fixed << setprecision(2) << setw(5) << " = " << net_pay << endl;

    return 0;
}
