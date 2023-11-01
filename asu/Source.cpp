#include <iostream>

using namespace std;


int main() {
	int baris ;
	cout << "Masukkan jumlah baris : ";
	cin >> baris;
	for (int i = 1; i <= baris; i++) {
		for (int j = 1; j <= baris; j++) {
			cout << "|_|";
		}
		cout << endl;
	}
	return 0;
}