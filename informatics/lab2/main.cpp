#include <bits/stdc++.h>
using namespace std;

int main() {
	int bit[7];
	int summa(0), r1, r2, r3, n(0), s1, s2, s3;
	long long s;
	cin >> s;
	for (int i=6;i>=0;i--){
	bit[i] = (s%2);
	s = s/10;
	}
	for (int i=0;i<7;i=i+2)
	summa = summa + bit[i];
	s1 = summa%2;
	summa = 0;
	s2 = (bit[1]+bit[2]+bit[5]+bit[6])%2;
	s3 = (bit[3]+bit[4]+bit[5]+bit[6])%2;
	if (s1!=0 || s2!= 0 || s3!=0) {
	if (s1!=0) summa = summa + 1;
	if (s2!=0) summa = summa + 2;
	if (s3!=0) summa = summa + 4;
	cout << "wrong bit under the number - " << summa;
	if ( bit[summa-1] == 1) bit[summa-1] = 0;
	else bit[summa-1] = 1;
	}
	else cout << "all right!";
	cout << endl << "the correct message - ";
	for (int i=0;i<7;i++)
	cout << bit[i];
	cout << endl << "information bits only - ";
	cout << bit[2] << bit[4] << bit[5] << bit[6] << endl;
}
