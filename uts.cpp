#include <iostream>
using namespace std;

int main(){
    int nilai[5]; 

    //memasukkan nilai
    cout << "Masukkan nilai ke-1: ";
    cin >> nilai[0];

    cout << "Masukkan nilai ke-2: ";
    cin >> nilai[1];

    cout << "Masukkan nilai ke-3: ";
    cin >> nilai[2];

    cout << "Masukkan nilai ke-4: ";
    cin >> nilai[3];

    cout << "Masukkan nilai ke-5: ";
    cin >> nilai[4];

    //menghitung rata-rata nilai dengan penjumlahan dan pembagian
    double total = (nilai[0]+nilai[1]+nilai[2]+nilai[3]+nilai[4]) / 5.0;

    //menampilkan hasil rata-rata
    cout << "Rata-rata nilai: " << total;

}
