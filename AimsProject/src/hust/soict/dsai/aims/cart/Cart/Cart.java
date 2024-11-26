package hust.soict.dsai.aims.cart.Cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Cart {
	int qtyOrdered = 0;
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	public void UpdateQuantity(DigitalVideoDisc disc, int t) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemOrdered[i].getTitle().equals(disc.getTitle())) {
				itemOrdered[i].setQuantity(t);
			}
		}
	}// update so luong san pham trong gio hang

	public float totalcost() {
		int sum = 0;
		for (int i = 0; i < itemOrdered.length; i++) {
			sum += itemOrdered[i].getCost() * itemOrdered[i].getQuantity();
		}
		return sum;
	}// tinh tong tien trong gio hang

	public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if (qtyOrdered < 20) {
			itemOrdered[qtyOrdered] = disc1;
			qtyOrdered++;
			System.out.println("the disc has been added");
			if (qtyOrdered < 20) {
				itemOrdered[qtyOrdered] = disc2;
				System.out.println("the disc has been added");
				qtyOrdered++;
			} else {
				System.out.println("The cart is almost full");
			}

		} else
			System.out.println("The cart is almost full");
	}// them 1 sp vao gio hang

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < 20) {
			itemOrdered[qtyOrdered] = disc;
			System.out.println("the disc has been added");
			qtyOrdered++;
		} else
			System.out.println("The cart is almost full");
	}// them 1 sp vao gio hang

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int indexToRemove = -1;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemOrdered[i].getTitle().equals(disc.getTitle())) {
				indexToRemove = i;// tim vi tri cua san pham can xoa
			}

		}
		if (indexToRemove != -1) {
			for (int i = indexToRemove; i < qtyOrdered - 1; i++) {
				itemOrdered[i] = itemOrdered[i + 1];// xoa va don mang
			}
			itemOrdered[qtyOrdered] = null;
			qtyOrdered--;
			System.out.println("Remove Success");
		} else {
			System.out.println("Not found item");
		}

	}

	public void listDvd() {
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemOrdered[i].toString());// in ra danh sach san pham co trong don hang
		}
	}

	public void print() {
		System.out.println("***********************CART************************\nOrdered Items:");
		if (this.qtyOrdered == 0)
			System.out.println("No items in the cart");
		else {
			for (int i = 0; i < qtyOrdered; i++) {
				System.out.println(itemOrdered[i].toString());// in ra danh sach san pham co trong don hang
			}
		}
		System.out.println("***************************************************");
	}

	public void searchByid(int Id) {
		System.out.println("- The search by id " + Id + ":");
		boolean check = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (this.itemOrdered[i].isMatch(Id) == true) {
				check = true;
				System.out.println(this.itemOrdered[i].toString());
				break;
			}
		}
		if (check == false)
			System.out.println("Disc not found");
	}

	public void searchByTitle(String Title) {
		System.out.println("- The search by title [" + Title + "]:");
		boolean check = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (this.itemOrdered[i].isMatch(Title) == true) {
				check = true;
				System.out.println(this.itemOrdered[i].toString());
				break;
			}
		}
		if (check == false)
			System.out.println("Disc not found");
	}
}
