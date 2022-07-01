package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDAO sellerDAO = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDAO.findByDepartment(department);
		for (Seller x : list) {
			System.out.println(x);
		}

		System.out.println("\n=== TEST 3: seller findAll ===");
		list = sellerDAO.findAll();
		for (Seller x : list) {
			System.out.println(x);
		}

		System.out.println("\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDAO.insert(newSeller);
		System.out.println("Inserted, new Id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDAO.findById(1);
		seller.setName("Marta Wainer");
		sellerDAO.update(seller);
		System.out.println("Update complete");
	}
}
