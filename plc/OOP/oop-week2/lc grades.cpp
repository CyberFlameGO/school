#include <iostream>

using namespace std;

bool higher = false;
string input;
float mark;

int main()
{
    cout << "Use Higher Level Grades? Enter 'yes' or 'no':" << endl;
    cin >> input;
    if (input == "yes")
    {
        cout << "Using Higher Level Grades..." << endl;
        higher = true;
    }

    cout << "Enter a Leaving Certificate subject grade" << endl;
    cin >> mark;

    // 0 is technically valid but it's also what we get if invalid input is given
    if (mark == 0 || mark > 100) 
    {
        cout << "Grade is not valid!" << endl;
        return 0;
    }

    if (mark >= 90)
    {
        cout << (higher ? "Grade = H1" : "Grade = O1") << endl;
    } else if (mark >= 80)
    {
        cout << (higher ? "Grade = H2" : "Grade = O2") << endl;
    } else if (mark >= 70)
    {
        cout << (higher ? "Grade = H3" : "Grade = O4") << endl;
    } else if (mark >= 60)
    {
        cout << (higher ? "Grade = H4" : "Grade = O4") << endl;
    } else if (mark >= 50)
    {
        cout << (higher ? "Grade = H5" : "Grade = O5") << endl;
    } else if (mark >= 40)
    {
        cout << (higher ? "Grade = H6" : "Grade = O6") << endl;
    } else if (mark >= 30)
    {
        cout << (higher ? "Grade = H7" : "Grade = O7") << endl;
    } else
    {
        cout << (higher ? "Grade = H8" : "Grade = O8") << endl;
    }

    return 0;
}