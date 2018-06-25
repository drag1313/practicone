package man;
/*
методы
add(product)
remove(name)
getAll() - возвращает все объекты хранилища
removeAll() - удаляет все объекты хранилища
Внутри ProductsManager хранится массив;
 */

    public class ProductManager {
Product[] items=new Product[5];



    public void add(String name,String price,String type) {

   int i=0;
    items[i]=new Product();
        items[i].setName(name);
        items[i].setPrice(price);
        items[i].setType(type);



        if (i<items.length) {
            i++;
        }else {
            System.out.println("Массив объектов полон");
        }

}


   public void removeAll(){
            for (int i = 0; i<items.length; i++){
            items[i]=null;
        }
        }
   public void remove(String name) {
        for (int i = 0; i < items.length; i++) {
           boolean k = name.equals(items[i].getName());
           if (k) {
               items[i] = null;
           }

       }
   }


}
