#include <iostream>
#include <cmath>
#include <string>
using namespace std;

int main()
{
	int number, base,count;
	string result = "";
	cin >> number;
	int s = number;
	base = (-10);
	int amount[count];
	while (number != 0)
	{
	    int i = number % base;
	    number /= base;
	    if (i < 0) 
	    {
	        i += abs(base);
	        number++;
	    }
	    result = result + to_string(i);
	    
	}
    
    cout << s << "(10) = ";
    for (int i = result.length()-1;i >=0;i--){
        cout<<result[i];
    }
	cout << "(-10)" << endl;
}
