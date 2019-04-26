/**
 * @author : Ibnu Halim Mustofa
 * Program : Selection Sort and Binary Search
 */
 
import java.io.*;
 
public class SelectionBinary {
    
    public static void main(String[] args) throws IOException {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	
    	String cari;
    	int jml_data;
    	
    	// variabel untuk selection sort
    	String temp; int pos;
    	
    	// variabel untuk binary search
    	int bl = 0, br, bm, bketemu = 0;
    	
    	System.out.println("---------- Selection Sort and Binary Search ----------");
    	System.out.print("- Masukkan jumlah data : ");
    	jml_data = Integer.parseInt(in.readLine());
    	
    	String data[] = new String[jml_data];
    	br = data.length - 1;
    	
    	// Masukkan data ke dalam array
    	for (int i = 0; i < jml_data; i++) {
    		System.out.print("- Masukkan data ke-"+(i+1)+" : ");
    		data[i] = in.readLine();
    	}
    	
    	// Proses pengurutan
    	for (int i=0; i<data.length-1; i++) {
    		pos = i;
    		for (int j=i+1; j < data.length; j++) {
    			if (data[j].compareTo(data[pos]) < 0) {
    				pos = j;
    			}
    		}
    		
    		if (pos != i) {
    			temp = data[i];
    			data[i] = data[pos];
    			data[pos] = temp;
    		}
    	}
    	
    	
    	// Proses Pencarian
    	System.out.print("\n- Masukkan data yang dicari : ");
    	cari = in.readLine();
    	
    	while ((bl <= br) && (bketemu == 0)) {
    		bm = (bl + br) / 2;
    		
    		if (data[bm].equals(cari)) {
    			bketemu = 1;
    		} else if (cari.compareTo(data[bm]) < 0) {
    			br = bl - 1;
    		} else {
    			bl = bm + 1;
    		}
    	}
    	
    	System.out.println("\n------------------------------");
    	System.out.println("----------- Hasil ------------\n");
    	
    	// Cetak hasil pengurutan
    	for (int i = 0; i < jml_data; i++) {
    		System.out.println(data[i]);
    	}
    	
    	System.out.println();
    	
    	if (bketemu == 1) {
    		System.out.print("Data \""+cari+"\" ditemukan");
    	} else {
    		System.out.print("Data tidak ditemukan");
    	}
    }
}
