package hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
	private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();

	public void addDVD(DigitalVideoDisc digitalVideoDisc) {
		if (itemsInStore.contains(digitalVideoDisc)) {
			System.out.println("[" + digitalVideoDisc.getTitle() + "] already exists in the store");
		} else {
			itemsInStore.add(digitalVideoDisc);
			System.out.println("[" + digitalVideoDisc.getTitle() + "] has been added to the store");
		}
	}

	public void removeDVD(DigitalVideoDisc digitalVideoDisc) {
		if (!itemsInStore.contains(digitalVideoDisc)) {
			System.out.println("[" + digitalVideoDisc.getTitle() + "] doesn't exists in the store");
		} else {
			itemsInStore.remove(digitalVideoDisc);
			System.out.println("[" + digitalVideoDisc.getTitle() + "] has been deleted from the store");
		}
	}
}
