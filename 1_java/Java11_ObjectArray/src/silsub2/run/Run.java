package silsub2.run;

import silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
			Product pro = new Product();
			pro.setPName("������");
			pro.setPrice(120);
			pro.setBrand("���");
			
			System.out.println(pro.information());
		}
	}


