#include <iostream>

using namespace std;
/// DECLARE VARIABLES
/// TYPE OF VARIABLE   VARIABLE_NAME;
int rate = 15;
float hours;
float gross;
float tax;

int main()
{

    cout << "Wages Calculation" << endl;
    cout << "Key in hours worked "  << endl;

    cin >> hours;

    /// FORMAT FOR CALCULATIONS
    /// RESULT_VARIABLE = VARIABLE1  * VARIABLE2;
    gross = hours * rate;

    cout << "Gross pay = "  << gross;



    return 0;
}
