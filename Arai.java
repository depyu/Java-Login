// nama : devi nurjanah
// nim  : 17.83.0087

public class Arai {
    public static void main(String[] args) {
        
        // untuk array pertama (mahasiswa)
        String[] mahasiswa = {"Bangzul", "Salma", "Ade", "Syahrul", "Nunda", "Ahmad", "Rasyid", "Devi"};
        // untuk array kedua (team)
        String[] team = { "Team A", "Team A", "No Team", "Team B", "Team B", "Team A", "Team B", "No Team"};

        // untuk mengisi Array mahasiswa diatas
        for (int i = 0; i < mahasiswa.length; i++){
            // untuk memanggil baris array diatas
            System.out.println(mahasiswa[i] + " -> " + team[i]);
        }
    }
}