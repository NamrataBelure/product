package product.scp.com;

import java.util.List;

public interface category {
	public boolean addCat(prodCat vehical);
	 public product getproduct(int pid);
	 public List<product> deleteproduct(int pid);
	 public List<product>getallproduct();
	 public boolean updateproduct(product product);

	
}
