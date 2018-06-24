package man;
/*
методы
add(product)
remove(name)
getAll() - возвращает все объекты хранилища
removeAll() - удаляет все объекты хранилища
Внутри ProductsManager хранится массив;
 */

import java.util.Scanner;

import static man.Product.*;

public class ProductManager {
Product[] items=new Product[5];



protected void add(String name,String price,String type) {
 items[0]=new Product();
   int z=0;
        items[z].setName(name);
        items[z].setPrice(price);
        items[z].setType(type);
        if (z<5) {
            z++;
        }else {
            System.out.println("Массив объектов полон");
        }

}

protected  void getAll() {
    for (int i = 0; i<5; i++){
        System.out.println(items[0]);
    }



}


}
