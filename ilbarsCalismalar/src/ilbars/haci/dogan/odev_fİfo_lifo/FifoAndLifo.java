package ilbars.haci.dogan.odev_fÝfo_lifo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class FifoAndLifo {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		Queue<String> fifo = new LinkedList<String>();
		Queue<String> lifo = new LinkedList<String>();

		int secim;
		String girilen = "";
		while (!(girilen.equals("cikis"))) {
			if (girilen.equals("cikis")) {
				fifo.remove("cikis");
				lifo.remove("cikis");
				klavye.close();
			}
			System.out.print("Veri gir: ");
			girilen = klavye.next();
			fifo.add(girilen);
			lifo.add(girilen);

		}
		System.out.print("Fifo için 1'e Lifo için 2'ye hepsi için 3'e bas:");
		secim = klavye.nextInt();
		if (secim == 1) {
			ilkGirenIlkCikar(fifo);
		} else if (secim == 2) {
			sonGirenIlkCikar(lifo);
		} else if (secim == 3) {
			ilkGirenIlkCikar(fifo);
			sonGirenIlkCikar(lifo);

		}

	}

	public static void sonGirenIlkCikar(Queue<String> lifo) {

		lifo.remove("cikis");
		List<String> lifo2 = (List<String>) lifo;
		Collections.reverse(lifo2);
		System.out.println("\n\n");
		System.out.println("LIFO\n" + "------------------------------------\n" + lifo);
		while (!(lifo.size() - 1 <= 0)) {
			lifo.remove();
			System.out.println(lifo);

		}
		System.out.println("çýkarýlacak bir þey kalmadý!!!");
		System.out.println("------------------------------------");

	}

	public static void ilkGirenIlkCikar(Queue<String> fifo) {
		System.out.println("\n\n");
		fifo.remove("cikis");
		System.out.println("FIFO\n" + "------------------------------------\n" + fifo);
		while (!(fifo.size() - 1 <= 0)) {

			fifo.remove();

			System.out.println(fifo);

		}
		System.out.println("çýkarýlacak bir þey kalmadý!!!");
		System.out.println("------------------------------------\n");

	}

}
