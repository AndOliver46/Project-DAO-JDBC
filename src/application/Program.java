package application;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDAO sellerDAO = DaoFactory.createSellerDao();
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);

	}

}
