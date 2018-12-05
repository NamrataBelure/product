package product.scp.com;

import java.util.ArrayList;
import java.util.List;

import product.categorytest;

public class productTest implements category {
	List<product> listOfprod = new ArrayList<product>();
	private product pId;
	public boolean addCat(category vehical) {
		
		return listOfprod.add(pId);
	}

	public product getproduct(int pid) {
		for(int i=0;i<listOfprod.size();i++){
			product p = listOfprod.get(i);
			if(p.getPid()==pid){
				return p;
			}
		}
		return null;
	}


	public List<product> deleteproduct(int pid) {
		for(int i=0;i<listOfprod.size();i++){
			product p = listOfprod.get(i);
			if(p.getPid()==pid){
				listOfprod.remove(p);
				return listOfprod;
			}
		}
		return null;
	}
	public List<product> getallproduct() {
		// TODO Auto-generated method stub
		return listOfprod;
	}

	public boolean updateproduct(product prod) {
		if(null!=getproduct(prod.getPid())){
			for(int i=0;i<listOfprod.size();i++){
				product p = listOfprod.get(i);
				if(p.getPid()==prod.getPid()){
					p.setpName(prod.getpName());
					p.setpCat(prod.getpCat());
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean addCat(prodCat vehical) {
		// TODO Auto-generated method stub
		return false;
	}


}
