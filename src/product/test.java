package product;

import java.util.List;

import product.scp.com.categorytest;
import product.scp.com.product;

public interface test {

	  public boolean addCat(categorytest vehical);
		 public product getproduct(int pid);
		 public List<product> deleteproduct(int pid);
		 public List<product>getallproduct();
		 public boolean updateproduct(product product);

}
