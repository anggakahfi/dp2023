//tiktaktu
#include <iostream>

using namespace std;
//Array
char pos[3][3] = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
//Variabel
int pilihan;
int baris,kolom;
char turn = 'X';
bool draw = false;



void papan(){

    cout<<"|"<<pos[0][0]<<"|"<<pos[0][1]<<"|"<<pos[0][2]<<"|"<<endl;	
	cout<<"|"<<pos[1][0]<<"|"<<pos[1][1]<<"|"<<pos[1][2]<<"|"<<endl;	
	cout<<"|"<<pos[2][0]<<"|"<<pos[2][1]<<"|"<<pos[2][2]<<"|"<<endl;
}

//Fungsi giliran

void giliran(){
    if(turn == 'X'){
        cout<<"giliran x : ";
    }
    else if(turn == 'O'){
        cout<<"giliran o : ";
    }
    cin>> pilihan;
    switch(pilihan){
        case 1: baris=0; kolom=0; break;
        case 2: baris=0; kolom=1; break;
        case 3: baris=0; kolom=2; break;
        case 4: baris=1; kolom=0; break;
        case 5: baris=1; kolom=1; break;
        case 6: baris=1; kolom=2; break;
        case 7: baris=2; kolom=0; break;
        case 8: baris=2; kolom=1; break;
        case 9: baris=2; kolom=2; break;
        default:
            cout<<"Invalid ";
    }

    if(turn == 'X' && pos[baris][kolom] != 'X' && pos[baris][kolom] != 'O'){
        //x ke o
        pos[baris][kolom] = 'X';
        turn = 'O';
    }else if(turn == 'O' && pos[baris][kolom] != 'X' && pos[baris][kolom] != 'O'){
        //o ke x 
        pos[baris][kolom] = 'O';
        turn = 'X';
    }else {
        //cell terisi
        cout<<"udah keisi";
        giliran();
    }
    
   
}

//Status game

bool gameover(){
    //cek menang segaris baris & kolom
    for(int i=0; i<3; i++)
    {
		if(pos[i][0] == pos[i][1] && pos[i][0] == pos[i][2] || pos[0][i] == pos[1][i] && pos[0][i] == pos[2][i])
		{
			return false;	
		}
	}
    

    //menang diagonal

    if(pos[0][0] == pos[1][1] && pos[0][0] == pos[2][2] || pos[0][2] == pos[1][1] && pos[0][2] == pos[2][0])
    {
    	return false;
	}

    //game lanjut
    for(int i=0; i<3; i++)
    {
    	for(int j=0; j<3; j++)
    	{
    		if(pos[i][j] != 'X' && pos[i][j] != 'O')
    		{
    			return true;
			}			
		}
	}

    

    //seri
    if(draw = true)
    {
		return false;
	}
}

//Program

int main()
{
    cout<<"tiktaktu"<<endl<<endl;
    
    while(gameover()){
        papan();
        giliran();
        gameover();
    }
    if(turn == 'X' && draw == false){
        cout<<"x menang"<<endl;
    }
    else if(turn == 'O' && draw == false){
        cout<<"o menang"<<endl;
    }
    else
    cout<<"seri";
} 


