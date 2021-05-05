package JavaKampı.Homework4_2.Concrete;

import JavaKampı.Homework4_2.Abstracts.ISaleService;
import JavaKampı.Homework4_2.Entities.Sale;

public class SaleManagement implements ISaleService {
    @Override
    public void add(Sale sale) {
        System.out.println("A sale id: "+ sale.getSaleId() +" has been added "+ "\nA sale price "+ sale.getSalePrice() +" has been added" );
    }

    @Override
    public void delete(Sale sale) {
        System.out.println("A sale id: "+ sale.getSaleId() +" has been added "+ "\nA sale price "+ sale.getSalePrice() +" has been deleted" );
    }

    @Override
    public void update(Sale sale) {
        System.out.println("A sale id: "+ sale.getSaleId() +" has been added "+ "\nA sale price "+ sale.getSalePrice() +" has been updated" );
    }
}
