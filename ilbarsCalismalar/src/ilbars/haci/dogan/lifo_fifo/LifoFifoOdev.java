package ilbars.haci.dogan.lifo_fifo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class LifoFifoOdev {
	private Scanner klavye = new Scanner(System.in);
	private Queue<String> fifo = new LinkedList<String>();
	private Stack<String> lifo = new Stack<String>();
	private String girilecek = "";
	private int secim;

	public void veriGir() {

		System.out.println("Verileri gir i�in bitince cikis yaz!!!");
		while (!(girilecek.equals("cikis"))) {
			if (girilecek.equals("cikis")) {
				klavye.close();

			}

			System.out.print("Veri gir: ");
			girilecek = klavye.next();
			fifo.add(girilecek);
			lifo.push(girilecek);

		}
		lifoMuFifoMu();
	}

	public String ilkGirenIlkCikar() {

		System.out.println("\n\n");
		fifo.remove("cikis");
		System.out.println("FIFO\n" + "------------------------------------\n" + fifo);
		while (!(fifo.size() - 1 <= 0)) {

			fifo.remove();

			System.out.println(fifo);

		}
		return "\nilk giren ilk ��kt�!!!\n��kar�lacak bir �ey kalmad�!!! \n------------------------------------\n";

	}

	public void SonGirenIlkCikar() {
		lifo.remove("cikis");

		System.out.println("\n\n");
		System.out.println("LIFO\n" + "------------------------------------\n" + lifo);

		while (!(lifo.size() - 1 <= 0)) {

			lifo.pop();
			System.out.println(lifo);

		}
		System.out.println("son giren ilk ��kt�\n��kar�lacak bir �ey kalmad�!!!");
		System.out.println("------------------------------------");

	}

	public void lifoMuFifoMu() {
		System.out.print("Fifo i�in 1'e Lifo i�in 2'ye hepsi i�in 3'e bas:");
		secim = klavye.nextInt();
		if (secim == 1) {
			System.out.println(ilkGirenIlkCikar());
		} else if (secim == 2) {
			SonGirenIlkCikar();
		} else if (secim == 3) {
			SonGirenIlkCikar();
			System.out.println(ilkGirenIlkCikar());
		}
	}
}
